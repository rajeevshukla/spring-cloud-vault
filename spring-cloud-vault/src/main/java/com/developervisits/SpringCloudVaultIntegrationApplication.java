package com.developervisits;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudVaultIntegrationApplication implements CommandLineRunner {
    @Value("${oraclePassword}")
    private String oraclePassword;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudVaultIntegrationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Password fetched from vault:" + oraclePassword);
    }
}
