public class Calculator {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int dif(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Деление на ноль невомзожно");
        }
        return firstNumber / secondNumber;
    }

    public int times(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int solver(int a, int b, int c) {
        int additionOfNumbers = add(a, b);
        int divisionOfNumber = div(c, a);
        int difOfNumbers = dif(c, b);
        return times(difOfNumbers, times(additionOfNumbers, divisionOfNumber)) ;

    }
}
