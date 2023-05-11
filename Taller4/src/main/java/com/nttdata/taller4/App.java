package com.nttdata.taller4;

import reactor.core.publisher.Flux;


public class App {
    public static void main( String[] args ) {
        Flux<String> publisher = Flux.just("Mensaje 1", "Mensaje 2", "Mensaje 3");

        publisher.subscribe(mensaje -> System.out.println("Consumer 1. Received: " + mensaje),
                error -> System.out.println("Consumer 1. Error: " + error.getMessage()),
                () -> System.out.println("Consumer 1. Completed"));

        publisher.subscribe(mensaje -> System.out.println("Consumer 2. Received: " + mensaje),
                error -> System.out.println("Consumer 2. Error: " + error.getMessage()),
                () -> System.out.println("Consumer 2. Completed"));
    }
}
