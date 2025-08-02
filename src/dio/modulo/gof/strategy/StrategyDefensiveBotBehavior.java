package dio.modulo.gof.strategy;

public class StrategyDefensiveBotBehavior implements StrategyBotBehavior {

    @Override
    public void move() {
        System.out.println("Bot moving defensively");
    }
}
