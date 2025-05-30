package com.learning.java.dev.playground.banks.service;

import com.learning.java.dev.playground.banks.entity.Bank;

import java.util.List;

public interface FetchDataService {

  List<Bank> fetchAllBanks();

  Bank fetchBankById(Long bankId);
}
