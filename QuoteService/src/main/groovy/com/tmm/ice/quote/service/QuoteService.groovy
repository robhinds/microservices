package com.tmm.ice.quote.service

import com.tmm.ice.quote.domain.Quote
import com.tmm.ice.quote.repository.QuoteRepository
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional

@Service
class QuoteService {

	@Autowired private QuoteRepository quoteRepository
	
	@Transactional public Optional<Quote> getQuote( String quoteId ){
		quoteRepository.findOne( quoteId )
	}
	
	@Transactional public Quote saveQuote( String product, String productVersion, Integer productId, Map<String, Object> doc ){
		Quote quote = new Quote( product: product, productVersion: productVersion, productId: productId, document: doc )
		quoteRepository.save( quote )
		quote 
	}
}