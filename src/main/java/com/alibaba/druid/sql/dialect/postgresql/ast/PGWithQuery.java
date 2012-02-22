package com.alibaba.druid.sql.dialect.postgresql.ast;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.druid.sql.ast.SQLExpr;
import com.alibaba.druid.sql.ast.statement.SQLSelectQuery;
import com.alibaba.druid.sql.dialect.postgresql.visitor.PGASTVisitor;

public class PGWithQuery extends PGSQLObjectImpl {
	private static final long serialVersionUID = 1L;
	private SQLExpr name;
	private final List<SQLExpr> columns = new ArrayList<SQLExpr>();
	private SQLSelectQuery subQuery;

	public SQLExpr getName() {
		return name;
	}

	public void setName(SQLExpr name) {
		this.name = name;
	}

	public SQLSelectQuery getSubQuery() {
		return subQuery;
	}

	public void setSubQuery(SQLSelectQuery subQuery) {
		this.subQuery = subQuery;
	}

	public List<SQLExpr> getColumns() {
		return columns;
	}

	@Override
	public void accept0(PGASTVisitor visitor) {
		if (visitor.visit(this)) {
			acceptChild(visitor, name);
			acceptChild(visitor, columns);
			acceptChild(visitor, subQuery);
		}
		visitor.endVisit(this);
	}
}