package com.stackroute.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("textEditor")
public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor() {
    }

    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    // a setter method to set the dependency
    @Autowired
    //Uncomment this to use GermanSpellChecker. @Qualifier takes precedence
    //over @Primary
   // @Qualifier("germanSpellChecker")
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
