public class Book implements Nameable {
    private String name;
    private String author;
    private int date;

    public Book(String name, String author, int date) {
        this.name = name;
        this.author=author;
        this.date=date;
    }

    @Override
    public void GetName() {
        System.out.printf("Книга: '%s', Автор: '%s', Дата выпуска: '%d' " ,name, author,date);
    }
}
