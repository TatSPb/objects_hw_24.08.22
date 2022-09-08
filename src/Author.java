public class Author {

    private String name;

    @Override
    public String toString() {
        return "Автор {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
