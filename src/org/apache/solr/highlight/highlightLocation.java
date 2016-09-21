package org.apache.solr.highlight;

public class highlightLocation implements Comparable<highlightLocation> {
    public int start;
    public int length;
    public int end;
    public int compareTo(highlightLocation hl)
    {
        if(hl.start < start)
            return 1;
        if(hl.start > start)
            return -1;
        return 0;
    }
}
