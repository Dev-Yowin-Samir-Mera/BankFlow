package domain;

public enum CustomerType {

    NATURAL_PERSON("Persona Natural", 2),
    LEGAL_ENTITY("Persona Juridica",1);

    String description;
    int id;

    CustomerType(String description, int id) {
        this.description = description;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }
}
