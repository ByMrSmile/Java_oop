import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(21.5, "yellow", "volleyball", 2700);
        Ball b2 = new Ball(25.5, "green", "football", 2300);
        Ball b3 = new Ball(23.5, "grey", "football", 3000);

        b3.setColor("red");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}