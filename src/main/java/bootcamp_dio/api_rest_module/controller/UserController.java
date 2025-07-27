package bootcamp_dio.api_rest_module.controller;

import bootcamp_dio.api_rest_module.model.User;
import bootcamp_dio.api_rest_module.repository.UserRepository;
import bootcamp_dio.api_rest_module.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Tag(name = "Users", description = "RESTful API for users register")
public class UserController {

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserService service;

    @PostMapping
    @Operation(summary = "Save an user")
    public void saveUser(@RequestBody User user) {
        repository.save(user);
    }

    @GetMapping
    @Operation(summary = "List all users")
    public List<User> getUsers() {
        return repository.findAll();
    }

    @GetMapping("/{username}")
    @Operation(summary = "List user by username")
    public User getUsername(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete user by id")
    public void deleteUser(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }
}
