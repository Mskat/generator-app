package pl.generator.model.groupImpl;

import pl.generator.constant.Level;
import pl.generator.model.Group;
import pl.generator.model.Member;

import java.util.ArrayList;
import java.util.List;

public class Hero implements Group {
    private List<Member> heroes = new ArrayList<>();

    public List<Member> getHeroes() {
        return heroes;
    }

    @Override
    public void addMember(Member member) {
        getHeroes().add(member);
    }

    @Override
    public int getListSize() {
        return getHeroes().size();
    }

    @Override
    public int getLevelCount(Level level) {
        int count = 0;
        for (int i = 0; i < getListSize(); i++) {
            if (getHeroes().get(i).getLevel().equals(level)) {
                count++;
            }
        }
        return count;
    }
}
