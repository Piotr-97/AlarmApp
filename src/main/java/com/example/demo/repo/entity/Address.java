package com.example.demo.repo.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Address {

    @Id
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "buildingname")
    private String buildingname;

    @Column(name = "apartmentnumber")
    private String apartmentnumber;

    @Column(name = "zipcode")
    private String zipcode;

}
