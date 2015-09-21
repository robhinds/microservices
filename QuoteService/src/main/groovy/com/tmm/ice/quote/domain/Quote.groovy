package com.tmm.ice.quote.domain

import org.springframework.data.annotation.Id

class Quote {
	
	@Id private String id
	private String product
	private String productVersion
	private Integer productId
	private Map<String, Object> document

}
