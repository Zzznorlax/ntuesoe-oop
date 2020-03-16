
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

        // prob. 4
        System.out.println("====== prob. 4 SentenceProcessor ======");
        SentenceProcessor sp = new SentenceProcessor();

        assert sp.removeDuplicatedWords("Hello Hello World I love love the World I lovelove the World") == "Hello World I love the lovelove";
        System.out.println(sp.removeDuplicatedWords("Hello Hello World I love love the World I lovelove the World"));
        System.out.println(sp.removeDuplicatedWords("Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo"));
        System.out.println(sp.removeDuplicatedWords("a a la a la carte A la La carte Carte A a la la"));
        System.out.println(sp.replaceWord("major", "minor", "The major problem is how to sing in A major"));
        System.out.println(sp.replaceWord("on", "off", "Turn on the television I want to keep the television on"));
        System.out.println(sp.replaceWord("love", "hate", "I love the World I lovelove the Love"));
    }

}
