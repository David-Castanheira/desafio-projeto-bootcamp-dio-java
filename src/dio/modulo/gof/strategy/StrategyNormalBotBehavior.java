package dio.modulo.gof.strategy;

public class StrategyNormalBotBehavior implements StrategyBotBehavior {

    @Override
    public void move() {
        System.out.println("Bot moving normally");
    }
}
