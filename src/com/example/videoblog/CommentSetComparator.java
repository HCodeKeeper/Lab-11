package com.example.videoblog;

import com.example.videoblog.Interfaces.IComment;

import java.util.Comparator;
import java.util.TreeSet;

public class CommentSetComparator implements Comparator<TreeSet<Comment>> {
    public int compare(TreeSet<Comment> comments1, TreeSet<Comment> comments2){
        return ((Integer)comments1.size()).compareTo(comments2.size());
    }
}
