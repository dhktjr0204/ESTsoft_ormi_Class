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

    @Override
    public void displayContacts(){
        System.out.println("이름:" + getName()
                + ", 전화번호:" + getPhoneNumber()
                + ", 회사명:" + getCompany());
    }

}
