package se.lexicon.utils;

public class GenerateId {
    private static int id = 0;

    public static int nextId() {
        return ++id;
    }
}
