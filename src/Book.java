public class Book implements Packable{

    private String author, name;
    private double weight;

    public Book(String author, String name, double weight){
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    @Override public double weight() {
        return 0;
    }

    @Override public String toString() {
        return this.author + ": " + this.name ;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
