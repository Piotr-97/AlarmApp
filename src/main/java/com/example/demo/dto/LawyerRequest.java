package com.example.demo.dto;

import com.example.demo.repo.entity.Client;
import com.example.demo.repo.entity.Lawyer;
import com.example.demo.repo.entity.PositionEnum;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class LawyerRequest {


    @NotBlank(message = "Firstname is mandatory")
    private String firstname;
    @NotBlank(message = "Lastname is mandatory")
    private String lastname;

    private PositionEnum position;

    @NotBlank(message = "Lastname is mandatory")
    @Size(min = 9,max = 12)
    private String phonenumber;

    private String email;

    private Lawyer manager;

    private Set<Client> clients;

}
