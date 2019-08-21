package com.stackroute.beans;

import org.springframework.stereotype.Component;

public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor() {
    }
    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    // a setter method to set the dependency
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
