package com.fran.gymprog;

import com.fran.gymprog.lifts.ExerciseType;
import com.fran.gymprog.lifts.Lifts;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			Lifts lifts = new Lifts(ExerciseType.BENCH_PRESS, 55, 8, "02/08/25");
		};
	}
}

