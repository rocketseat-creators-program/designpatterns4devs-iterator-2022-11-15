package socialMedia.after;

import java.util.Iterator;

public class ProfileIterator implements Iterator<Integer> {

    private Integer[] profiles;
    private int index;

    public ProfileIterator(Integer[] profiles) {
        this.profiles = profiles;
        this.index = 0;
    
    }

    @Override
    public boolean hasNext() {
        if(profiles == null) return false;
        return profiles[index] != null;
    }

    @Override
    public Integer next() {
        return profiles[index++];
    }
}
