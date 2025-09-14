package com.bancoxyz.bff_desktop.restclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.bancoxyz.bff_desktop.model.dto.AnnualAccountResponse;
import com.bancoxyz.bff_desktop.model.dto.InterestResponse;
import com.bancoxyz.bff_desktop.model.dto.TransactionResponse;

@FeignClient(name = "backend", url = "http://localhost:8080/backend/api")
public interface DesktopRestClient {

  @GetMapping("/transaction")
	List<TransactionResponse> findAllTransactions();

  @GetMapping("/interest")
  List<InterestResponse> findAllInterests();
  
  @GetMapping("/annual-account")
  List<AnnualAccountResponse> findAllAnnualAccounts();

  
  
}
