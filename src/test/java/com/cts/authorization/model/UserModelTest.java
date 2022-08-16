package com.cts.authorization.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanTester;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserModelTest {

	private User user1;
	private User user2;
	

	@BeforeEach
	void setUp() throws Exception {
		
		user1 = new User();
		user2 = new User("CMS_M002", "user2", "pass2");
	}
	
	@Test
    void testPensionerBean() {
        final BeanTester beanTester = new BeanTester();
        beanTester.getFactoryCollection();
        beanTester.testBean(User.class);
    }
}
