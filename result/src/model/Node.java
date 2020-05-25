package model;

import java.util.*;

public class Node {
    private String name;
    private Set<Node> children;
    private Set<Attribute> attributes;

    public Node(String name) {
        this.name = name;
        children = new HashSet<>();
        attributes = new HashSet<>();
    }

    public Node add(Node child) {
        children.add(child);
        return this;
    }

    public Node add(Attribute attr) {
        attributes.add(attr);
        return this;
    }

    public Node remove(Node child) {
        children.remove(child);
        return this;
    }

    public Node remove(Attribute attr) {
        attributes.remove(attr);
        return this;
    }

    public boolean contain(Node child) {
        return children.contains(child);
    }

    public boolean contain(Attribute attr) {
        return attributes.contains(attr);
    }

    public Set<Node> getNodes() {
        return children;
    }

    public Set<Attribute> getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", children=" + children +
                ", attributes=" + attributes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(name, node.name) &&
                Objects.equals(children, node.children) &&
                Objects.equals(attributes, node.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, children, attributes);
    }

}
