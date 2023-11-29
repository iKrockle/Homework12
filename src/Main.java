public class Main {
    public static void main(String[] args) {
        Author firstAutor = new Author("Николай","Гоголь");
        Author scndAutor = new Author("Михаил","Лермонтов");

        Book deadSouls = new Book("Мертвые души",firstAutor,1842);
        System.out.println(deadSouls);
        Book taman = new Book("Тамань",scndAutor,1991);
        System.out.println(taman);
        taman.setYear(2000);
        System.out.println(taman);
    }
}