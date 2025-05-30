package com.learning.java.dev.playground.banks.constants;

public class DBConstants {

  private DBConstants() {
    // Private constructor to prevent instantiation
  }

  public static final String ACCOUNT_TABLE = "accounts";
  public static final String BANK_TABLE = "banks";

  public static final String ACCOUNT_NUMBER_COLUMN = "account_number";
  public static final String ACCOUNT_HOLDER_NAME_COLUMN = "account_holder_name";
  public static final String BALANCE_COLUMN = "balance";
  public static final String BANK_ID_COLUMN = "bank_id";

  public static final String BANK_NAME_COLUMN = "bank_name";
  public static final String BANK_CODE_COLUMN = "bank_code";
  public static final String COUNTRY_CODE_COLUMN = "country_code";
}
