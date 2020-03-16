
public class Main {
    public static void main(String[] args) {
        // Write your code here

        // Helo World
        System.out.println("Hello World.");
        System.out.println(17 / 5);

        // prob. 1
        System.out.println("====== prob. 1 APlusB ======");
        int answer = APlusB.plus(10, 2);
        System.out.println(answer);

        // prob. 2
        System.out.println("====== prob. 2 IsLeapYear ======");
        IsLeapYear ily = new IsLeapYear();
        System.out.println(ily.determine(400));
        System.out.println(ily.determine(200));
        System.out.println(ily.determine(256));
        System.out.println(ily.determine(251));

        // prob. 3
        System.out.println("====== prob. 3 GreenCrud ======");
        GreenCrud gc = new GreenCrud();
        System.out.println(gc.calPopulation(10, 1));
        System.out.println(gc.calPopulation(10, 5));
        System.out.println(gc.calPopulation(10, 10));
        System.out.println(gc.calPopulation(10, 15));
        System.out.println(gc.calPopulation(10, 20));
        System.out.println(gc.calPopulation(6, 15));
        System.out.println(gc.calPopulation(10, 17));
        System.out.println(gc.calPopulation(3, 20));
    }

}
