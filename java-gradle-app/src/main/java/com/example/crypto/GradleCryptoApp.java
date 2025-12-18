package com.example.crypto;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import io.jsonwebtoken.Jwts;
import com.nimbusds.jose.JWSAlgorithm;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.Security;

/**
 * Sample Gradle application demonstrating crypto library imports.
 * This is placeholder code for manifest parsing demonstration.
 */
public class GradleCryptoApp {

    private static final Logger logger = LoggerFactory.getLogger(GradleCryptoApp.class);

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static void main(String[] args) {
        logger.info("Gradle Crypto App - Libraries loaded");
        logger.info("BouncyCastle: {}", Security.getProvider("BC"));
        logger.info("JJWT: {}", Jwts.class.getSimpleName());
        logger.info("Nimbus JOSE RS256: {}", JWSAlgorithm.RS256);

        ObjectMapper mapper = new ObjectMapper();
        logger.info("Jackson ready: {}", mapper != null);
    }
}
