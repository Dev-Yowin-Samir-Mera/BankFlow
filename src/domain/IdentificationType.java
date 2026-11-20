package domain;

public enum IdentificationType {

    ID("ID", 12);

    String description;
    long type;

   private IdentificationType(String description, long type) {
        this.description = description;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public long getType() {
        return type;
    }
}
