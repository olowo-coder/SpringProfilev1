package com.example.springprofilev1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/action")
public class DemoController {

    @Value("${application.name}")
    private String val;

    @GetMapping
    public ResponseEntity<?> test(){
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("Status", val));
    }
}
