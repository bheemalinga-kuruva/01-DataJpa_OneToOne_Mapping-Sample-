package com.bhim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bhim.model.Person;
import com.bhim.service.PersonService;
import com.bhim.service.PersonServiceImpl;

@SpringBootApplication
public class DataJpaOneToOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaOneToOneApplication.class, args);
	PersonServiceImpl bean = context.getBean(PersonServiceImpl.class);
	bean.savePerson();
    //bean.getPerson();
		//bean.getPassport();
	//	bean.getdeletePerson();
		
	}

}
