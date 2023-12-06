package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.service.event.PrimeNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/new-prime")
public class PrimeNumberController {

    private final PrimeNumberService primeNumberService;

    @Autowired
    public PrimeNumberController(PrimeNumberService primeNumberService) {
        this.primeNumberService = primeNumberService;
    }

    @GetMapping
    public String getNewProbablePrime() {
        BigInteger probablePrime = primeNumberService.generateProbablePrime();
        return probablePrime.toString();
    }
}
