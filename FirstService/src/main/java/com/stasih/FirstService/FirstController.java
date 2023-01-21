package com.stasih.FirstService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/get")
    public ResponseEntity get(){
        return new ResponseEntity<>("Message from First Service!!!", HttpStatus.OK);
    }
}
