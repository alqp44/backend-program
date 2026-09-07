package me.ksm.springdeveloper;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    // "/hello" 요청을 보내면 hello() 메서드 호출
    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/test")
    public String postTest() {
        return "Post Test response!";
    }

    @DeleteMapping("/test")
    public String deleteTest() {
        return "Delete Test response!";
    }

    @PutMapping("/test")
    public  String putTest() {
        return "Put Test response!";
    }
}