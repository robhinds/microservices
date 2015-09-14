package com.tmm.ice.quote.service

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Value
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.web.client.RestTemplate

@Service
class ProductService {

	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate
	
	protected String serviceUrl

	@Autowired
	public ProductService( @Value( '${productService.url}' ) String serviceUrl ) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl : "http://$serviceUrl"
	}

	public Map getProductMetadata( String productCode ) {
		restTemplate.getForObject( serviceUrl+ "/${productCode}", Map )
	}
}
