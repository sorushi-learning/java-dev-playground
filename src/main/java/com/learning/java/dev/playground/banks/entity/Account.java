package com.learning.java.dev.playground.banks.entity;

import com.learning.java.dev.playground.banks.constants.DBConstants;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = DBConstants.ACCOUNT_TABLE)
public class Account {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = DBConstants.ACCOUNT_NUMBER_COLUMN, nullable = false, unique = true)
  private String accountNumber;

  @Column(name = DBConstants.ACCOUNT_HOLDER_NAME_COLUMN, nullable = false)
  private String accountHolderName;

  @Column(name = DBConstants.BALANCE_COLUMN, nullable = false)
  private BigDecimal balance;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = DBConstants.BANK_ID_COLUMN, nullable = false)
  private Bank bank;
}
