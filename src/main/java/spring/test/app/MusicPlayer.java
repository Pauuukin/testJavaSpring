package spring.test.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer (ClassicalMusic classicalMusic, RockMusic rockMusic){
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

//    /* *** внедряем зависимость через конструктор ***  */
//    @Autowired
//    private  Music music;


//    /* *** внедряем зависимость через конструктор ***  */
//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }


//    /* *** внедряем зависимость через сетер ***  */
//    @Autowired
//    public void setMusic(Music music){
//        this.music = music;
//    }

    public String playMusic(){
        return "Playing: " + classicalMusic.getSong();
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
    }

}
