package com.example.demo.repo;

import com.example.demo.repo.entity.LegalPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegalPersonRepository extends JpaRepository<LegalPerson,Long> {
}
