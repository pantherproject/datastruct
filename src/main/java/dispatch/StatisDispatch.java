package dispatch;

/**
 * Created by panther on 17-5-2.
 */
public class StatisDispatch {

    static abstract class Human {

    }

    static class Man extends Human {

    }

    static class Woman extends Human {

    }

    public void sayHello(Human guy) {
        System.out.println("hello,guy!");
    }


    public void sayHello(Man guy) {
        System.out.println("hello,gentleman!");
    }

    public void sayHello(Woman woman) {
        System.out.println("hello,lady!");
    }


    public static void main(String[] args) {
        Human human = new Man();
        Human women = new Woman();

        StatisDispatch statisDispatch = new StatisDispatch();
        statisDispatch.sayHello(human);
        statisDispatch.sayHello(women);
    }

}
