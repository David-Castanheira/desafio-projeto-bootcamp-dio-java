package dio.modulo.gof.singleton;

public class SingletonEager {
    // A instância já é rapidamente criada logo em sua atribuição
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        if (instancia == null) {
            instancia = new SingletonEager();
        }
        return instancia;
    }
}
