package challenge.shopify.shengwei.codechallenge;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import shopify.challenge.shengwei.application.CodeChallengeApplication;
import shopify.challenge.shengwei.controller.InventoryController;

@SpringBootTest(classes = {CodeChallengeApplication.class})
@AutoConfigureMockMvc
class CodeChallengeApplicationTests {
	@Autowired
	InventoryController controller;
	
	@Test
	void contextLoads() throws Exception{
		assertNotNull(controller);
	}

}
