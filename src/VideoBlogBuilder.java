import Interfaces.*;
import java.util.Iterator;
import java.util.TreeSet;

public class VideoBlogBuilder implements IVideoBlogBuilder {
    VideoBlog videoBlog;

    public void reset(String BlogName){
        this.videoBlog = new VideoBlog(BlogName);
    }

    public void setVideos(TreeSet<IVideo> videos){
        videoBlog.setVideos(videos);
    }

    public void setComments(TreeSet<TreeSet<IComment>> comments){
        if (comments.size() != videoBlog.getVideos().size()){
            throw new IndexOutOfBoundsException("Number of comments doesn't equal number of videos");
        }

        Iterator<IVideo> videoIterator = videoBlog.getVideos().iterator();

        for(TreeSet<IComment> commentSet: comments){
            videoIterator.next().setComments(commentSet);
        }
    }

    public VideoBlog getResult(){
        return videoBlog;
    }
}
