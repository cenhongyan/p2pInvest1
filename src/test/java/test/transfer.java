package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.android.entity.Borrower;
import com.android.entity.Transfer;
import com.android.service.BorrowerService;
import com.android.service.ProductService;
import com.android.service.TransferService;

public class transfer {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		BorrowerService borrowerService = (BorrowerService) applicationContext.getBean("borrowerService");
		TransferService transferService = (TransferService) applicationContext.getBean("transferService");
		List<Transfer> list = transferService.selectAll();
		Borrower borrower = new Borrower();
		List<Object> borrowerList = new ArrayList<Object>();
		for(Transfer tran:list)
		{
			borrower = borrowerService.selectById(tran.getBid());
			borrowerList.add(borrower);
			
		}
		
		System.out.println(JSON.toJSON(borrowerList));
	}

}
