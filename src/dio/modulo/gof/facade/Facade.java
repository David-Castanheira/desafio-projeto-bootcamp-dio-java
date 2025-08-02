package dio.modulo.gof.facade;

import dio.modulo.gof.subsystem.cep.CepApi;
import dio.modulo.gof.subsystem.crm.CrmService;

public class Facade {
    public void migrateCustomer(String name, String cep) {
        String city = CepApi.getInstancia().recoverCity(cep);
        String state = CepApi.getInstancia().recoverState(cep);

        CrmService.saveCustomer(name, cep, city, state);
    }
}
