package com.stackroute.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FrenchSpellChecker implements SpellChecker {
   @Override
    public void checkSpelling(){
        System.out.println("Inside French checkSpelling ." );
    }
}
