package com.shaheed.pmm.swagger;
	
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)
          .groupName("Service API")		
          .select()                                  
          .paths(path())                          
          .build()
          .apiInfo(apiInfo()) ;                                           
    }
	
	private Predicate<String> path(){
		return regex("/personelMoneyManager/.*");
	}
	
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Personel Money Manager")
				.description("This is a pilot project used for tracking home budget.")
				.termsOfServiceUrl("http://Shaheed.com")
				.license("Personel Money Manager License")
				.licenseUrl("www.google.co.in").version("1.0").build();
	}

}
