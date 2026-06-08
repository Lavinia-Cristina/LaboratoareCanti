package lab7;

import lab7.forms.Circle;
import lab7.forms.Form;
import lab7.forms.Square;
import lab7.forms.Triangle;

import lab7.util.PasswordMaker;


public class Main {
    public static void main(String[] args) {

        Triangle tri = new Triangle(1.1F, 2.0F, "red");
        Circle c = new Circle(1.5F, "yellow");
        Square sq = new Square(1.2F, "blue");

        IO.println();
        IO.println("Area = " + tri.getArea()+" details: " + tri);
        IO.println("Area = " + c.getArea() + " details: " + c);
        IO.println("Area = " + sq.getArea() + " details: " + sq);

        IO.println("Total instance count is " + Form.getInstanceCount());

        PasswordMaker pm2 = PasswordMaker.getInstance();
        IO.println("Generated passwords: ");
        IO.println();

        IO.println("1:" + PasswordMaker.getInstance().getPassword());
        IO.println("2:" + PasswordMaker.getInstance().getPassword());
        IO.println("3:" + PasswordMaker.getInstance().getPassword());
        IO.println("4:" + pm2.getPassword());
        IO.println("5:" + pm2.getPassword());

        IO.println();
        IO.println("Number of time getInstance() has been called: "+PasswordMaker.getCallingCounts());

    }
}
