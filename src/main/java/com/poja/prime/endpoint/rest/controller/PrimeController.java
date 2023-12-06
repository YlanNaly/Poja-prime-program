package com.poja.prime.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;
import java.util.Random;

@RestController
public class PrimeController {

    @GetMapping(value = "/prime")
    public String generateNewPrime() {
        BigInteger probablePrime = BigInteger.probablePrime(2048, new Random());
        return probablePrime.toString();
    }
}
