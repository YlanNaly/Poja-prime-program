package com.poja.prime.service;

import com.poja.prime.entity.BigIntegerEntity;
import com.poja.prime.repository.BigIntegerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Random;

@Service
@AllArgsConstructor
public class BigIntegerService {
    private BigIntegerRepository repository;
    public String generatePrimeNumber(){
        BigInteger probablePrime = BigInteger.probablePrime(2048, new Random());
        BigIntegerEntity bigIntegerEntity = new BigIntegerEntity();
        bigIntegerEntity.setBigNumber(probablePrime.toString());
        repository.save(bigIntegerEntity);
        return probablePrime.toString();
    }
}
