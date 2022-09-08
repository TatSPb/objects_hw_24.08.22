
public class Main {

    public static void main(String[] args) {
        String author1 = String.valueOf(new Author ("Иван", "Первый"));
        var author2 = new Author ("Игорь", "Второй");
        var author3 = new Author ("Елена", "Третья");

        //Author newAuthor = new Author ("Иван", "Петров");
        var newBook1 = new Book("Про 2000й", author1, 2000);
        var newBook2 = new Book("Про 2010й", author1, 2010);
        var newBook3 = new Book("Про 2020й", author1, 2020);

        System.out.println("Книга 1: " + newBook1.getName() + " " + newBook1.getAuthor() + " " + newBook1.getPublicationYear());
        System.out.println("Книга 2: " + newBook2.getName() + " " + newBook2.getAuthor() + " " + newBook2.getPublicationYear());
        System.out.println("Книга 3: " + newBook3.getName() + " " + newBook3.getAuthor() + " " + newBook3.getPublicationYear());
        newBook3.setPublicationYear(2021);
        System.out.println("Книга 3  - новый год издания: " + newBook3.getName() + " " + newBook3.getAuthor() + " " + newBook3.getPublicationYear());
    }
}
