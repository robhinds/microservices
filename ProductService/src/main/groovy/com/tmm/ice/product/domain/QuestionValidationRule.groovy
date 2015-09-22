package com.tmm.ice.product.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Column
import groovy.transform.EqualsAndHashCode


@Entity
@EqualsAndHashCode( includes="id" )
class QuestionValidationRule {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id
}
