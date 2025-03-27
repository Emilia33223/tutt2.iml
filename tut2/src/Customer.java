package src;

public class Customer {
    public int id;
    public String firstName;
    public String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isLoyalCustomer() {
        return isLoyalCustomer;
    }

    public void setLoyalCustomer(boolean loyalCustomer) {
        isLoyalCustomer = loyalCustomer;
    }

    private String email;
    private boolean isLoyalCustomer;

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Loyal src.Customer: " + isLoyalCustomer);

    }
}
