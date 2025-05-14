package org.example.consumer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(names().subscribe(
                System.out::println
        ));

        System.out.println(name().subscribe(System.out::println));
    }

    public static Flux<String> names(){
        return Flux.fromIterable(List.of("islom", "tom", "kim huking"));
    }

    public static Mono<String> name(){
        return Mono.just("islom from mono");
    }
}
