package org.commonmark.node;

public class Code extends Node {

    private String literal;

    @Override
    public Type getType() {
        return Type.Code;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getLiteral() {
        return literal;
    }

    public void setLiteral(String literal) {
        this.literal = literal;
    }
}