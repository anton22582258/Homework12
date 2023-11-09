public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Anton", "Chekhov");
        System.out.println(" Author1 - " + author1.getAuthorName() + " " + author1.getAuthorSurname());
        Author author2 = new Author("Fedor", "Dostoevsky");
        System.out.println(" Author2 - " + author2.getAuthorName() + " " + author2.getAuthorSurname());
        Book book1 = new Book("Gull ", "Anton Chekhov", 1896);
        System.out.println(" Book1.name - " + book1.getName());
        System.out.println(" Book1.author - " + author1.getAuthorName() + " " + author1.getAuthorSurname());
        System.out.println(" Book1.yearOfPublication - " + book1.getYearOfPublication());
        Book book2 = new Book("Idiot ", "Fedor Dostoevsky", 1868);
        System.out.println(" Book2.name - " + book2.getName());
        System.out.println(" Book2.author - " + author2.getAuthorName() + " " + author2.getAuthorSurname());
        System.out.println(" Book2.yearOfPublication - " + book2.getYearOfPublication());
        book1.setYearOfPublication(2018);
        System.out.println(" New year of publication `Gull` - " + book1.getYearOfPublication());
    }
}
