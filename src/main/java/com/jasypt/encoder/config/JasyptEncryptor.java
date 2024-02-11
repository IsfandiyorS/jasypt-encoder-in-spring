package com.jasypt.encoder.config;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JasyptEncryptor {

    @Value("${jasypt.encryptor.password:secret}")
    public String secretKey;

    @Value("${jasypt.encryptor.algorithm}")
    public String algorithm;

    @Value("${jasypt.encryptor.key-obtention-iterations}")
    public String keyObtentionIterations;

    @Value("${jasypt.encryptor.pool-size}")
    public String poolSize;

    @Value("${jasypt.encryptor.salt-generator-classname}")
    public String generatorClassName;

    @Value("${jasypt.encryptor.string-output-type}")
    public String outputType;

    @Value("${jasypt.encryptor.iv-generator-classname}")
    public String ivClassname;

    @Bean(name = "jasyptStringEncryptor")
    public StringEncryptor propertyEncryptor(){
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setPassword(secretKey);
        config.setAlgorithm(algorithm);
        config.setKeyObtentionIterations(keyObtentionIterations);
        config.setPoolSize(poolSize);
        config.setSaltGeneratorClassName(generatorClassName);
        config.setStringOutputType(outputType);
        config.setIvGeneratorClassName(ivClassname);
        encryptor.setConfig(config);
        return encryptor;
    }

}
