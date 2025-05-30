package com.learning.java.dev.playground.banks.controller;

import com.learning.java.dev.playground.banks.constants.APIEndPoints;
import com.learning.java.dev.playground.banks.entity.Bank;
import com.learning.java.dev.playground.banks.service.FetchDataService;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(APIEndPoints.BASE_URL)
public class FetchDataController {

  private final FetchDataService fetchDataService;

  public FetchDataController(FetchDataService fetchDataService) {
    this.fetchDataService = fetchDataService;
  }

  @PostMapping(value = APIEndPoints.FETCH_BY_ID, produces = MediaType.APPLICATION_JSON_VALUE)
  public Bank fetchBankById(@PathVariable @Valid Long bankId) {
    return fetchDataService.fetchBankById(bankId);
  }

  @PostMapping(value = APIEndPoints.FETCH_ALL, produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Bank> fetchAllBanks() {
    return fetchDataService.fetchAllBanks();
  }

}
