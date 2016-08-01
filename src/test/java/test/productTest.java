package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.android.entity.Product;
import com.android.service.ProductService;
import com.android.service.UserService;

public class productTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		//ProductService userService = (UserService) applicationContext.getBean("userService");
		ProductService productService = (ProductService) applicationContext.getBean("productService");
		
		System.out.println(JSON.toJSON(productService.selectAllByOrder()));
	}

}
