package com.poja.prime.service.event;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class PrimeNumberService {

    public BigInteger generateProbablePrime() {
        return BigInteger.probablePrime(1000, new java.util.Random());
    }
}
