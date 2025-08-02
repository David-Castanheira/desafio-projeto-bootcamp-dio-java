package dio.modulo.gof;

import dio.modulo.gof.singleton.SingletonEager;
import dio.modulo.gof.singleton.SingletonLazy;
import dio.modulo.gof.singleton.SingletonLazyHolder;
import dio.modulo.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("SingletonLazy");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("------------------------------------------------");

        System.out.println("SingletonEager");
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        System.out.println("------------------------------------------------");

        System.out.println("SingletonEager");
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        System.out.println("------------------------------------------------");

        System.out.println("Strategy");
        StrategyBotBehavior normal = new StrategyNormalBotBehavior();
        StrategyBotBehavior defensive = new StrategyDefensiveBotBehavior();
        StrategyBotBehavior agressive = new StrategyAgressiveBotBehavior();

        Robot robot = new Robot();
        robot.setStrategy(normal);

        robot.move();
        robot.move();

        robot.setStrategy(defensive);

        robot.move();
        robot.move();

        robot.setStrategy(agressive);

        robot.move();
        robot.move();
    }
}
