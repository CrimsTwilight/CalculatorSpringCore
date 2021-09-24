package by.crims;

public class Addition implements Operation {
    @Override
    public void calculate(int a, int b) {
        int c = a + b;
        System.out.println("Результат: " + c);
    }
}