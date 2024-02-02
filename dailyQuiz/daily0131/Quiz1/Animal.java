package daily0131.Quiz1;

public class Animal {
    private String name;
    private final String species;

    public Animal(String species){
        this.species=species;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    String sleep(){
        return getName()+"이 잠자고 있습니다.";
    }
}
