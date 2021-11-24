package com.example.videoblog;

import com.example.videoblog.Interfaces.IComment;

public class Comment implements IComment, Comparable<Comment> {
    String text;
    int likes;
    int dislikes;

    public Comment(String text, int likes, int dislikes){
        this.text = text;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public String getText(){
        return text;
    }

    public int getLikes(){
        return likes;
    }

    public int getDislikes(){
        return dislikes;
    }

    @Override
    public int compareTo(Comment anotherComment){
        if(this.likes < anotherComment.getLikes()){
            return -1;
        }
        else if(this.likes == anotherComment.getLikes()){
            return 0;
        }
        else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Text: " + text + "\nLikes: " + likes + "\nDislikes: " + dislikes;
    }
}
