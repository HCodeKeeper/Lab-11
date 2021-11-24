package Interfaces;

import java.util.TreeSet;

public interface IVideoBlogBuilder {
    void reset(String name);

    void setVideos(TreeSet<IVideo> videos);

    void setComments(TreeSet<TreeSet<IComment>> comments);

}
