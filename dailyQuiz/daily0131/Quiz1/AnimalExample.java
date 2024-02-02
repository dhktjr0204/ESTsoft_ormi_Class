package daily0131.Quiz1;

public class AnimalExample {
    public static void main(String[] args) {
        Animal animal = new Animal("dog");
        animal.setName("흰눈이");
        System.out.println(animal.getName());
        System.out.println(animal.sleep());
    }
}
