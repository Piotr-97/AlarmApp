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


    public boolean update (Long id, Lawyer updatedlawyer){
        Optional<Lawyer> currentLawyer = lawyerRepository.findById(id);
        if(currentLawyer.isPresent()){
            Lawyer newLawyer = currentLawyer.get();
            if(updatedlawyer.getFirstname() !=null)
                    newLawyer.setFirstname(updatedlawyer.getFirstname());
            if(updatedlawyer.getLastname() != null)
                    newLawyer.setLastname(updatedlawyer.getLastname());
            if(updatedlawyer.getEmail() !=null)
                    newLawyer.setEmail(updatedlawyer.getEmail());
            if(updatedlawyer.getClients() !=null)
                    newLawyer.setClients(updatedlawyer.getClients());
            if(updatedlawyer.getManager() != null)
                    newLawyer.setManager(updatedlawyer.getManager());
            if(updatedlawyer.getPhonenumber() != null)
                    newLawyer.setPhonenumber(updatedlawyer.getPhonenumber());
            if(updatedlawyer.getPosition() != null)
                    newLawyer.setPosition(updatedlawyer.getPosition());

            newLawyer.setId(id);
            lawyerRepository.save(newLawyer);
            return true;
        }
        return false;
    }





}
