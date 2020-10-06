package pl.generator.model.groupImpl;

import pl.generator.constant.Level;
import pl.generator.model.Group;
import pl.generator.model.Member;

import java.util.ArrayList;
import java.util.List;

public class Cosmonaut implements Group {
    private List<Member> cosmonauts = new ArrayList<>();

    public List<Member> getCosmonauts() {
        return cosmonauts;
    }

    @Override
    public void addMember(Member member) {
        getCosmonauts().add(member);
    }

    @Override
    public int getListSize() {
        return getCosmonauts().size();
    }

    @Override
    public int getLevelCount(Level level) {
        int count = 0;
        for (int i = 0; i < getListSize(); i++) {
            if (getCosmonauts().get(i).getLevel().equals(level)) {
                count++;
            }
        }
        return count;
    }
}
