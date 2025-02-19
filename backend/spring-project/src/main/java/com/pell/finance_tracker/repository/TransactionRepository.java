package com.pell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pell.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
}