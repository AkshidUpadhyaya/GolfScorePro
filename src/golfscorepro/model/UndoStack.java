package golfscorepro.model;

import java.util.Stack;

public class UndoStack {

    private static Stack<Golfer> deletedGolfers = new Stack<>();

    public static void push(Golfer golfer) {
        deletedGolfers.push(golfer);
    }

    public static Golfer pop() {
        if (!deletedGolfers.isEmpty()) {
            return deletedGolfers.pop();
        }
        return null;
    }

    public static boolean isEmpty() {
        return deletedGolfers.isEmpty();
    }
}
