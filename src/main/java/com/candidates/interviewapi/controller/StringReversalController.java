package com.candidates.interviewapi.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.candidates.interviewapi.service.StringReversalService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/reversal")
public class StringReversalController {

    @Autowired
    StringReversalService stringReversalService;

    // localhost:8080/api/v1/reversal/<string-goes-here>
    @GetMapping("/{stringToReverse}")
    @CrossOrigin(origins = {"http://localhost:3000"})
    public ResponseEntity<String> reverseString(@PathVariable String stringToReverse) {

       String reversedPhrase = stringReversalService.reversePhrase(stringToReverse);
        return new ResponseEntity<String>(reversedPhrase, HttpStatus.OK);
    }


    
}
