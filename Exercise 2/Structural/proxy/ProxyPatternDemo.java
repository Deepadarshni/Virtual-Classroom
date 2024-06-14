package proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Book book = new ProxyBook();

        // Book content will be loaded and displayed
        System.out.println("Book Content: " + book.getContent());

        // Book content will not be loaded again and will be displayed directly
        System.out.println("Book Content: " + book.getContent());
    }
}
