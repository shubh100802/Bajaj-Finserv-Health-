package com.bfh.webhooksolver.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebhookResponse {
    @JsonProperty("webhook")
    private String webhookUrl;
    
    @JsonProperty("accessToken")
    private String accessToken;
    
    // Add any additional fields from the response if needed
}
