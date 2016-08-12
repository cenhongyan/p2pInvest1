package test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.android.entity.Type;
import com.alibaba.fastjson.JSON;
import com.android.entity.Product;
import com.android.service.ProductService;
import com.android.service.TypeService;
import com.android.service.UserService;

public class productTest {

	@Test
	public void test() throws ParseException {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		//ProductService userService = (UserService) applicationContext.getBean("userService");
		ProductService productService = (ProductService) applicationContext.getBean("productService");
		Product p = productService.selectByMax();
	
		String dateString = "2016-8-8 14:58:03";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date = format.parse(dateString);
		System.out.println(date.getTime());
	}

}
