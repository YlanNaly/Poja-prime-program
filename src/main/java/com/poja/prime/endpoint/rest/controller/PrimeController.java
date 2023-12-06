package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.service.BigIntegerService;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Value
public class PrimeController {
    BigIntegerService service;
    @GetMapping(value = "/prime")
    public String generateNewPrime() {
        return service.generatePrimeNumber();
    }
}
