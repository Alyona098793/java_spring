package ua.aljona.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RockMusic implements Music{

    public String getSong(){
        return "I Wanna Be Loved By You";
    }
}
