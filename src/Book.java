public class Book {
    private final String name;
    private final String author;
    private Integer publicationYear; //если год публикации неизвестен, то Integer дает возможность завести null. Int - не дает

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

    public Book(String name, String author, Integer publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

}