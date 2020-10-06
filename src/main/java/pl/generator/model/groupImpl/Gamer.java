package pl.generator.model.groupImpl;

import pl.generator.constant.Level;
import pl.generator.model.Group;
import pl.generator.model.Member;

import java.util.ArrayList;
import java.util.List;

public class Gamer implements Group {
    private List<Member> gamers = new ArrayList<>();

    // Getter
    public List<Member> getGamers() {
        return gamers;
    }

    // add gamer to list
    @Override
    public void addMember(Member member) {
        gamers.add(member);
    }

    // get size
    @Override
    public int getListSize() {
        return gamers.size();
    }

    @Override
    public int getLevelCount(Level level) {
        int count = 0;
        for (int i = 0; i < getListSize(); i++) {
            if (getGamers().get(i).getLevel().equals(level)) {
                count++;
            }
        }
        return count;
    }
}
