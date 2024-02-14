package weekly3.solutions;

public class Contact{
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String toString(){
        return String.format("이름:%s 전화번호:%s",this.getName(),this.getPhoneNumber());
    }
}
