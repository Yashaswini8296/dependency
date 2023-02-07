package spring_dependency;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Jio implements Sim{
public void getSimdetails()
{
	System.out.println("This is Jio Sim");
}
static Sim createSim(String a)
{
	return Jio.createSim("dev");
}
}
