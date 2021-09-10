package com.example1.demo1;

import java.util.Scanner;

import com.example1.demo1.dto.UserDto;
import com.example1.demo1.model.Role;
import com.example1.demo1.service.impl.RoleServiceImpl;
import com.example1.demo1.service.impl.UserServiceImpl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	@Bean
	public CommandLineRunner initApp( UserServiceImpl userService,RoleServiceImpl roleService ){
		return args -> {
			
			Role usuario = new Role();
			usuario.setDescription("Rol para usuarios");
			usuario.setName("Usuario");
			Role admin = new Role();
			admin.setDescription("Rol para administradores");
			admin.setName("Admin");
			usuario = roleService.save(usuario);
			Role adminGuardado = roleService.save(admin);
			UserDto usr1 = new UserDto("red", "juan", "juan1", "password");
			UserDto usr2 = new UserDto("green", "pedro", "pedro1", "password");
			UserDto usr3 = new UserDto("yellow", "paco", "paco1", "password");
			UserDto usr4 = new UserDto("black", "xyah", "Xyah", "password");
			Role usr = roleService.findByName("Usuario");
			userService.save(usr1);
			userService.save(usr2);
			userService.save(usr3);
			userService.save(usr4);
		};
	}
}
