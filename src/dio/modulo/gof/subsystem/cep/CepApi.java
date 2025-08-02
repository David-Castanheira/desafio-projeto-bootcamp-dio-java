package dio.modulo.gof.subsystem.cep;

// Implementação de uma classe Singleton
public class CepApi {
    public static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        if (instancia == null) {
            instancia = new CepApi();
        }
        return instancia;
    }

    public String recoverCity(String cep) {
        return "Araraquara";
    }

    public String recoverState(String cep) {
        return "SP";
    }
}
