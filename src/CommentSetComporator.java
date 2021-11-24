import Interfaces.IComment;
import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class CommentSetComporator implements Comparator<TreeSet<IComment>> {
    public int compare(TreeSet<IComment> comments1, TreeSet<IComment> comments2){
        return ((Integer)comments1.size()).compareTo((Integer)comments2.size());
    }
}
