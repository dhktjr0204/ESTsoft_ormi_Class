package weekly3;

public class BuisinessContact extends Contact{
    private String company;

    public BuisinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

}
