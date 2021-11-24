import Interfaces.*;

import java.util.Objects;
import java.util.TreeSet;

public class Video implements IVideo, Comparable<IVideo>{
    private String url;
    private String title;
    private int views;
    private int likes;
    private int dislikes;
    private TreeSet<IComment> comments;

    public Video(String url, String title, int views, int likes, int dislikes ){
        this.url = url;
        this.title = title;
        this.views = views;
        this.likes = likes;
        this.dislikes = dislikes;
        setComments(new TreeSet<IComment>());
    }

    public String getTitle(){
        return title;
    }

    public String getUrl(){
        return url;
    }

    public int getViews(){
        return views;
    }

    public int getLikes(){
        return likes;
    }

    public int getDislikes(){
        return dislikes;
    }

    public TreeSet<IComment> getComments(){
        TreeSet<IComment> newComments = new TreeSet<IComment>();
        for(IComment comment : comments){
            newComments.add(comment);
        }
        return newComments;
    }

    public void setComments(TreeSet<IComment> comments){
        this.comments = comments;
    }

    @Override
    public int compareTo(IVideo anotherVideo){
        if(this.views < anotherVideo.getViews()){
            return -1;
        }
        else if(this.views == anotherVideo.getViews()){
            return 0;
        }
        else{
            return 1;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IVideo videoBlog = (IVideo) o;
        return Objects.equals(this.url, videoBlog.getUrl());
    }

    @Override
    public String toString() {
        return "url: " + this.url + "\nTitle: " + this.title + "\nViews: " + this.views + "\nLikes: " +
                this.dislikes + "\nDislikes: " + this.dislikes;
    }
}
