package com.example.centralize;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Pipeline;
import com.example.contract.Queries.TestQueries.Ping;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@SpringBootApplication
public class CentralizeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralizeApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {
		return args -> {
			// Lấy bean `Pipeline` từ ApplicationContext
			Pipeline pipeline = context.getBean(Pipeline.class);
			System.out.println("Pipeline Bean Information:");
			System.out.println("Class: " + pipeline.getClass().getName());

			// Lấy tất cả Command.Handler beans
			List<Command.Handler> handlers = context.getBeanProvider(Command.Handler.class)
					.orderedStream()
					.collect(Collectors.toList());
			System.out.println("Command Handlers:");
			handlers.forEach(handler ->
					System.out.println("Handler: " + handler.getClass().getName())
			);

			// Lấy tất cả Command.Middleware beans
			List<Command.Middleware> middlewares = context.getBeanProvider(Command.Middleware.class)
					.orderedStream()
					.collect(Collectors.toList());
			System.out.println("Middlewares:");
			middlewares.forEach(middleware ->
					System.out.println("Middleware: " + middleware.getClass().getName())
			);
		};
	}
}
