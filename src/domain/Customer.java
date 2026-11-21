package domain;

public class Customer {

    private String name;
    private String lastName;
    private long age;
    private IdentificationType identificationType;
    private String identification;
    private CustomerType customerType;

    public Customer(String name, String lastName, long age, IdentificationType identificationType, String identification, CustomerType customerType) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.identificationType = identificationType;
        this.identification = identification;
        this.customerType = customerType;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public long getAge() {
        return age;
    }

    public IdentificationType getIdentificationType() {
        return identificationType;
    }

    public String getIdentification() {
        return identification;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", identificationType=" + identificationType +
                ", identification='" + identification + '\'' +
                ", customerType=" + customerType +
                '}';
    }
}
