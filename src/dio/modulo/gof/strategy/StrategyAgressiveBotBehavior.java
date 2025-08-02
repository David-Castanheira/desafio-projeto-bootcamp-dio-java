package dio.modulo.gof.strategy;

public class StrategyAgressiveBotBehavior implements StrategyBotBehavior {

    @Override
    public void move() {
        System.out.println("Bot moving aggressively");
    }
}
