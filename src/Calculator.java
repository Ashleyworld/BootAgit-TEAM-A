public class Calculator {
    void multiply(int a, int b){
        System.out.println("결과는 : " + (a * b) + "입니다.");
    }
    void multiply(int a, int b, int c){
        System.out.println("결과는 : " + (a * b * c) + "입니다.");
    }
    void multiply(double a, double b){
        System.out.println("결과는 : " + (a * b) + "입니다.");
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int d = 4;
        Calculator c = new Calculator();
        c.multiply(a,b);
        c.multiply(a,b,d);
        double aa = 1.2;
        double bb = 1.4;
        c.multiply(aa,bb);
    }
}
/*
결과는 : 2입니다.
결과는 : 8입니다.
결과는 : 1.68입니다.
*/