package com.tmm.ice.quote.controller

import com.tmm.ice.quote.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

@RestController
@RequestMapping
class QuoteController {

	@Autowired ProductService productService
	
	public Map getQuote( String reference ){
		//look up from mongo DB
	}
	
	@RequestMapping( value="/premium", method=RequestMethod.GET )
	public Map calculateQuote( ){
		//calculate the premium for the incoming quote using the metadata
		Map prodData = productService.getProductMetadata( "dummy-code" )
		[premium: 575.85, product: prodData ]
	} 
}
