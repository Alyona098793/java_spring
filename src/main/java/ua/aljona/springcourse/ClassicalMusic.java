package ua.aljona.springcourse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{

    List<String> classicalList = new ArrayList<>();

    {classicalList.add("Hungarian Rhapsody");
    classicalList.add("Classical2");
    classicalList.add("Classical3");}


    @Override
    public String getSong() {
        Random random = new Random();
        return classicalList.get(random.nextInt(classicalList.size()));
    }
}
