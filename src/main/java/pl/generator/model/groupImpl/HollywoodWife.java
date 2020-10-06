package pl.generator.model.groupImpl;

import pl.generator.constant.Level;
import pl.generator.model.Group;
import pl.generator.model.Member;

import java.util.ArrayList;
import java.util.List;

public class HollywoodWife implements Group {
    private List<Member> hollywoodWives = new ArrayList<>();

    // Getter
    public List<Member> getHollywoodWives() {
        return hollywoodWives;
    }

    // add new wife to list
    @Override
    public void addMember(Member member) {
        hollywoodWives.add(member);
    }

    @Override
    public int getListSize() {
        return hollywoodWives.size();
    }

    @Override
    public int getLevelCount(Level level) {
        int Count = 0;
        for (int i = 0; i < getListSize(); i++) {
            if (getHollywoodWives().get(i).getLevel().equals(level)) {
                Count++;
            }
        }
        return Count;
    }
}
