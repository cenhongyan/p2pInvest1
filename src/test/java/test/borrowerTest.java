package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.android.entity.Borrower;
import com.android.entity.Borrowerinfo;
import com.android.service.BorrowerService;
import com.android.service.BorrowerinfoService;

public class borrowerTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		BorrowerService borrowerService = (BorrowerService) applicationContext.getBean("borrowerService");
		List<Borrower> list = borrowerService.selectAll();
		BorrowerinfoService borrowerinfoService = (BorrowerinfoService) applicationContext.getBean("borrowerinfoService");
		Borrowerinfo info = borrowerinfoService.selectById(3);
		System.out.println(info);
		System.out.println(JSON.toJSON(list));
		
	}

}
