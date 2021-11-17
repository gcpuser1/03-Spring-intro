package in.AtmServices.www;
//Shop Updated HS-001
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyShop {
	public static void main(String[] args) {
		ApplicationContext ctx =new  ClassPathXmlApplicationContext("Beans.xml");
		GrocessortStoreImplementation gc=(GrocessortStoreImplementation) ctx.getBean("grocessoryStoreImpl");
		gc.printMessages();
	}
}
