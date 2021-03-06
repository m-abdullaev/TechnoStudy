package day33.javaEnum.ex2;

public class Book {
    private String name;
    private BookCategory bookCategory;

    public Book(String name, BookCategory bookCategory) {
        this.name = name;
        this.bookCategory = bookCategory;
    }

    public String toString() {
        return "\nBook" +
                "\nname: " + name +
                "\nbookCategory: " + bookCategory;
    }


}
