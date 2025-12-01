package com.bfh.webhooksolver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import com.bfh.webhooksolver.service.WebhookService;

@SpringBootApplication
public class BfhWebhookSolverApplication {

    private final WebhookService webhookService;

    public BfhWebhookSolverApplication(WebhookService webhookService) {
        this.webhookService = webhookService;
    }

    public static void main(String[] args) {
        SpringApplication.run(BfhWebhookSolverApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onStartup() {
        webhookService.startProcess()
                .doOnSuccess(result -> System.out.println("Process completed successfully!"))
                .doOnError(error -> System.err.println("Error during process: " + error.getMessage()))
                .subscribe();
    }
}
