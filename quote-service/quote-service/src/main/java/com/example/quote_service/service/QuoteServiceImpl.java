package com.example.quote_service.service;


import org.springframework.stereotype.Service;

import com.example.quote_service.model.Quote;

@Service
public class QuoteServiceImpl implements QuoteService {

    @Override
    public Quote getDailyQuote() {
        return new Quote(
                "Consistency is what transforms average into excellence.",
                "Unknown"
        );
    }
}