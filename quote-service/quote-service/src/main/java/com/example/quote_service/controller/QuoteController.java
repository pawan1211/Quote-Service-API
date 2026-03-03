package com.example.quote_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quote_service.model.Quote;
import com.example.quote_service.service.QuoteService;

@RestController
public class QuoteController {

    private final QuoteService quoteService;

    // Constructor Injection 
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/api/quote")
    public Quote getQuote() {
        return quoteService.getDailyQuote();
    }
}