package com.example.demo.controler;


import com.example.demo.repo.LawyerRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Controller;

@AllArgsConstructor
@Controller
public class LawyerContoller {

    private  final LawyerRepository lawyerRepository;
}
