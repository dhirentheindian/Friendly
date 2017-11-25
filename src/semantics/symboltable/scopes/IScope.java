package semantics.symboltable.scopes;

import semantics.representations.MobiValue;

public interface IScope {

    public abstract MobiValue searchVariableIncludingLocal(String identifier);
    public abstract boolean isParent();
}
