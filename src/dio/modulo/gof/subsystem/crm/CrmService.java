package dio.modulo.gof.subsystem.crm;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void saveCustomer(String name, String cep, String city, String state) {
        System.out.println("Save Customer successfully in CRM system");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(city);
        System.out.println(state);
    }
}
