/**
 * @author shaheed
 * This is the starting point of the application. 
 * By running this class, you can start using <b>Personel Money Manager</b> application.*/

package com.shaheed.pmm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan("com.shaheed")
public class PersonelMoneyManager {

	public static void main(String[] args) {
		SpringApplication.run(PersonelMoneyManager.class, args);
	}

}
