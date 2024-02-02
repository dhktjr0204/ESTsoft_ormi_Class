package daily0201.Quiz1;

public class Album extends Item{
    private String artist;
    public Album(int id, String name, int price, String artist){
        super(id,name,price);
        this.artist=artist;
    }

    public String getArtist() {
        return artist;
    }

    public void print(){
        System.out.println(getName()+", 작곡가:"+artist+", 가격:"+getPrice());
    }
}
