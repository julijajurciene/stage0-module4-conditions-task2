package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int result;
        if (first >= second) {
            result = first;
        } else {
            result = second;
        }
        System.out.println(result);
    }
}
