package in.AtmServices.www;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestCashMachine {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		CashMachine csm= (CashMachine) ctx.getBean("csm");
		csm.WithdrawAmount();
	}
}
