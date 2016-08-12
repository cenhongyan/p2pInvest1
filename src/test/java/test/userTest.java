package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.android.entity.ProductInvest;
import com.android.entity.User;
import com.android.service.ProductInvestService;
import com.android.service.UserService;

public class userTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		/*UserService userService = (UserService) applicationContext.getBean("userService");
		User userlist = userService.selectByName("caiyongning");*/
		ProductInvestService productInvestService = (ProductInvestService) applicationContext.getBean("productInvestService");
		ProductInvest invest = new ProductInvest();
		invest.setPid(2);
		invest.setUid(1);
		invest.setStatus(3);
		invest.setStartTime(7L);
		System.out.println(JSON.toJSON(productInvestService.insert(invest)));
	}

}
