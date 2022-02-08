package com.example.demo.controler;

import com.example.demo.repo.ClientRepository;
import com.example.demo.service.ClientService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;



@Controller
@AllArgsConstructor
public class ClientController {


    private final ClientRepository clientRepository;
    private final ClientService clientService;
    private final ModelMapper modelMapper;


}
