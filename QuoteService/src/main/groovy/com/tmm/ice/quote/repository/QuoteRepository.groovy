package com.tmm.ice.quote.repository

import com.tmm.ice.quote.domain.Quote
import org.springframework.data.repository.Repository

interface QuoteRepository extends Repository<Quote,String> {
	
	List<Quote> findAll()
	
	Optional<Quote> findOne( String id )
	
	Quote save( Quote quote )

}
