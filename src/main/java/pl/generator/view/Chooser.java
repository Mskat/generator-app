package pl.generator.view;

import pl.generator.constant.Level;
import pl.generator.constant.MemberList;
import pl.generator.model.Member;
import pl.generator.model.groupImpl.Cosmonaut;
import pl.generator.model.groupImpl.Gamer;
import pl.generator.model.groupImpl.Hero;
import pl.generator.model.groupImpl.HollywoodWife;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Chooser {
    private Random rand = new Random();
    private Hero hero = new Hero();
    private Cosmonaut cosmonaut = new Cosmonaut();
    private HollywoodWife hollywoodWife = new HollywoodWife();
    private Gamer gamer = new Gamer();
    private MemberList memberList = new MemberList();
    private List<Member> allMemberList;

    {
        try {
            allMemberList = memberList.getAllMembersList();
        } catch (IOException e) {
            System.out.println("Can't get members' list.");
        }
    }

    public int countNotInUse() {
        int count = 0;
        for (Member member : allMemberList) {
            if (!member.isAlreadyInGroup()) {
                count++;
            }
        }
        return count;
    }

    public void checkLevelAndAddToList(Level level, Member randMemberChosen) {
        switch (level) {
            case STARTER:
                if (hero.getLevelCount(Level.STARTER) == 0) {
                    hero.addMember(randMemberChosen);
                } else if (cosmonaut.getLevelCount(Level.STARTER) == 0) {
                    cosmonaut.addMember(randMemberChosen);
                } else if (hollywoodWife.getLevelCount(Level.STARTER) == 0) {
                    hollywoodWife.addMember(randMemberChosen);
                } else if (gamer.getLevelCount(Level.STARTER) == 0 || gamer.getLevelCount(Level.STARTER) == 1) {
                    gamer.addMember(randMemberChosen);
                }
                break;
            case JUNIOR:
                if (hero.getLevelCount(Level.JUNIOR) == 0) {
                    hero.addMember(randMemberChosen);
                } else if (cosmonaut.getLevelCount(Level.JUNIOR) == 0) {
                    cosmonaut.addMember(randMemberChosen);
                } else if (hollywoodWife.getLevelCount(Level.JUNIOR) <= 1) {
                    hollywoodWife.addMember(randMemberChosen);
                } else if (gamer.getLevelCount(Level.JUNIOR) == 0) {
                    gamer.addMember(randMemberChosen);
                }
                break;
            case ORDINARY:
                if (hero.getLevelCount(Level.ORDINARY) <= 2) {
                    hero.addMember(randMemberChosen);
                } else if (cosmonaut.getLevelCount(Level.ORDINARY) <= 1) {
                    cosmonaut.addMember(randMemberChosen);
                } else if (hollywoodWife.getLevelCount(Level.ORDINARY) == 0) {
                    hollywoodWife.addMember(randMemberChosen);
                } else if (gamer.getLevelCount(Level.ORDINARY) == 0) {
                    gamer.addMember(randMemberChosen);
                }
                break;
            case COMMANDO:
                if (cosmonaut.getLevelCount(Level.COMMANDO) == 0) {
                    cosmonaut.addMember(randMemberChosen);
                } else if (hollywoodWife.getLevelCount(Level.COMMANDO) == 0) {
                    hollywoodWife.addMember(randMemberChosen);
                } else if (gamer.getLevelCount(Level.COMMANDO) == 0) {
                    gamer.addMember(randMemberChosen);
                }
                break;
        }
    }

    public void reGroup() {
        int count = 0;
        int allCount = 0;
        Level level;
        do {
            int randNum = rand.nextInt(allMemberList.size());
            System.out.println(randNum);
            Member randMemberChosen = allMemberList.get(randNum);
            if (!randMemberChosen.isAlreadyInGroup()) {
                level = randMemberChosen.getLevel();
                checkLevelAndAddToList(level, randMemberChosen);
                randMemberChosen.setAlreadyInGroup(true);
                count++;
            }
            allCount++;
            System.out.println("iteration count: " + count);
            System.out.println("All iteration count: " + allCount);
        } while (countNotInUse() != 0);
    }

    public void printGroups() {
        System.out.println("Heroes group: ");
        for (int i = 0; i < hero.getListSize(); i++) {
            System.out.println(hero.getHeroes().get(i));
        }
        System.out.println();
        System.out.println("Cosmonauts group: ");
        for (int i = 0; i < cosmonaut.getListSize(); i++) {
            System.out.println(cosmonaut.getCosmonauts().get(i));
        }
        System.out.println();
        System.out.println("HollywoodWives group: ");
        for (int i = 0; i < hollywoodWife.getListSize(); i++) {
            System.out.println(hollywoodWife.getHollywoodWives().get(i));
        }
        System.out.println();
        System.out.println("Gamers group: ");
        for (int i = 0; i < gamer.getListSize(); i++) {
            System.out.println(gamer.getGamers().get(i));
        }
        int checkerAmountOfAllMembersUsed = hero.getListSize() + cosmonaut.getListSize() + hollywoodWife.getListSize() + gamer.getListSize();
        // There should be 20 people
        System.out.println("amount in all groups: " + checkerAmountOfAllMembersUsed);
    }
}
