package com.jasypt.encoder;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class JasyptEncoderInSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(JasyptEncoderInSpringApplication.class, args);
    }

}
