package com.example.demo.dto;

import com.example.demo.repo.entity.Address;
import com.example.demo.repo.entity.Lawyer;

import javax.validation.constraints.Size;
import java.util.Set;

public class ClientRequest {


    private Address address;
    @Size(min = 3 ,max = 40)
    private String name;
    private Set<Lawyer> lawyers;

}
