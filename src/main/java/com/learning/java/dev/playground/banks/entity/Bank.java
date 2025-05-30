package com.learning.java.dev.playground.banks.entity;

import com.learning.java.dev.playground.banks.constants.DBConstants;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Bank {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = DBConstants.BANK_NAME_COLUMN, nullable = false)
  private String bankName;

  @Column(name = DBConstants.BANK_CODE_COLUMN, nullable = false, unique = true)
  private String bankCode;

  @Column(name = DBConstants.COUNTRY_CODE_COLUMN, nullable = false)
  private String countryCode;
}
