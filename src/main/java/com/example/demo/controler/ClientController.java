package com.example.demo.controler;

import com.example.demo.repo.ClientRepository;
import com.example.demo.repo.entity.Lawyer;
import com.example.demo.service.ClientService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@AllArgsConstructor
public class ClientController {


    private final ClientRepository clientRepository;
    private final ClientService clientService;
    private final ModelMapper modelMapper;


    @GetMapping("/Clientlawyers/{id}")
    public List<Lawyer> getClientLawyers(@RequestParam Long id){
        return clientService.getClientlawyers(id);
    }




}
