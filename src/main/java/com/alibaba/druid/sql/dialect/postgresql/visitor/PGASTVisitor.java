package com.alibaba.druid.sql.dialect.postgresql.visitor;

import com.alibaba.druid.sql.dialect.postgresql.ast.PGCurrentOfExpr;
import com.alibaba.druid.sql.dialect.postgresql.ast.PGDeleteStatement;
import com.alibaba.druid.sql.dialect.postgresql.ast.PGSelectQueryBlock;
import com.alibaba.druid.sql.dialect.postgresql.ast.PGTruncateStatement;
import com.alibaba.druid.sql.dialect.postgresql.ast.PGWithClause;
import com.alibaba.druid.sql.dialect.postgresql.ast.PGWithQuery;
import com.alibaba.druid.sql.visitor.SQLASTVisitor;

public interface PGASTVisitor extends SQLASTVisitor {

    void endVisit(PGSelectQueryBlock.WindowClause x);

    boolean visit(PGSelectQueryBlock.WindowClause x);

    void endVisit(PGSelectQueryBlock.FetchClause x);

    boolean visit(PGSelectQueryBlock.FetchClause x);

    void endVisit(PGSelectQueryBlock.ForClause x);

    boolean visit(PGSelectQueryBlock.ForClause x);

    void endVisit(PGWithQuery x);

    boolean visit(PGWithQuery x);

    void endVisit(PGWithClause x);

    boolean visit(PGWithClause x);

    void endVisit(PGSelectQueryBlock.IntoClause x);

    boolean visit(PGSelectQueryBlock.IntoClause x);

    void endVisit(PGTruncateStatement x);

    boolean visit(PGTruncateStatement x);
    
    void endVisit(PGDeleteStatement x);
    
    boolean visit(PGDeleteStatement x);
    
    void endVisit(PGCurrentOfExpr x);
    
    boolean visit(PGCurrentOfExpr x);
}
