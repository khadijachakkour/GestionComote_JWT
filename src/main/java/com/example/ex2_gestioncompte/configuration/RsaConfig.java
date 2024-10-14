package com.example.ex2_gestioncompte.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@ConfigurationProperties("rsa")
public record RsaConfig(RSAPublicKey publicKey, RSAPrivateKey rsaPrivateKey) {
}