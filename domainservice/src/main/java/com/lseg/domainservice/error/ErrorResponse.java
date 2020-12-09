package com.lseg.domainservice.error;

import lombok.Data;

@Data
public class ErrorResponse {
   private String code;
   private String description;
   private String resolution;
   
}
