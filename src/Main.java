public class Main {
    public static void main(String[] args) {
        Summator calculator = new Summator();

        calculator.setFirstNumber(2);
        calculator.setSecondNumber(2);
        System.out.println(calculator.sum());

        calculator.setFirstNumber(2.25);
        calculator.setSecondNumber(7.75);
        System.out.println(calculator.sum());

        calculator.setFirstNumber(3.14159);
        calculator.setSecondNumber(12.5);
        System.out.println(calculator.sum());

        calculator.setFirstNumber(1.0000001);
        calculator.setSecondNumber(2.0000002);
        System.out.println(calculator.sum());


    }
}
