package lab5;

public class Main {
    public static void main(String[] args) {

        IO.println("a) IntCalculator");
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        IO.println("Rezultat: " + result);
        IO.println();

        IO.println("b) AdvancedCalculator");
        AdvancedCalculator advancedCalculator = new AdvancedCalculator(10);
        IO.println();

        int result2 = advancedCalculator.divide(4).power(2).root(2).result();
        IO.println("Rezultat: " + result2);
    }
}