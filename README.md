# Jasypt Configuration Demo Project

This project is designed to showcase the implementation of Jasypt for securing sensitive information within configuration files. Whether you are using Maven or Gradle, this guide will walk you through the process of encrypting and decrypting properties using Jasypt.

## Maven Project

### Encrypting Properties

Encrypting properties with Maven is a straightforward process. By default jasypt look for DEC(your_credentials) keys in .properties[.yaml/.yml] files and ecrypt them. Simply execute and the following command in your terminal:

```bash
mvn jasypt:encrypt "-Djasypt.encryptor.password=your_secret_key"

The command above only works for .properties file if you are using .yaml[.yml] file in your project you have to use this command below:

```bash
mvn jasypt:encrypt "-Djasypt.plugin.path=file:src/main/resources/application.yml" "-Djasypt.encryptor.password=your_secret_key"

Also you can add different jasypt configuration to command above, like if you have to want add another enryptor algorithm:

```bash
mvn jasypt:encrypt "-Djasypt.encryptor.password=your_secret_key" "-Djasypt.encryptor.algorithm=PBEWithMD5AndTripleDES"

All of them depend on your defined configurations in .properties file 

### Decrypting Properties

To Decrypt configuration properties you have to add command below: 
```bash
mvn jasypt:decrypt "-Djasypt.encryptor.password=your_secret_key"

For single value:

```bash
mvn jasypt:decrypt-value "-Djasypt.encryptor.password=your_secret_key" "-Djasypt.plugin.value=H6//IY2AAT+ACgIR6PVWxA+VtJJ/zsy3" 



