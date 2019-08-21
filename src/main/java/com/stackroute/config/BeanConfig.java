package com.stackroute.config;

import com.stackroute.beans.SpellChecker;
import com.stackroute.beans.TextEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean("textEditor")
    public TextEditor createTextEditor(){
        return new TextEditor(new SpellChecker());

    }

}
