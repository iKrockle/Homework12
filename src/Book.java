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
}
