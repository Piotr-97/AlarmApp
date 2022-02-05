package com.example.demo.repo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "address_id",nullable = false)
    private Address address;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "clients")
    private Set<Lawyer> lawyers;


}
