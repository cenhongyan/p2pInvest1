package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.android.service.NoticeService;

public class noticeTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		NoticeService no = (NoticeService) applicationContext.getBean("noticeService");
		System.out.println(JSON.toJSON(no.selectAll()));
	}

}
