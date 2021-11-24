package com.example.videoblog;
import com.example.videoblog.Interfaces.IComment;
import com.example.videoblog.Interfaces.IVideo;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        //Too many calls. Could've done better
        VideoBlogBuilder builder = new VideoBlogBuilder();
        //Is a director usage is necessary in this project?
        Director director = new Director(builder);

        TreeSet<Video> videoSet1 = new TreeSet<Video>();
        videoSet1.add(new Video("www.url.com/aj12h8", "New Video1", 12399138, 198333, 30000));
        videoSet1.add(new Video("www.url.com/aj12h8", "New Video2", 13, 1, 1233));
        //Set of sets of comments of videos. Bad decision
        TreeSet<TreeSet<Comment>> comments1 = new TreeSet<TreeSet<Comment>>(new CommentSetComparator()); //TreeSet of TreeSets
        TreeSet<Comment> commentSet1 = new TreeSet<Comment>();
        TreeSet<Comment> commentSet2 = new TreeSet<Comment>();
        commentSet1.add(new Comment("Cool vid", 1231123312, 11));
        commentSet1.add(new Comment("didn't like it", 123, 3123));
        comments1.add(commentSet1);
        comments1.add(commentSet2);
        //


        director.buildAll("penguinz0", videoSet1, comments1);
        System.out.println(builder.getResult());
        System.out.println(builder.getResult().getVideos());
        for (IVideo video : builder.getResult().getVideos()){
            for (IComment comment : video.getComments()){
                System.out.println(comment);
            }
        }
    }
}
