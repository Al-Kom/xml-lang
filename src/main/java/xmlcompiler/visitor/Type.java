package xmlcompiler.visitor;

public enum Type {
    NODE("Node"),
    ATTRIBUTE ("Attribute"),
    VOID("Void");

    private String type;

    Type(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    static Type getTypeByString(String type){
        switch (type){
            case "Node":
                return NODE;
            case "Attribute":
                return ATTRIBUTE;
            default:
                return VOID;
        }
    }
}