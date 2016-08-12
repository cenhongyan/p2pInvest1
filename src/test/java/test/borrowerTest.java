package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.android.entity.BorrowPlatform;
import com.android.entity.Borrower;
import com.android.entity.Borrowerinfo;
import com.android.service.BorrowPlatformService;
import com.android.service.BorrowerService;
import com.android.service.BorrowerinfoService;

public class borrowerTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        BorrowerinfoService borrower1Service = (BorrowerinfoService) applicationContext.getBean("borrowerinfoService");
		//BorrowPlatformService borrowPlatformService = (BorrowPlatformService) applicationContext.getBean("borrowPlatformService");
   	   // List<BorrowPlatform> list = borrowPlatformService.selectAll();
        
        Borrowerinfo borrower = borrower1Service.selectById(3);
		System.out.println(JSON.toJSON(borrower));
		
	}
	


}
