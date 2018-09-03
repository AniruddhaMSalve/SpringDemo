package com;
import org.springframework.context.annotation.Bean;

public class BeanCreation {
@Bean(name="empbean")
public String createBean(String a)
{
	return toString();
}
}
