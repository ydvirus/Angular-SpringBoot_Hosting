package com.yusuf.restapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yusuf.bean.*;

@SpringBootApplication
@RestController
public class LibraryManagementApplication {

	@CrossOrigin("*")
	@GetMapping("/findAllBooks")
	public List<Book> getBooks(){
		return Stream.of(new Book(101,"java", 999),new Book(102,"python", 750),new Book(103,"c++", 900),
				new Book(104,"javascript", 199)).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);
	}

}
