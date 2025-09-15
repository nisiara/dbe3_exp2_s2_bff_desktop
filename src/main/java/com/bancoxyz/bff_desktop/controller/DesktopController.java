package com.bancoxyz.bff_desktop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancoxyz.bff_desktop.model.dto.AnnualAccountResponse;
import com.bancoxyz.bff_desktop.model.dto.InterestResponse;
import com.bancoxyz.bff_desktop.model.dto.TransactionResponse;
import com.bancoxyz.bff_desktop.service.DesktopService;

@RestController
@CrossOrigin
@RequestMapping("/api/bff-desktop")
public class DesktopController {

  @Autowired
  private DesktopService desktopService;

  public DesktopController(DesktopService desktopService){
    this.desktopService = desktopService;
  }

  @GetMapping("/transaction")
  public ResponseEntity<List<TransactionResponse>> getTransactions(){
    return ResponseEntity.ok(desktopService.findAllTransactions());
  }    

  @GetMapping("/interest")
  public ResponseEntity<List<InterestResponse>> getAllInterests() {
    return ResponseEntity.ok(desktopService.findAllInterests());
  }

  @GetMapping("/annual-account")
  public ResponseEntity<List<AnnualAccountResponse>> getAllAnnualAccounts() {
    return ResponseEntity.ok(desktopService.findAllAnnualAccounts());
  }
  
}
