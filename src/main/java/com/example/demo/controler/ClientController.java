package com.example.demo.controler;

import com.example.demo.repo.ClientRepository;
import com.example.demo.repo.entity.Client;
import com.example.demo.service.ClientService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@AllArgsConstructor
public class ClientController {


    private final ClientRepository clientRepository;
    private final ClientService clientService;
    private final ModelMapper modelMapper;



    @GetMapping("/clients")
    public List<Client> getAllclients(){
        return clientRepository.findAll();
    }



}
