import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Игрок", "Достоевский М.Ф.", 9, "Проза");
        Book b2 = new Book("Палата 6", "А.П. Чехов", 142, "Проза");

        b2.setPagesCount(100);

        System.out.println(b1);
        System.out.println(b2);
    }
}
