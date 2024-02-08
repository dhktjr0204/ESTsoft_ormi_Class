package weekly3;

public class PersonalContact extends Contact{
    private String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    public String getRelationship() {
        return relationship;
    }
    @Override
    public void displayContacts(){
        System.out.println("이름:" + getName()
                + ", 전화번호:" + getPhoneNumber()
                + ", 관계:" + getRelationship());
    }

}
