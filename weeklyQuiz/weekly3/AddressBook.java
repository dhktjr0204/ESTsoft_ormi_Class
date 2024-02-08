package weekly3;

import java.util.*;

public class AddressBook {
    public static List<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            printOptions();
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    addBusinessContatct(sc);
                    break;
                case 2:
                    addPersonalContact(sc);
                    break;
                case 3:
                    displayContacts();
                    break;
                case 4:
                    System.out.print("검색할 이름을 입력하세요.");
                    String name = sc.next();
                    searchContacts(name);
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력해주세요.");

            }
        }
    }

    public static void printOptions(){
        System.out.println("1. 비지니스 연락처 추가");
        System.out.println("2. 개인 연락처 추가");
        System.out.println("3. 연락처 출력");
        System.out.println("4. 연락처 검색");
        System.out.println("5. 종료");
        System.out.print("메뉴를 선택해주세요:");
    }

    public static void addBusinessContatct(Scanner sc) {
        System.out.print("이름을 입력하세요:");
        String name = sc.next();
        System.out.print("전화번호를 입력하세요:");
        String tele = sc.next();
        System.out.print("회사명을 입력하세요:");
        String company = sc.next();
        contacts.add(new BuisinessContact(name, tele, company));

        System.out.println("비지니스 연락처가 추가되었습니다.\n");
    }

    public static void addPersonalContact(Scanner sc) {
        System.out.print("이름을 입력하세요: ");
        String name = sc.next();
        System.out.print("전화번호를 입력하세요: ");
        String tele = sc.next();
        System.out.print("관계를 입력하세요: ");
        String relationship = sc.next();

        PersonalContact personalContact = new PersonalContact(name, tele, relationship);
        contacts.add(personalContact);

        System.out.println("개인 연락처가 추가되었습니다.\n");
    }

    public static void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.\n");
            return;
        }
        for (Contact contact : contacts) {
            if (contact instanceof BuisinessContact) {
                BuisinessContact buisinessContact = (BuisinessContact) contact;
                System.out.println("이름:" + buisinessContact.getName()
                        + ", 전화번호:" + buisinessContact.getPhoneNumber()
                        + ", 회사명:" + buisinessContact.getCompany());
            } else if (contact instanceof PersonalContact) {
                PersonalContact personalContact = (PersonalContact) contact;
                System.out.println("이름:" + personalContact.getName()
                        + ", 전화번호:" + personalContact.getPhoneNumber()
                        + ", 관계:" + personalContact.getRelationship());
            }
        }
    }

    public static void searchContacts(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                if (contact instanceof BuisinessContact) {
                    BuisinessContact buisinessContact = (BuisinessContact) contact;
                    System.out.println("이름:" + buisinessContact.getName()
                            + ", 전화번호:" + buisinessContact.getPhoneNumber()
                            + ", 회사명:" + buisinessContact.getCompany());
                }else if(contact instanceof PersonalContact){
                    PersonalContact personalContact = (PersonalContact) contact;
                    System.out.println("이름:" + personalContact.getName()
                            + ", 전화번호:" + personalContact.getPhoneNumber()
                            + ", 관계:" + personalContact.getRelationship());
                }
                return;
            }
        }
        System.out.println("연락처를 찾을 수 없습니다.\n");
    }
}
