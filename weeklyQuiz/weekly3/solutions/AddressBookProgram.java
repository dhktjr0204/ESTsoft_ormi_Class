package weekly3.solutions;

import java.util.Scanner;

public class AddressBookProgram {
    static AddressBook addressBook = new AddressBook();

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
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
                        addressBook.displayContact();
                        break;
                    case 4:
                        System.out.print("검색할 이름을 입력하세요.");
                        String name = sc.next();
                        addressBook.searchContact(name);
                        break;
                    case 5:
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    default:
                        System.out.println("잘못된 선택입니다. 다시 입력해주세요.");

                }
            }
        }
    }

    public static void printOptions() {
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
        addressBook.addContancts(new BuisinessContact(name, tele, company));

        System.out.println("비지니스 연락처가 추가되었습니다.\n");
    }

    public static void addPersonalContact(Scanner sc) {
        System.out.print("이름을 입력하세요: ");
        String name = sc.next();
        System.out.print("전화번호를 입력하세요: ");
        String tele = sc.next();
        System.out.print("관계를 입력하세요: ");
        String relationship = sc.next();

        addressBook.addContancts(new PersonalContact(name, tele, relationship));

        System.out.println("개인 연락처가 추가되었습니다.\n");
    }

}
