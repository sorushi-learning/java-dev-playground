package com.learning.java.dev.playground.banks.constants;

public class APIEndPoints {

  private APIEndPoints() {
    // Private constructor to prevent instantiation
  }

  public static final String BASE_URL = "/api/banks";
  public static final String REGISTER = "/register";
  public static final String FETCH_ALL = "/fetchAll";
  public static final String FETCH_BY_ID = "/fetchById/{bankId}";
}
