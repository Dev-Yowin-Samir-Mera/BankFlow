package domain;

public class Customer extends Person {

    private long identificationType;
    private String identification;
    private String identificationDescription;

    public Customer(String name, String lastName, int age, long identificationType, String identification, String identificationDescription) {
        super(name, lastName, age);
        this.identificationType = identificationType;
        this.identification = identification;
        this.identificationDescription = identificationDescription;
    }

    public long getIdentificationType() {
        return identificationType;
    }

    public String getIdentification() {
        return identification;
    }

    public String getIdentificationDescription() {
        return identificationDescription;
    }
}
