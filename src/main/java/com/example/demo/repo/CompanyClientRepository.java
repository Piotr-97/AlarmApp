package com.example.demo.repo;

import com.example.demo.repo.entity.CompanyClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyClientRepository extends JpaRepository<CompanyClient,Long> {

}
