package com.example.springsecuritybasic.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/account")
@PreAuthorize("hasRole('admin')")
@CrossOrigin
public class AccountController {

    @PostMapping()
    public ResponseEntity<String> getAccount(){
        return ResponseEntity.ok("accounts");
    }
}
