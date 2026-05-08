public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int dif(int a, int b){
        return a - b;
    }

    public int div(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя!");
        }
        return a / b;
    }

    public int times(int a, int b){
        return a * b;
    }

    public int solver(){
        int a = 2;
        int b = 5;
        int c = 15;
        int x = (c - b) / a;
        System.out.println("Уравнение: " + a + "x + " + b + " = " + c);
        System.out.println("Ответ: x = " + x);
        return x;
    }
}