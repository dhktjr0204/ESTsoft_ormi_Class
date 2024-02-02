package daily0201.Quiz1;

public class Book extends Item{
    private String author;
    private String ISBN;

    public Book(int id, String name, int price, String author, String ISBN){
        super(id,name,price);
        this.author=author;
        this.ISBN=ISBN;
    }
    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }
    public void print(){
        System.out.println(getName()+", 작가:"+author+", 가격:"+getPrice());
    }
}
