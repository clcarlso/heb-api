package com.candidates.interviewapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.candidates.interviewapi.service.StringReversalService;

@SpringBootTest
class InterviewApiApplicationTests {


    @Autowired
    StringReversalService stringReversalService;


    @Test
    void contextLoads() {


        String initialString = "Someday soon";
        String toCheckAgainst = "yademoS noos";


        String testReversePhrase = stringReversalService.reversePhrase(initialString);

        assertEquals(toCheckAgainst, testReversePhrase);

    }

}
