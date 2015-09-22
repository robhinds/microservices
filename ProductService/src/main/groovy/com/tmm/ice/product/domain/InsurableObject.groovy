package com.tmm.ice.product.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

import java.util.List;

import javax.persistence.Column
import groovy.transform.EqualsAndHashCode


@Entity
@EqualsAndHashCode( includes="id" )
class InsurableObject {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id
	
	List<Question> questions = new ArrayList<Question>()
	
	private List<Cover> covers = new ArrayList<Cover>()
	
}
