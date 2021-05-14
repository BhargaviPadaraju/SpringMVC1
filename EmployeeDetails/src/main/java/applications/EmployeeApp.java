package applications;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Employee;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Employee e = (Employee)ac.getBean("emp");
		System.out.println(e.getEid());
		System.err.println(e.getEname());
		System.out.println(e.getSkillset());
		System.out.println(e.getPhoneNumbers());
		System.out.println(e.getEmailIds());
		System.out.println(e.getApp_pro());

	}

}
