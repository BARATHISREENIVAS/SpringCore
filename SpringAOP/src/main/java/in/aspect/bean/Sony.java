package in.aspect.bean;

import org.springframework.stereotype.Component;

@Component
public class Sony implements Speaker {

	public String makeSound(Song song){ 

        return "Playing the song "+ song.getTitle()+ " by " 

                + song.getSingerName()+ 

                " with Sony speakers"; 

    } 
}
