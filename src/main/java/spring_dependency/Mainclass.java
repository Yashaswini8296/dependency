package spring_dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainclass {
public static void main(String[] args) {
	
	ApplicationContext context =new AnnotationConfigApplicationContext(SettingClass.class);
     Mobile mobile=(Mobile)context.getBean("mobile");
     Mobile mobile1 =(Mobile)context.getBean("mobile");
     Mobile mobile2 =(Mobile)context.getBean("mobile");
     Mobile mobile3=(Mobile)context.getBean("mobile");
     System.out.println(mobile);
     System.out.println(mobile1);
     System.out.println(mobile2);
     System.out.println(mobile3);
     
    //mobile.airtel.getSimdetails(); 
    //mobile.jio.getSimdetails();
    //mobile.sim.getSimdetails();
    //System.out.println(mobile);
	}
}

