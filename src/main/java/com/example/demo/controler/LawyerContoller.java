package com.example.demo.controler;


import com.example.demo.dto.LawyerRequest;
import com.example.demo.dto.LawyerResponse;
import com.example.demo.repo.LawyerRepository;
import com.example.demo.repo.entity.Lawyer;
import com.example.demo.service.LawyerService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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


   @PostMapping("/lawyer")
    public void addLawyer(@Valid @RequestBody LawyerRequest lawyer){
        Lawyer newLawyer = modelMapper.map(lawyer,Lawyer.class);
        lawyerRepository.save(newLawyer);
    }



    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }



}
