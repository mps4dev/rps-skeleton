package pl.mps.rps.strategy;

import pl.mps.rps.model.Move;
import pl.mps.rps.uix.UserInterface;

public class PlayerStrategy implements Strategy {

    private final UserInterface userInterface;

    public PlayerStrategy(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    @Override
    public Move getMove() {
        // implement
    }
}
