package ua.aljona.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;
    private TypeMusic typeMusic;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    public String playMusic(TypeMusic typeMusic) {
        switch (typeMusic){
            case ROCK:
                return "Playing: " + music1.getSong();
            case CLASSICAL:
                return "Playing: " + music2.getSong();
            default:
                    return "Invalid typeMusic";

        }

    }
}


