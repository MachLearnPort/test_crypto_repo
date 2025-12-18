package com.example.crypto;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import io.jsonwebtoken.Jwts;
import com.nimbusds.jose.JWSAlgorithm;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.Security;

/**
 * Sample application demonstrating crypto library imports.
 * This is placeholder code for manifest parsing demonstration.
 */
public class CryptoApp {

    private static final Logger logger = LoggerFactory.getLogger(CryptoApp.class);

    static {
        // Register Bouncy Castle provider
        Security.addProvider(new BouncyCastleProvider());
    }

    public static void main(String[] args) {
        logger.info("Crypto libraries loaded successfully");
        logger.info("BouncyCastle provider: {}", Security.getProvider("BC"));
        logger.info("JJWT available: {}", Jwts.class.getName());
        logger.info("Nimbus JOSE available, algorithms: {}", JWSAlgorithm.RS256);

        ObjectMapper mapper = new ObjectMapper();
        logger.info("Jackson ObjectMapper initialized: {}", mapper);
    }
}
