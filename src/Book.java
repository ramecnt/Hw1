public class Book {
    private final String name;
    private final Author author;
    private int year;

    public Book(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Книга под названием " + name + " вышедшая в " + year + ", автор:" + author.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book otherBook = (Book) other;
        return name.equals(otherBook.getName()) && author.equals(otherBook.getAuthor()) && year == otherBook.getYear();
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, author);
    }
}
