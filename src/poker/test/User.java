package poker.test;

import poker.com.*;
import java.util.*;

public abstract class User {

    int cash;
    List<Card> myDeck;

    User() {

    }

    public abstract int input();
    public abstract void choiceCard(List<Card> d1);


}
