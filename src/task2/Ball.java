import java.lang.*;

public class Ball {
    private String colour;
    private int diameter;

    public Ball(String c, int d) {
        colour = c;
        diameter = d;
    }

    public Ball(String c) {
        colour = c;
        diameter = 10;
    }

    public Ball() {
        colour = "red";
        diameter = 10;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour(String colour) {
        return colour;
    }
    public int getDiameter() {
        return diameter;
    }

    public String toString(){
        return this.colour+", diameter "+this.diameter;
    }

    public void intoDiameterMm(){
        System.out.println("Diameter of the "+colour+" ball in millimeters is "+diameter*10+" mm");
    }
}
