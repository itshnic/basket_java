package model;

abstract public class Product {
    protected String type;
    protected String description;

    public Product(String type, String description) {
        this.type = type;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
