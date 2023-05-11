package com.example.server.controller;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.server.modelo.Person;


import io.netty.util.internal.ThreadLocalRandom;
import reactor.core.publisher.Flux;

@RestController
public class PersonListController {

    @GetMapping("/person-list-1")
    public Flux<Person> personList1() {
    	return Flux.range(1, 2)
                .map(i -> new Person("list1: " + i,"list1: " + i, i))
                .delayElements(Duration.ofSeconds(ThreadLocalRandom.current().nextInt(1, 5)));  
    	
    }

    @GetMapping("/person-list-2")
    public Flux<Person> personList2() {
    	return Flux.range(1, 2)
                .map(i -> new Person("list2: " + i,"list2: " + i, i))
                .delayElements(Duration.ofSeconds(ThreadLocalRandom.current().nextInt(1, 5)));  
    	
    }

    @GetMapping("/person-list-3")
    public Flux<Person> personList3() {
    	return Flux.range(1, 2)
                .map(i -> new Person("list3: " + i,"list3: " + i, i))
                .delayElements(Duration.ofSeconds(ThreadLocalRandom.current().nextInt(1, 5)));  
    	
    }

    @GetMapping("/person-list-4")
    public Flux<Person> personList4() {
    	return Flux.range(1, 2)
                .map(i -> new Person("list4: " + i,"list4: " + i, i))
                .delayElements(Duration.ofSeconds(ThreadLocalRandom.current().nextInt(1, 5)));  
    }
}
