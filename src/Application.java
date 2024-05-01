import model.moderation.rjava.RedditJavaMod;
import model.posts.RedditPost;

public class Application {
    public static void main(String[] args) {
        RedditJavaMod mod = new RedditJavaMod();
        RedditPost post = new RedditPost("kevinb9n", "yadda yadda Kotlin yadda yadda");
        mod.moderate(mod.func, post);
    }
}
