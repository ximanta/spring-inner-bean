package com.stackroute;

import com.stackroute.beans.TextEditor;
import com.stackroute.config.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App 
{

    public static void main( String[] args ){

      ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BeanConfig.class);
      TextEditor textEditor = applicationContext.getBean("textEditor",TextEditor.class);
      textEditor.spellCheck();

    }
}
