package lab5.advanced;

public class MainAdvanced{
    public static void main(String[] args) {

        NewIntCalculator calculator = new NewIntCalculator(10);
        int resultInt = (Integer) calculator.add(5).subtract(3).multiply(2).result();
        IO.println("Rezultat Integer: " + resultInt);


        DoubleCalculator fCalculator = new DoubleCalculator(10.0);
        double resultDouble = (Double) fCalculator.add(5.0).subtract(3.3).multiply(2.2).result();
       IO.println("Rezultat Double: " + resultDouble);
    }
}