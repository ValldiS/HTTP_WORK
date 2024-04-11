package org.example;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.Objects;

public class Format {

    private  String id;
    private  String text;
    private  String type;
    private  String user;
    private  Integer upvotes;

    public Format(
            @JsonProperty("id")String id,
            @JsonProperty("text")String text,
            @JsonProperty("type")String type,
            @JsonProperty("user")String user,
            @JsonProperty("upvotes")Integer upvotes
    ){
        this.id = id;
        this.text= text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Format format = (Format) o;
        return Objects.equals(id, format.id) && Objects.equals(text, format.text) && Objects.equals(type, format.type) && Objects.equals(user, format.user) && Objects.equals(upvotes, format.upvotes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, type, user, upvotes);
    }

    @Override
    public String toString() {
        return "Format{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes=" + upvotes +
                '}';
    }
}
