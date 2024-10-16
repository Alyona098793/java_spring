package ua.aljona.springcourse;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public List<Music> beanMusicTypeList(){
        List<Music> musicTypeList = new ArrayList<>();
        musicTypeList.add(classicalMusic());
        musicTypeList.add(rockMusic());
        musicTypeList.add(jazzMusic());
        return musicTypeList;
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(beanMusicTypeList());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
