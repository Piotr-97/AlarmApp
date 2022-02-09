package com.example.demo.repo;

import com.example.demo.repo.entity.Client;
import com.example.demo.repo.entity.Lawyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Long> {



    @Query(value = "select lawyers from Client c where c.id = ?1 ",nativeQuery = true)
    List<Lawyer> findAllLawyerByClient(Long id);



}
