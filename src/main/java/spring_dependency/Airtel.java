package spring_dependency;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Airtel implements Sim {
	public void getSimdetails()
	{
		System.out.println("This is Airtel Sim");
	}
	static Sim createSim(String a)
	{
		return new Airtel();
}
}