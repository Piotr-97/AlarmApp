package com.example.demo.service;


import com.example.demo.repo.ClientRepository;
import com.example.demo.repo.entity.Lawyer;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService {

    private final ModelMapper modelMapper;
    private final ClientRepository clientRepository;




}
