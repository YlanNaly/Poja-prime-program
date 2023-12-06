package com.poja.prime.repository;

import com.poja.prime.entity.BigIntegerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BigIntegerRepository extends JpaRepository<BigIntegerEntity, Integer> {
}
