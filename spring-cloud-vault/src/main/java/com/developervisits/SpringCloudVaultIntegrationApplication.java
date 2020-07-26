package com.developervisits;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudVaultIntegrationApplication implements CommandLineRunner {
    // Reading through yml file
    @Value("${app.security.key}")
    private String appSecurityKey;
    // Accessing same key what we added in vault and accessing that directly in @Value()
    @Value("${appSecurityKey}")
    private String secretKeyVaultDirectAccess;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudVaultIntegrationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Password fetched from vault:" + appSecurityKey);
        System.out.println("Accessing vault key directly :" + secretKeyVaultDirectAccess);
    }
}
