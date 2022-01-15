package com.example.demo.repo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class Client {

    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "address_id",nullable = false)
    private Address address;


}
