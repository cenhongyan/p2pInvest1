package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.android.entity.User;
import com.android.service.UserService;

public class userTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		List<User> userlist = userService.selectAll();
		for(User u:userlist)
		{
			System.out.println(u);
		}
	}

}
