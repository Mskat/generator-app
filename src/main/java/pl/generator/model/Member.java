package pl.generator.model;

import pl.generator.constant.Level;

public class Member {
    private String firstName;
    private String lastName;
    private Level level;
    private boolean alreadyInGroup;

    public Member(String firstName, String lastName, Level level) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.level = level;
        this.alreadyInGroup = false;
    }

    public Level getLevel() {
        return level;
    }

    public boolean isAlreadyInGroup() {
        return alreadyInGroup;
    }

    public void setAlreadyInGroup(boolean alreadyInGroup) {
        this.alreadyInGroup = alreadyInGroup;
    }

    @Override
    public String toString() {
        return "Member: " + firstName + " " + lastName + ", Level: " + level + ";";
    }
}
