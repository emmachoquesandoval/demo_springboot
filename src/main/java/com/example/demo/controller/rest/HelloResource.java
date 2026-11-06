package com.example.demo.controller.rest;

import com.example.demo.dto.HelloDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(HelloResource.HELLO_RESOURCE)
public class HelloResource {
    public static final String HELLO_RESOURCE = "/hello";

    @GetMapping
    public ResponseEntity<HelloDto> hello(@RequestParam(defaultValue = "World") String name) {
        HelloDto h = new HelloDto(1, name);
        return ResponseEntity.ok(h);
    }
//     SOLO MUESTRA DEL ENDPOINT
//    @GetMapping("/demo/bye")
//    public String bye() {
//        return "<h1>Adiós Emma</h1>";
//    }
}
