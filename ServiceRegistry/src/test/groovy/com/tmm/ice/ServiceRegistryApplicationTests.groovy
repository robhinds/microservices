package com.tmm.ice

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner)
@SpringApplicationConfiguration(classes = ServiceRegistryApplication)
@WebAppConfiguration
class ServiceRegistryApplicationTests {

	@Test
	void contextLoads() {
	}

}
