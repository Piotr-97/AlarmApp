package com.example.demo.controler;


import com.example.demo.repo.LawyerRepository;
import com.example.demo.repo.entity.Lawyer;
import com.example.demo.service.LawyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class LawyerContoller {

    private  final LawyerService lawyerService;


    @GetMapping("/lawyers")
    public List<Lawyer> getLawyers(){
        return lawyerService.getAllLawyers();
    }


}
