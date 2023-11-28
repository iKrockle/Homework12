public class Author {
    private final String name;
    private final String surname;

    Author(String inName,String inSurname){
        name = inName;
        surname = inSurname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name +" "+ surname;
    }
}
