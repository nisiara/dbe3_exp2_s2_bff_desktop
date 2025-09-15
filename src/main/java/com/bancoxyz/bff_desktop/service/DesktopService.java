package com.bancoxyz.bff_desktop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancoxyz.bff_desktop.model.dto.AnnualAccountResponse;
import com.bancoxyz.bff_desktop.model.dto.InterestResponse;
import com.bancoxyz.bff_desktop.model.dto.TransactionResponse;
import com.bancoxyz.bff_desktop.restclient.DesktopRestClient;


@Service
public class DesktopService {

  @Autowired
  private DesktopRestClient desktopRestClient;

  public DesktopService(DesktopRestClient desktopRestClient){
    this.desktopRestClient = desktopRestClient;
  }

  public List<TransactionResponse> findAllTransactions() {
		return desktopRestClient.findAllTransactions();
	}
  
  public List<InterestResponse> findAllInterests() {
    return desktopRestClient.findAllInterests();
  }

  public List<AnnualAccountResponse> findAllAnnualAccounts() {
    return desktopRestClient.findAllAnnualAccounts();
  }
  
}
