package dio.modulo.gof.singleton;

public class SingletonLazy {
    private static SingletonLazy instancia;

    // O construtor deve ser privado para garantir segurança
    private SingletonLazy() {
        super();
    }

    // Função que retorna a própria instância de Singleton
    // Caso não exista, é criada
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
