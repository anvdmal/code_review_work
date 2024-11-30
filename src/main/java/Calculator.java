public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0) throw new IllegalArgumentException("division by zero");
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(int a, int b, int c){
        return times(dif(times(a, b), div(a, b)), add(a, c));
    }
}
