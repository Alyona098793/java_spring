package ua.aljona.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{

    List<String> rockList = new ArrayList<>();

    {rockList.add("Wind cries Mary");
        rockList.add("Rock2");
        rockList.add("Rock3");}


    public String getSong(){

        Random random = new Random();
        return rockList.get(random.nextInt(rockList.size()));
    }
}
