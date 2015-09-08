package com.tmm.ice.quote

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner)
@SpringApplicationConfiguration(classes = QuoteServiceApplication)
@WebAppConfiguration
class QuoteServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
