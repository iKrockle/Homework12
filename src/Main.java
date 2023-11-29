public class Main {
    public static void main(String[] args) {
        Author firstAutor = new Author("Николай","Гоголь");
        Author scndAutor = new Author("Михаил","Лермонтов");
        Author thrdAutor = new Author("Михаил","Лермонтов");

        Book deadSouls = new Book("Мертвые души",firstAutor,1842);
        System.out.println(deadSouls);
        Book taman = new Book("Тамань",scndAutor,1991);
        Book taman2 = new Book("Тамань",scndAutor,2000);
        System.out.println(taman);
        taman.setYear(2000);
        System.out.println(taman);
        //чекаем сравнения
        System.out.println(firstAutor.equals(scndAutor));
        System.out.println(scndAutor.equals(thrdAutor));
        System.out.println(deadSouls.equals(taman));
        System.out.println(taman.equals(taman2));
        //чекаем хэш
        System.out.println(firstAutor.hashCode());
        System.out.println(taman.hashCode());
        System.out.println(taman2.hashCode()==taman.hashCode());
        System.out.println(deadSouls.hashCode()==taman.hashCode());
    }
}