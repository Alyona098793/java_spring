package ua.aljona.springcourse;

import org.springframework.beans.factory.annotation.Value;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    public int getVolume() {
        return volume;
    }
    public String getName() {
        return name;
    }

    List<Music> musicTypeList;

    public MusicPlayer(List<Music> musicTypeList) {
        this.musicTypeList = musicTypeList;

    }

    public String playMusic() {
        Random random = new Random();
        return musicTypeList.get(random.nextInt(musicTypeList.size())).getSong();

    }
}


