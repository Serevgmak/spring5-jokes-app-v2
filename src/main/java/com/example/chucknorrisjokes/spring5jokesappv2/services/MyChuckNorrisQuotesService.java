package com.example.chucknorrisjokes.spring5jokesappv2.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class MyChuckNorrisQuotesService implements QuotesService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public MyChuckNorrisQuotesService() {
		super();
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String myGetRandomQuoteMethod() {
		return this.chuckNorrisQuotes.getRandomQuote();
	}

}
