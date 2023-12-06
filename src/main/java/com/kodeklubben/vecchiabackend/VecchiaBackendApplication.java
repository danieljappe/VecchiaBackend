package com.kodeklubben.vecchiabackend;

import com.kodeklubben.vecchiabackend.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class VecchiaBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(VecchiaBackendApplication.class, args);
    }

}
