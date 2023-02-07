package spring_dependency;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Mobile {
	@PostConstruct
	void m1() 
	{
		System.out.println("This is init method");
	}
@PreDestroy
	void m2()
	{
		System.out.println("This is destroy method");
	}

	@Autowired
	//Airtel airtel;
	//Jio jio;
   //Airtel sim;
	//@Qualifier("jio")
	Sim sim;
}
