package com.tmm.ice.quote.controller

import com.tmm.ice.quote.domain.Quote
import com.tmm.ice.quote.service.QuoteService
import com.tmm.ice.quote.service.external.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.PathVariable


@RestController
@RequestMapping
class QuoteController {

	@Autowired ProductService productService
	@Autowired QuoteService quoteService
	
	@RequestMapping( value="/{quoteId}", method=RequestMethod.GET )
	public Map getQuote( @PathVariable String quoteId ){
		Optional<Quote> quote = quoteService.getQuote( quoteId )
		if ( quote.isPresent() ){
			quote.get().document
		} else {
			[:]
		}
	}
	
	@RequestMapping( value="/{product}/premium", method=RequestMethod.GET )
	public Map calculateQuote( @PathVariable String product, @RequestParam String version ){
		//calculate the premium for the incoming quote using the metadata
		Map prodData = productService.getProductMetadata( "dummy-code" )
		
		//save quote
		Quote quote = quoteService.saveQuote( product, "v1", 1, [premium: 575.85, product: prodData, productCode:product ] )
		
		//return stubbed data
		quote.document + [id: quote.id]
	} 
}
