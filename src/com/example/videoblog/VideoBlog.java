package com.example.videoblog;

import Interfaces.*;
import com.example.videoblog.Interfaces.IVideo;
import com.example.videoblog.Interfaces.IVideoBlog;

import java.util.Objects;
import java.util.TreeSet;

public class VideoBlog implements IVideoBlog, Comparable<IVideoBlog> {
    private String name;
    private TreeSet<IVideo> videos;

    public VideoBlog(String name){
        this.name = name;
        videos = new TreeSet<IVideo>();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        if (name == null){
            throw new NullPointerException("Name is not specified");
        }

        return name;
    }

    public void setVideos(TreeSet<IVideo> videos){
        this.videos = videos;
    }

    public TreeSet<IVideo> getVideos(){
        TreeSet<IVideo> newVideos = new TreeSet<IVideo>();
        for(IVideo video : videos){
            newVideos.add(video);
        }

        return newVideos;
    }

    @Override
    public int compareTo(IVideoBlog AnotherVideoBlog){

        return videos.size() - AnotherVideoBlog.getVideos().size();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IVideoBlog videoBlog = (IVideoBlog) o;
        return Objects.equals(name, videoBlog.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
