import Interfaces.IComment;
import Interfaces.IVideo;
import Interfaces.IVideoBlogBuilder;

import java.util.TreeSet;

public class Director {
    IVideoBlogBuilder Builder;

    public Director(IVideoBlogBuilder Builder){
        changeBuilder(Builder);
    }

    public void changeBuilder(IVideoBlogBuilder Builder){
        this.Builder = Builder;
    }

    public void buildAll(String blogName, TreeSet<IVideo> videos, TreeSet<TreeSet<IComment>> comments){
        Builder.reset(blogName);
        Builder.setVideos(videos);
        Builder.setComments(comments);
    }
}
