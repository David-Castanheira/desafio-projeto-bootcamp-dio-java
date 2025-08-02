package dio.modulo.gof.strategy;

public class Robot {
    private StrategyBotBehavior behavior;

    // Função criada para permitir que o robô mude seu comportamento
    public void setStrategy(StrategyBotBehavior behavior) {
        this.behavior = behavior;
    }

    // Função criada para permitir que o robô se mova
    public void move() {
        behavior.move();
    }
}
