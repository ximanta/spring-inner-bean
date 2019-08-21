package com.stackroute.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
public class GermanSpellChecker implements SpellChecker {
    @Override
    public void checkSpelling(){
        System.out.println("Inside German checkSpelling ." );
    }
}
