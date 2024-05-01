package model.moderation.rjava;

import model.moderation.Entitlable;
import model.moderation.RedditMod;
import model.moderation.Mood;

public class RedditJavaMod extends RedditMod {
    public Entitlable func;

    public RedditJavaMod() {
        super(Mood.HAPPY, new String[] {"Kotlin"});
        this.func = (text, triggerWords) -> {
            if(triggerWords.length == 0) return -1;
            for(int i = 0; i < triggerWords.length; i++) {
                if(text.contains(triggerWords[i])) return i;
            }
            return -1;
        };
    }
}
