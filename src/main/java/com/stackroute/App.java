package com.stackroute;

import com.stackroute.beans.TextEditor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App 
{
    public static void main( String[] args ){
      ApplicationContext applicationContext=new AnnotationConfigApplicationContext(App.class);

      TextEditor textEditor = (TextEditor)applicationContext.getBean("textEditor");
      textEditor.spellCheck();


    }
}
