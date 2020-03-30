package com.vmware.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vmware.model.Input;

@RestController
@RequestMapping(path = "/api")
public class CalculatorController
{
    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> add(@RequestBody Input input) throws Exception {
        int result = input.getX() + input.getY();
        return new ResponseEntity<String>("{\"result\":\"" + result + "\"}", HttpStatus.OK);
    }

    @PostMapping(path = "/diff", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> diff(@RequestBody Input input) throws Exception {
        int result = input.getX() - input.getY();
        return new ResponseEntity<String>("{\"result\":\"" + result + "\"}", HttpStatus.OK);
    }
}
