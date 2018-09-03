package demo;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DrawingApp 
{
	public static void main(String[] args) 
	{
		//Triangle triangle=new Triangle();//simple object creation 
		Resource resource=new ClassPathResource("spring.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");//Using ApplicationContext
		//XmlBeanFactory factory=new XmlBeanFactory(resource);//Using BeanFactory
		//Triangle triangle=(Triangle)factory.getBean("triangle");//for BeanFactory
		Triangle triangle=(Triangle)context.getBean("triangle");
		//Triangle triangle=(Triangle)context.getBean("triangle-alias");//Using alias tag
		triangle.draw();
	}
}
