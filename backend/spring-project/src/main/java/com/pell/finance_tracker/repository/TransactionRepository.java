package com.pell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pell.model.Transactions;

public interface TransactionRepository extends JpaRepository<Transactions, Long>{
}