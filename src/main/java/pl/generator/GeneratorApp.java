package pl.generator;

import pl.generator.view.Chooser;

public class GeneratorApp {
    public static void main(String[] args) {
        Chooser game = new Chooser();
        game.reGroup();
        game.printGroups();
    }
}
