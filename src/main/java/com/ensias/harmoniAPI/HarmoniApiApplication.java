package com.ensias.harmoniAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.PropertySource;

import com.ensias.harmoniAPI.config.RsaKeyProperties;


@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
//@PropertySource("classpath:mongodb.properties")  //to access mongodb credentials in hidden file mongodb.properties 
public class HarmoniApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HarmoniApiApplication.class, args);
	}

}
