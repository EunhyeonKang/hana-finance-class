package calcapp.main;

public class Calc {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int total = calcapp.logic.CalcLogic.add(a, b);
        int delta = calcapp.logic.CalcLogic.minus(a, b);
        System.out.println("더하기 " + total + ", 빼면 " + delta);
    }
}







