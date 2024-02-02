package daily0201.Quiz1;

public class Movie extends Item{
    String director;
    String actor;
    public Movie(int id, String name, int price, String director,String actor){
        super(id,name,price);
        this.director=director;
        this.actor=actor;
    }

    public String getDirector() {
        return director;
    }

    public String getActor() {
        return actor;
    }

    public void print(){
        System.out.println(getName()+", 감독:"+director+", 가격:"+getPrice());
    }
}
