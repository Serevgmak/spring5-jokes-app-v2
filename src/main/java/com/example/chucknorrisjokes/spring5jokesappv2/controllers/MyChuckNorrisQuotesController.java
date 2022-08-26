package com.example.chucknorrisjokes.spring5jokesappv2.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.chucknorrisjokes.spring5jokesappv2.services.QuotesService;

@Controller
public class MyChuckNorrisQuotesController {

	private final QuotesService quotesService;

	public MyChuckNorrisQuotesController(@Qualifier("myChuckNorrisQuotesService") QuotesService quotesService) {
		super();
		this.quotesService = quotesService;
	}

	@RequestMapping({ "/", "" })
	public String getQuote(Model model) {

		String joke = quotesService.myGetRandomQuoteMethod();

		model.addAttribute("joke", joke);

		return "index";
	}

}
