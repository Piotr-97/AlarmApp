package com.example.demo.service;


import com.example.demo.dto.LawyerResponse;
import com.example.demo.repo.LawyerRepository;
import com.example.demo.repo.entity.Lawyer;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LawyerService {

    private final LawyerRepository lawyerRepository;
    private final ModelMapper modelMapper;


    public List<LawyerResponse> getAllLawyers(){
     List<Lawyer> lawyers = lawyerRepository.findAll();
     List<LawyerResponse> result = new ArrayList<>();
     for(Lawyer lawyer: lawyers){
         LawyerResponse lawyerResponse = modelMapper.map(lawyer,LawyerResponse.class);
         result.add(lawyerResponse);
     }

     return result;
    }





}
