package com.example.webfluxclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TestController {
    @Autowired
    private IUserApi iUserApi;

    @GetMapping("/")
    public void test() {
        String id = "5afe6bc0609013373817abfc";
        iUserApi.getAllUser().subscribe(user -> {
            System.out.println(user.getName());
        });
        iUserApi.getUserById(id).subscribe(user -> {
            System.out.println(user.getName());
        });
        //创建用户
        iUserApi.createUser(
                Mono.just(User.builder().name("jwss").age(33).build()))
                .subscribe(System.out::println);

    }


}
