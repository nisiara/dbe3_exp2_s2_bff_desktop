package com.bancoxyz.bff_desktop.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor

public class InterestResponse {
  private String accountId;
  private String clientName;
  private Integer balance;
  private Integer clientAge;
  private String interestType;
}
