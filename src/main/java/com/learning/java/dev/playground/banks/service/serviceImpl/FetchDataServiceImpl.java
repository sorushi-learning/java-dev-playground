package com.learning.java.dev.playground.banks.service.serviceImpl;

import com.learning.java.dev.playground.banks.entity.Bank;
import com.learning.java.dev.playground.banks.repository.BankRepository;
import com.learning.java.dev.playground.banks.service.FetchDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class FetchDataServiceImpl implements FetchDataService {

  private final BankRepository bankRepository;

  public FetchDataServiceImpl(BankRepository bankRepository) {
    this.bankRepository = bankRepository;
  }

  @Override
  public List<Bank> fetchAllBanks() {
    log.info("Fetching all banks from the database.");
    return bankRepository.findAll();
  }

  @Override
  public Bank fetchBankById(Long bankId) {
    log.info("Fetching bank with ID: {}", bankId);
    return bankRepository.findById(bankId).orElseThrow(
        () -> new RuntimeException("Bank not found with ID: " + bankId)
    );
  }
}
