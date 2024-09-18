package Util;

public class IdGenerator {
    private static long counter = 3;

    public static long getNextId() {
        return ++counter;
    }


}
