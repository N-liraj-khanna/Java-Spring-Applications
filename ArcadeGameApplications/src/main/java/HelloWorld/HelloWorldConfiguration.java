package HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Athena";
	}
	@Bean
	public int age() {
		return 22;
	}
	@Bean
	@Primary
	public Person person() {
		var person=new Person("N LIRAJKHANNA", 21, new Address("Puduphet", "TN"));
		return person;
	}
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(),address());
	}
	@Bean
	public Person person3Parameters(String name, int age, Address address) {
		return new Person(name, age,address); //even unrecogized variable will set to primary
	}
	@Bean
	public Person person4Parameters(String name, int age, @Qualifier("address4qualifier")Address address) {
		return new Person(name, age,address); //to use something next primary -> secondary default
	}
	
	@Bean(name="address2")
	@Primary
	public Address address() {
		return new Address("Triplicane", "TN");
	}
	@Bean(name="address3")
	public Address address3() {
		return new Address("Tambaram", "TN");
	}
	@Bean(name="address4qualifier")
	@Qualifier("address4qualifier")
	public Address address4qualifier() {
		return new Address("Vellore", "TN");
	}
}
