package model;

public class Attribute {
    private String name;
    private String value;

    public Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
