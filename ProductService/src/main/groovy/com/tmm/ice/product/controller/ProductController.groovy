package com.tmm.ice.product.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.PathVariable

@RestController
@RequestMapping
class ProductController {

	@RequestMapping( value="/{productCode}", method=RequestMethod.GET )
	public Map getProductMetadata( @PathVariable productCode ){
		[
			product: "code",
			questions: [:],
			crossValidation: [:],
			operations: [:]
		]
	} 
}
