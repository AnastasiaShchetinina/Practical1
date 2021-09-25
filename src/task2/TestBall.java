import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("black", 1);
        Ball b2 = new Ball("white", 20);
        Ball b3 = new Ball("grey");
        b3.setDiameter(5);
        System.out.println(b1);
        b1.intoDiameterMm();
        b2.intoDiameterMm();
        b3.intoDiameterMm();
    }
}
