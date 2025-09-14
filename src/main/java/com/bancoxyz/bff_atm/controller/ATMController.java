package com.bancoxyz.bff_atm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancoxyz.bff_atm.model.dto.AnnualAccountResponse;
import com.bancoxyz.bff_atm.model.dto.InterestResponse;
import com.bancoxyz.bff_atm.model.dto.TransactionResponse;
import com.bancoxyz.bff_atm.service.ATMService;

@RestController
@CrossOrigin
@RequestMapping("/api/bff-atm")
public class ATMController {

  @Autowired
  private ATMService atmService;

  public ATMController(ATMService atmService){
    this.atmService = atmService;
  }

  @GetMapping("/invalid-transaction")
  public ResponseEntity<List<TransactionResponse>> getInvalidTransactions(){
    return ResponseEntity.ok(atmService.invalidTransactions());
  }    

  @GetMapping("/interest")
  public ResponseEntity<List<InterestResponse>> getAllInterests() {
    return ResponseEntity.ok(atmService.findAllInterests());
  }

  @GetMapping("/annual-account")
  public ResponseEntity<List<AnnualAccountResponse>> getAllAnnualAccounts() {
    return ResponseEntity.ok(atmService.findAllAnnualAccounts());
  }
  
}
