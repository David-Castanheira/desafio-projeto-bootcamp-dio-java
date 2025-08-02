package br.com.dio.project_patterns.model.customer;

import br.com.dio.project_patterns.model.address.Address;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;

    @ManyToOne
    private Address address;
}
