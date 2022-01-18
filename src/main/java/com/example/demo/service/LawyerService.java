package com.example.demo.service;


import com.example.demo.repo.LawyerRepository;
import com.example.demo.repo.entity.Lawyer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;;
import java.util.List;

@Service
@AllArgsConstructor
public class LawyerService {

    private final LawyerRepository lawyerRepository;

    public List<Lawyer> getAllLawyers(){
     List<Lawyer> lawyers = lawyerRepository.findAll();
     return lawyers;
    }





}
