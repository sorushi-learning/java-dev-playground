package com.learning.java.dev.playground.banks.service.serviceImpl;

import com.learning.java.dev.playground.banks.entity.Bank;
import com.learning.java.dev.playground.banks.repository.BankRepository;
import com.learning.java.dev.playground.banks.service.RegistrationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RegistrationServiceImpl implements RegistrationService {

  private final BankRepository bankRepository;

  public RegistrationServiceImpl(BankRepository bankRepository) {
    this.bankRepository = bankRepository;
  }

  @Override
  public Bank registerBank(Bank bank) {

    log.info(
        "Registering bank with name: {}, code: {}, countryCode: {}", bank.getBankName(), bank.getBankCode(),
        bank.getCountryCode()
    );

    bank = bankRepository.save(bank);
    log.info("Bank registered successfully with ID: {}", bank.getId());
    return bank;
  }
}
