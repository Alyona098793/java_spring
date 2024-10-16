package ua.aljona.springcourse;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class ClassicalMusic implements Music{


    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }


    //classicalList.add("Classical2");
   //classicalList.add("Classical3");}


    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
