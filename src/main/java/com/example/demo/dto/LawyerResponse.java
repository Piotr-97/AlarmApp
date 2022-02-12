package com.example.demo.dto;

import com.example.demo.repo.entity.Lawyer;
import com.example.demo.repo.entity.PositionEnum;
import lombok.Data;


@Data
public class LawyerResponse {

    private String firstname;
    private String lastname;
    private PositionEnum position;
    private String phonenumber;
    private String email;
    private Lawyer manager;
   // private Set<Client> clients;


}
