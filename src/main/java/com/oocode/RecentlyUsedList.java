package com.oocode;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {
    List<String> content = new ArrayList<String>();
    public String retrieveMostRecent() {
        try {
            return retrieveItem(0);
        } catch (WrongIndexException e) {
            throw new RuntimeException(e);
        }
    }

    public void addItem(String item) {
        content.remove(item);
        content.add(item);
    }

    public String retrieveItem(int i) throws WrongIndexException {
        if (i < 0) {
            throw new WrongIndexException();
        } else if (content.size() > i) {
            return content.get(content.size() - (i + 1));
        } else {
            return null;
        }
    }
}
