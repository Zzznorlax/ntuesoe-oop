
public class Main {
   public static void main(String[] args) {
       // Write your code here

       // Helo World
       System.out.println("Hello World.");

       // prob. 1
       System.out.println("====== prob. 1 APlusB ======");
        int answer = APlusB.plus(10,2);
        System.out.println(answer);

        // prob. 2
        System.out.println("====== prob. 2 IsLeapYear ======");
        IsLeapYear ily = new IsLeapYear();
        System.out.println(ily.determine(400));
        System.out.println(ily.determine(200));
        System.out.println(ily.determine(256));
        System.out.println(ily.determine(251));
    }

}
