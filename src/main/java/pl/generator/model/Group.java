package pl.generator.model;

import pl.generator.constant.Level;

public interface Group {
    // add new Member
    void addMember(Member member);

    // get size of the list
    int getListSize();

    // count number of members in list with specific level
    int getLevelCount(Level level);
}
