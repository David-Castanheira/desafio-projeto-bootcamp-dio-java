package dio.modulo.gof.singleton;

public class SingletonLazyHolder {
    // Encapsula a instância em uma classe estática interna (inner class)
    // A instância precisa ser pública para que seja acessada
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
