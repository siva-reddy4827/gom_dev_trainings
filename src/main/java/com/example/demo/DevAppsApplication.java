package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevAppsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevAppsApplication.class, args);
		System.out.println("adding a line");
        System.out.println("secondline");
        System.out.println("adding a line in featurebranch");

<<<<<<< HEAD
        System.out.println("rebasing in main");
        System.out.println("Rebasing ontop of mainbranch");
=======
		System.out.println("secondline");

		System.out.println("adding a line in featurebranch");
		System.out.println("rebasing in main");
		System.out.println("MAIN");
	

>>>>>>> a17c41c4eccac632361c972874dae5e053bc22a3
	}

}
