package com.bancoxyz.bff_desktop.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AnnualAccountResponse {
   private Long id;
   private String accountId;
   private String date;
   private String transactionType;
   private Integer amount;
   private String transactionDescription;
}
