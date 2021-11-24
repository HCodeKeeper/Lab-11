import Interfaces.*;
import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        VideoBlogBuilder builder = new VideoBlogBuilder();
        Director director = new Director(builder);

        TreeSet<IVideo> videoSet1 = new TreeSet<IVideo>();
        videoSet1.add(new Video("www.url.com/aj12h8", "New Video1", 12399138, 198333, 30000));
        videoSet1.add(new Video("www.url.com/aj12h8", "New Video2", 13, 1, 1233));
        TreeSet<TreeSet<IComment>> comments1 = new TreeSet<TreeSet<IComment>>(new CommentSetComporator());
        TreeSet<IComment> commentSet1 = new TreeSet<IComment>();
        TreeSet<IComment> commentSet2 = new TreeSet<IComment>();
        commentSet1.add(new Comment("Cool vid", 1231123312, 11));
        commentSet1.add(new Comment("didn't like it", 123, 3123));
        comments1.add(commentSet1);
        comments1.add(commentSet2);

        /*
        commentSet1.add(new Comment("The most amazing video of All time", 123, 1));
        commentSet1.add(new Comment("Cool vid", 999999999, 200));
        */


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
