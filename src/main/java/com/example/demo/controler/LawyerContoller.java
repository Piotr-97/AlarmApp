package com.example.demo.controler;


import com.example.demo.dto.LawyerResponse;
import com.example.demo.repo.LawyerRepository;
import com.example.demo.repo.entity.Lawyer;
import com.example.demo.service.LawyerService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class LawyerContoller {

    private  final LawyerService lawyerService;
    private final LawyerRepository lawyerRepository;
    private final ModelMapper modelMapper;


    @GetMapping("/lawyers")
    public List<LawyerResponse> getLawyers(){
        return lawyerService.getAllLawyers();
    }

    @GetMapping("/lawyer/{id}")
    public ResponseEntity<Lawyer> getLawyer(@PathVariable Long id){
        Optional<Lawyer> result = lawyerRepository.findById(id);

        if(result.isPresent())
            return new ResponseEntity<>(result.get(), HttpStatus.OK);
        else
            return ResponseEntity.notFound().build();
    }


}
