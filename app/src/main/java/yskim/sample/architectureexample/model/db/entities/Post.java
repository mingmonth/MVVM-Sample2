package yskim.sample.architectureexample.model.db.entities;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int userId;

    // auto generate
    private Integer id;

    private String title;

    @SerializedName("body")
    private String text;

    public Post(int userId, String title, String text) {
        this.userId = userId;
        this.title = title;
        this.text = text;
    }

    public int getUserId() {
        return userId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
