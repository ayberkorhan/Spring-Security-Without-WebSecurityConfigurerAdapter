package com.example.springsecuritybasic.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/customer")
@CrossOrigin
public class CustomerController {



    @GetMapping()
    public ResponseEntity<String> getAccount(){
        return ResponseEntity.ok("customers");
    }


}
