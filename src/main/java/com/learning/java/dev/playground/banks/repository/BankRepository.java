package com.learning.java.dev.playground.banks.repository;

import com.learning.java.dev.playground.banks.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
}
