package com.pell.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.pell.model.Transactions;
import com.pell.repository.TransactionRepository;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionRepository transactionRepository;
    public TransactionController(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
    @GetMapping
    public List<Transactions> getAllTransactions(){
        return transactionRepository.findAll();
    }
}