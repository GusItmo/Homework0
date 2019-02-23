import java.time.chrono.IsoChronology;

public class Summator implements ISummator {

    private double firstNumber;
    private double secondNumber;

    @Override
   public double setFirstNumber (double firstNumber) {
        this.firstNumber=firstNumber;
        return firstNumber;
    }

    @Override
    public double setSecondNumber (double secondNumber) {
        this.secondNumber=secondNumber;
        return secondNumber;
    }

    @Override
    public double sum () {
        double sum=firstNumber+secondNumber;
        return sum;
    }
    }

