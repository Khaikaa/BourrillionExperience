package model.moderation;

import model.posts.RedditPost;

public class RedditMod {
    public Mood mood;
    public String[] triggerWords;

    public RedditMod(Mood mood, String[] triggerWords) {
        this.mood = mood;
        this.triggerWords = triggerWords;
    }

    public void moderate(Entitlable entitlable, RedditPost post) {
        int triggerWordPosition = entitlable.entitle(post.content, triggerWords);
        if(triggerWordPosition > -1) {
            this.mood = Mood.ENTITLED;
        }

        if(this.mood == Mood.ENTITLED) {
            ban(post.username, "Go brag about " + triggerWords[triggerWordPosition] + " elsewhere, bitch!");
        } else {
            warn(post.username, "Read the rules please");
        }
    }

    public void warn(String username, String reason) {
        System.out.println(username + " has been warned.");
        System.out.println("Reason: " + reason);
    }

    public void ban(String username, String reason) {
        System.out.println(username + " has been banned.");
        System.out.println("Reason: " + reason);
    }
}
