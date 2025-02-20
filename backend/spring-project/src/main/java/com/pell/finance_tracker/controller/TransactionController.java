package com.pell.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.pell.model.Transaction;
import com.pell.repository.TransactionRepository;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    private final TransactionRepository transactionRepository;
    public TransactionController(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
    @GetMapping
    public List<Transaction> getAllTransactions(){
        return transactionRepository.findAll();
    }
}