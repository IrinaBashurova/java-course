package practical2;

public class SimpleCalculator {
    public SimpleCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double firstNumber;
    public double secondNumber;
    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }
    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }
    public double getMultiplicationResult(){
        return this.firstNumber*this.secondNumber;
    }
    public double getDivisionResult() {
        if (secondNumber == 0) {
           return this.secondNumber = 0;
        } else {
            return firstNumber / secondNumber;
        }
    }
}

