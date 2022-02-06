package com.example.demo.dto;

import com.example.demo.repo.entity.Address;
import com.example.demo.repo.entity.Lawyer;
import lombok.Data;

import java.util.Set;

@Data
public class ClientResponse {

    private Address address;
    private String name;
    private Set<Lawyer> lawyers;


}
