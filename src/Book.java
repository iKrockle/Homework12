import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int year;

    Book(String inBookName,Author inAutor,int inYear){
        bookName=inBookName;
        author = inAutor;
        year = inYear;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Название книги = \"" + bookName +
                "\", автор = " + author.toString() +
                ", год издания = " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }
}
