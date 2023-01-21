package com.stasih.SecondService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController {

    @GetMapping("/get")
    public ResponseEntity get(){
        return new ResponseEntity("Message from Second Service!!!", HttpStatus.OK);
    }
}
