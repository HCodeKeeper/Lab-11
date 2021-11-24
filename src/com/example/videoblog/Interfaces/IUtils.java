package com.example.videoblog.Interfaces;
import com.example.videoblog.Video;

import java.util.TreeSet;

public interface IUtils {
    int getOverallViews(TreeSet<Video> videos);

    boolean hasOverLikedComment(Video video);

    Video getMostDislikedVideos(TreeSet<Video> video);
}
