package spring.test.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        // id бина = имя класса с маленькой буквы
        Music music = context.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        Music music2 = context.getBean("rockMusic", Music.class);
        MusicPlayer classicalPlayer = new MusicPlayer(music2);
        classicalPlayer.playMusic();

        context.close();
    }
}
