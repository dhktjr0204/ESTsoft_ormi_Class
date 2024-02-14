package weekly3.solutions;

public class BuisinessContact extends Contact {
    private String company;

    public BuisinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return String.format("%s, 회사:%s",super.toString(),this.company);
    }
}
