package Commands;

import java.util.ArrayList;

public class Upvote implements Command{

    public Upvote() {
    }

    @Override
    public boolean execute(String user, String[] args) {
        return false;
    }

    @Override
    public String help() {
        return "this is info for the upvote command";
    }

    public String name() {
        return "upvote";
    }
}
