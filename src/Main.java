public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Ivanich", "Vasya");
        Author author2 = new Author("Vasilich", "Ivan");

        Book book1 = new Book("Похождения Васи", 2019, author1);
        Book book2 = new Book("Похождения Вани", 2019, author2);

        System.out.println(book1.getYear());
        book1.setYear(2020);
        System.out.println(book1.getYear());
    }
}