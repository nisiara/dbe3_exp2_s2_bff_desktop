package com.bancoxyz.bff_atm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancoxyz.bff_atm.model.dto.AnnualAccountResponse;
import com.bancoxyz.bff_atm.model.dto.InterestResponse;
import com.bancoxyz.bff_atm.model.dto.TransactionResponse;
import com.bancoxyz.bff_atm.restclient.ATMRestClient;


@Service
public class ATMService {

  @Autowired
  private ATMRestClient atmRestClient;

  public ATMService(ATMRestClient atmRestClient){
    this.atmRestClient = atmRestClient;
  }

  private List<TransactionResponse> findAllTransactions() {
		return atmRestClient.findAllTransactions();
	}

  public List<TransactionResponse> invalidTransactions() {
    return findAllTransactions().stream()
      .filter(transaction -> transaction.getType().equalsIgnoreCase("invalid"))
      .toList();
  }
  
  public List<InterestResponse> findAllInterests() {
    return atmRestClient.findAllInterests();
  }

  public List<AnnualAccountResponse> findAllAnnualAccounts() {
    return atmRestClient.findAllAnnualAccounts();
  }
  
}
