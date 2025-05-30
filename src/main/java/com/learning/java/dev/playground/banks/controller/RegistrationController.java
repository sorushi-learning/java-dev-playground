package com.learning.java.dev.playground.banks.controller;

import com.learning.java.dev.playground.banks.constants.APIEndPoints;
import com.learning.java.dev.playground.banks.entity.Bank;
import com.learning.java.dev.playground.banks.service.RegistrationService;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(APIEndPoints.BASE_URL)
public class RegistrationController {

  private final RegistrationService registrationService;

  public RegistrationController(RegistrationService registrationService) {
    this.registrationService = registrationService;
  }

  @PostMapping(value = APIEndPoints.REGISTER, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Bank> registerBank(@Valid @RequestBody Bank bank) {

    Bank updatedBank = registrationService.registerBank(bank);

    return ResponseEntity.ok(updatedBank);
  }
}
