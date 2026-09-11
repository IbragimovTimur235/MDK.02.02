package task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Post {
    private String title;                      // заголовок
    private String content;                    // содержание
    private String[] tags;                     // теги
    private ArrayList<PostComment> comments;   // комментарии


    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }


    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String[] getTags() {
        return tags;
    }

    public ArrayList<PostComment> getComments() {
        return comments;
    }

    @Override
    public String toString() {
        // длина содержания; если content == null — выводим 0
        int contentLength = (content == null) ? 0 : content.length();

        return "Post{" +
                "title='" + title + '\'' +
                ", content.length='" + contentLength + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", comments=" + comments +
                '}';
    }
}
