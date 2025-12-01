package com.bfh.webhooksolver.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class WebhookService {
    // Add your webhook handling methods here
    
    public String processWebhook(String payload) {
        // Implement your webhook processing logic here
        return "Webhook processed successfully";
    }
    
    public Mono<String> startProcess() {
        // Implement your reactive process logic here
        return Mono.just("Process started successfully")
                  .doOnSuccess(result -> System.out.println("Processing started"))
                  .doOnError(error -> System.err.println("Error in startProcess: " + error.getMessage()));
    }
}
