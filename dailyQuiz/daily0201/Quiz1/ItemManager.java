package daily0201.Quiz1;

public class ItemManager {
    public static void main(String[] args) {
        Book book = new Book(1,"노르웨이의 숲",7500, "무라카미 하루키","N1000");
        Album album = new Album(2, "Love wins all", 30000, "아이유");
        Movie movie = new Movie(3, "기생충", 12000, "봉준호", "박소담");

        book.print();
        album.print();
        movie.print();
    }
}
