package semantics.mapping;

import antlr.FRIENDLYParser.*;
import semantics.representations.MobiValue;

public interface IValueMapper {

    public abstract void analyze(ExpressionContext exprCtx);
    public abstract void analyze(ParExpressionContext exprCtx);
    public abstract String getOriginalExp();
    public abstract String getModifiedExp();
    public abstract MobiValue getMobiValue();

}