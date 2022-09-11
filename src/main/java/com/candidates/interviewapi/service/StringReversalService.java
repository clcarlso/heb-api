package com.candidates.interviewapi.service;

import org.springframework.stereotype.Service;

@Service
public class StringReversalService {
    

    public String reversePhrase(String stringToReverse) {
        String[] words = stringToReverse.split(" ");

        for ( int i = 0; i <= words.length-1; i++){
            String currentWord = words[i];
            String currentWordReversed = reverseWord(currentWord);
            words[i] = currentWordReversed;
        }

        String reversedPhrase= "";

        for(int i = 0; i <= words.length-1; i++){
            reversedPhrase = reversedPhrase + words[i] + " ";

        }

        reversedPhrase = reversedPhrase.trim();

        return reversedPhrase;
    }



        public String reverseWord(String word){

            char[] characters = word.toCharArray();
    
            String reversedWord = "";
    
            for(int j = characters.length-1; j >=0;j--){
    
                reversedWord = reversedWord + characters[j];
    
            }
    
            return reversedWord;
        }
}
