
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

        assert sp.removeDuplicatedWords(
                "Hello Hello World I love love the World I lovelove the World") == "Hello World I love the lovelove";
        System.out.println(sp.removeDuplicatedWords("Hello Hello World I love love the World I lovelove the World"));
        System.out.println(sp.removeDuplicatedWords("Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo"));
        System.out.println(sp.removeDuplicatedWords("a a la a la carte A la La carte Carte A a la la"));
        System.out.println(sp.replaceWord("major", "minor", "The major problem is how to sing in A major"));
        System.out.println(sp.replaceWord("on", "off", "Turn on the television I want to keep the television on"));
        System.out.println(sp.replaceWord("love", "hate", "I love the World I lovelove the Love"));

        // prob. 5
        System.out.println("====== prob. 5 Pizza ======");

        Pizza pizza = new Pizza("large", 3, 1, 5);
        System.out.println(pizza.getSize());
        System.out.println(pizza.getNumberOfCheese());
        System.out.println(pizza.getNumberOfPepperoni());
        System.out.println(pizza.getNumberOfHam());
        pizza = new Pizza();
        pizza.setSize("medium");
        pizza.setNumberOfCheese(2);
        pizza.setNumberOfPepperoni(4);
        pizza.setNumberOfHam(1);
        System.out.println(pizza.getSize());
        System.out.println(pizza.getNumberOfCheese());
        System.out.println(pizza.getNumberOfPepperoni());
        System.out.println(pizza.getNumberOfHam());
        System.out.println(pizza.calcCost());
        System.out.println(pizza.toString().equals("size = medium, numOfCheese = 2, numOfPepperoni = 4, numOfHam = 1"));
        System.out.println(pizza.equals(new Pizza("large", 2, 4, 1)));
        System.out.println(pizza.equals(new Pizza()));
        System.out.println(pizza.equals(new Pizza("medium", 2, 4, 1)));

        // prob. 6
        System.out.println("====== prob. 6 Pizza Order ======");

        Pizza pizza1 = new Pizza("large", 1, 0, 1);
        Pizza pizza2 = new Pizza("medium", 2, 2, 5);
        Pizza pizza3 = new Pizza();
        PizzaOrder order = new PizzaOrder();
        System.out.println(order.setNumberPizzas(5));
        order.setNumberPizzas(2);
        order.setPizza1(pizza1);
        order.setPizza2(pizza2);
        System.out.println(order.calcTotal());
        order.setNumberPizzas(3);
        order.setPizza1(pizza1);
        order.setPizza2(pizza2);
        order.setPizza3(pizza3);
        System.out.println(order.calcTotal());

        // prob.7
        System.out.println("====== prob. 7 Simple Array List ======");

        System.out.println("=== TASK 1 ===");
        SimpleArrayList list = new SimpleArrayList();
        System.out.println(list.get(0));

        System.out.println("=== TASK 2 ===");
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(1);
        list.add(12);
        System.out.println(list.get(2));

        System.out.println("=== TASK 3 ===");
        System.out.println(list.get(5));

        System.out.println("=== TASK 4 ===");
        System.out.println(list.set(2, 100));

        System.out.println("=== TASK 5 ===");
        System.out.println(list.get(2));

        System.out.println("=== TASK 6 ===");
        System.out.println(list.set(5, 100));

        System.out.println("=== TASK 7 ===");
        System.out.println(list.remove(2));

        System.out.println("=== TASK 8 ===");
        System.out.println(list.get(2));

        System.out.println("=== TASK 9 ===");
        System.out.println(list.remove(2));

        System.out.println("=== TASK 10 ===");
        System.out.println(list.get(2));

        System.out.println("=== TASK 11 ===");
        System.out.println(list.get(3));

        System.out.println("=== TASK 12 ===");
        list.clear();
        System.out.println(list.get(0));

        System.out.println("=== TASK 13 ===");
        SimpleArrayList list2 = new SimpleArrayList(5);
        System.out.println(list2.get(3));

        System.out.println("=== TASK 14 ===");
        System.out.println(list2.get(9));

        System.out.println("=== TASK 15 ===");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.set(i, i));
        }
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list.retainAll(list2));

        System.out.println("=== TASK 16 ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=== TASK 17 ===");
        System.out.println(list2.remove(0));
        System.out.println(list2.remove(2));
        System.out.println(list.retainAll(list2));

        System.out.println("=== TASK 18 ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=== TASK 19 ===");
        System.out.println(list.set(1, null));
        System.out.println(list.remove(1));

        System.out.println("=== TASK 20 ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=== TASK 21 ===");
        System.out.println(list.set(1, 123));

        System.out.println("=== TASK 22 ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=== TASK 23 ===");
        System.out.println(list.remove(1));

        System.out.println("=== TASK 24 ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=== TASK 25 ===");
        list.add(null);
        System.out.println(list.remove(2));

        System.out.println("=== TASK 26 ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // prob.8
        System.out.println("====== prob. 8 Shape ======");

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape triangle = shapeFactory.createShape(ShapeFactory.Type.Triangle, 7.5);
        Shape square = shapeFactory.createShape(ShapeFactory.Type.Square, 5);
        Shape circle = shapeFactory.createShape(ShapeFactory.Type.Circle, 5);
        System.out.println(triangle.getInfo());
        System.out.println(square.getInfo());
        System.out.println(circle.getInfo());
        System.out.println(square.getArea() > triangle.getArea());
        System.out.println(square.getPerimeter() > circle.getPerimeter());
        triangle.setLength(10.5);
        square.setLength(3.2);
        circle.setLength(0);
        System.out.println(triangle.getInfo());
        System.out.println(square.getInfo());
        System.out.println(circle.getInfo());
        System.out.println(square.getArea() > triangle.getArea());
        System.out.println(square.getPerimeter() > circle.getPerimeter());

        // prob.9
        System.out.println("====== prob. 9 SimpleCalculator ======");
        SimpleCalculator cal = new SimpleCalculator();
        String cmd = null;
        System.out.println(cal.getMsg());
        String cmd_str = "+ 5,- 2,* 5,/ 3,% 2,* D,X D,XD,, ,/ 1000000,/ 00.000,/ 0.000001,+ 1 + 1,- 1.66633,r R,r";
        String[] cmd_arr = cmd_str.split(",");
        for (int i = 0; i < cmd_arr.length; i++) {
            try {
                if (cal.endCalc(cmd_arr[i]))
                    break;
                cal.calResult(cmd_arr[i]);
                System.out.println(cal.getMsg());
            } catch (UnknownCmdException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(cal.getMsg());
    }

}
