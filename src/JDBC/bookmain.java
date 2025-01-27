package JDBC;

public class bookmain {
    public static void main(String[] args) {
        String[][] books = {
                {"The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "10.99", "1925-04-10"},
                {"To Kill a Mockingbird", "Harper Lee", "Fiction", "7.99", "1960-07-11"}
        };
       InsertBooklish book = new InsertBooklish();
       book.insertDummyBook(books);
    }
}