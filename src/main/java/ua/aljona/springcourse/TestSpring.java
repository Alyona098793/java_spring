package ua.aljona.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

       ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
       System.out.println(classicalMusic.getSong());



        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("firstmusicPlayer : " + firstmusicPlayer);
        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("secondmusicPlayer : " + secondmusicPlayer);

        boolean comparison = firstmusicPlayer == secondmusicPlayer;

        System.out.println(comparison);

        System.out.println(firstmusicPlayer);
        System.out.println(secondmusicPlayer);

        firstmusicPlayer.setVolume(10);

        System.out.println(firstmusicPlayer.getVolume());
        System.out.println(secondmusicPlayer.getVolume());

        context.close();
    }
}
