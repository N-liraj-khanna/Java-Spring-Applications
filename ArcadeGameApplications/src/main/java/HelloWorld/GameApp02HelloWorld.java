package HelloWorld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class GameApp02HelloWorld {
	
	public static  void main(String[] args) {
		
		try (// 1.Launch spring context
			var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
				// 3.Retrieve beans created - many ways available
				System.out.println(context.getBean("name"));
				System.out.println(context.getBean("age"));
				
				System.out.println(context.getBean("person").name);
				System.out.println(context.getBean("person2MethodCall"));
				System.out.println(context.getBean("person3Parameters"));
				System.out.println(context.getBean(Person.class));
				System.out.println(context.getBean("person4Parameters"));
				
				System.out.println(context.getBean(Address.class));//@primary used 
				System.out.println(context.getBean("address2"));
				
	//		Get all spring beans
				Arrays.asList(context.getBeanDefinitionNames()).stream().sorted().forEach(System.out::println);
			} catch (BeansException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


