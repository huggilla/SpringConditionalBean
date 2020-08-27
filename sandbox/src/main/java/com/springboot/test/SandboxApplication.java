package com.springboot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ExitCodeEvent;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.test.beans.Vehicle;

@SpringBootApplication
public class SandboxApplication {

	@Autowired
	Vehicle vehicle;

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SandboxApplication.class, args);
		
		DriveVehicle drive = context.getBean(DriveVehicle.class);
		drive.drive();
		
		int exitCode = SpringApplication.exit(context, (ExitCodeGenerator) () -> 0);
	    System.exit(exitCode);

	}

}
