package com.gamestriker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/")
@RestController
public class WellComeController {

    @GetMapping
    public ResponseEntity<String> greetings() {
        System.out.println("Inside WellComeController of Tournament Service");
        return ResponseEntity.ok("Response From welcome controller of Tournament Service")
                ;
    }
}
