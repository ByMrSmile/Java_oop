public class TestAuthor {
    public TestAuthor() {
    }

    public static void main(String[] args) {
        Author a1 = new Author("Deniel", "gaydukovdeniel@yandex.ru", 'M');
        System.out.println(a1);
        a1.setEmail("gaydukovdeniel@yandex.ru");
        System.out.println(a1);
    }
}

