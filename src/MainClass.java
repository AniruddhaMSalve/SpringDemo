import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.Employee;
public class MainClass 
{
	public static void main(String[] args) 
	{
		Resource resource=new ClassPathResource("SpringConfig.xml");
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		Employee employee=(Employee)factory.getBean("empbean");
		System.out.println(employee);
	}
}