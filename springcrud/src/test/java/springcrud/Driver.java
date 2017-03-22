package springcrud;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.buisness.DemoBean;
import com.dto.Customer;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfiguration.xml");
		DemoBean demo=(DemoBean) context.getBean("db");
		//demo.insertCustomer(3, "chand", "thane");
		Customer customer=demo.selectCustomer(2);
		System.out.println("inserted customer name "+customer.getName());
		Customer customer2=new Customer();
		customer2.setCustid(1);
		customer2.setName("dar");
		customer2.setCity("tha");
		demo.updateCustomer(customer2);
		
	}
}
