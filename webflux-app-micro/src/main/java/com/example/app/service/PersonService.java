package com.example.app.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.app.modelo.Person;

import reactor.core.publisher.Flux;

@Service
public class PersonService {

	public Flux<Person> allPersons() {
		
	    WebClient webClient = WebClient.create();

	    Flux<Person> personsFlux1 = webClient.get()
	            .uri("http://localhost:8080/person-list-1")
	            .retrieve()
	            .bodyToFlux(Person.class);

	    Flux<Person> personsFlux2 = webClient.get()
	            .uri("http://localhost:8080/person-list-2")
	            .retrieve()
	            .bodyToFlux(Person.class);

	    Flux<Person> personsFlux3 = webClient.get()
	            .uri("http://localhost:8080/person-list-3")
	            .retrieve()
	            .bodyToFlux(Person.class);

	    Flux<Person> personsFlux4 = webClient.get()
	            .uri("http://localhost:8080/person-list-4")
	            .retrieve()
	            .bodyToFlux(Person.class);

	    return Flux.concat(personsFlux1, personsFlux2, personsFlux3, personsFlux4);
	}

}
