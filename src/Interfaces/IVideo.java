package Interfaces;

import java.util.TreeSet;

public interface IVideo {
    String getUrl();

    String getTitle();

    int getViews();

    int getLikes();

    int getDislikes();

    void setComments(TreeSet<IComment> comments);

    TreeSet<IComment> getComments();
}
