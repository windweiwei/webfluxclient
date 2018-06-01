package com.example.webfluxclient;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import wei.com.example.ApiServer;

@ApiServer("http://localhost:8082/user")
public interface IUserApi {

    @GetMapping("/")
    Flux<User> getAllUser();

    @GetMapping("/find/{id}")
    Mono<User> getUserById(@PathVariable("id") String id);

    @DeleteMapping("/delete/{id}")
    Mono<Void> deleteUserById(@PathVariable("id") String id);

    @PostMapping("/save")
    Mono<User> createUser(@RequestBody Mono<User> user);
}
