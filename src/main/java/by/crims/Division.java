package by.crims;

public class Division implements Operation {
    @Override
    public void calculate(int a, int b) {
        if (b == 0) {
            System.out.println("На 0 делить нельзя.");
        } else {
            int c = a / b;
            System.out.println("Результат: " + c);
        }
    }
}