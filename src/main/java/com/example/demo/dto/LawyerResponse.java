package com.example.demo.dto;

import com.example.demo.repo.entity.Lawyer;
import com.example.demo.repo.entity.PositionEnum;
import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Data
public class LawyerResponse {

    private String firstname;
    private String lastname;
    private PositionEnum position;
    private String phonenumber;
    private String email;
    private Lawyer manager;


}
