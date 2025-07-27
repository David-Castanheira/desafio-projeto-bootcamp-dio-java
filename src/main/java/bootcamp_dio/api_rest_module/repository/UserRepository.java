package bootcamp_dio.api_rest_module.repository;

import bootcamp_dio.api_rest_module.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user) {
        if(user.getId() == null)
            System.out.println("Operação SAVE - Salvando um usuário na camada de repositório");
         else
            System.out.println("Operação UPDATE - Atualizando um usuário na camada de repositório");

        System.out.println(user);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("LIST - Obtendo os usuários cadastrados no sistema");
        List<User> users = new ArrayList<>();
        users.add(new User(1, "gleyson", "12345"));
        users.add(new User(2, "webmaster", "masterpass@"));
        return users;
    }

    public User findById(Integer id) {
        System.out.println(String.format("FIND/id - Obtendo o usuário pelo id: %d", id));
        return new User(1, "gleyson", "12345");
    }

    public User findByUsername(String username) {
        System.out.println(String.format("FIND/username - Obtendo o usuário pelo login: %s", username));
        return new User(1, "gleyson", "12345");
    }
}
