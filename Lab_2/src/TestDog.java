import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Muhtar", 1, 15, "grey");
        Dog d2 = new Dog("Muhtar", 1);
        Dog d3 = new Dog("Muhtar");
        d3.setAge(1);
        d3.setColor("red");

        System.out.println(d1);
        d1.intoHumanAge();

        System.out.println(d2);
        d2.intoHumanAge();

        System.out.println(d3);
        d3.intoHumanAge();
    }
}
