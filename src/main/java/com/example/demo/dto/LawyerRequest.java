package com.example.demo.dto;

import com.example.demo.repo.entity.Client;
import com.example.demo.repo.entity.Lawyer;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Set;

@Data
public class LawyerRequest {


    @NotBlank(message = "Firstname is mandatory")
    private String firstname;
    @NotBlank(message = "Lastname is mandatory")
    private String lastname;

    private String position;

    private String phonenumber;

    private String email;

    private Lawyer manager;

    private Set<Client> clients;

}
