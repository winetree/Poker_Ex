package poker.test;

import poker.com.*;

import java.util.*;

public class Person extends User {

    public int cash;

    public Person() {
        super();
    }

    public int input() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public void inputt() {

    }

    public void choiceCard(List<Card> d1) {

        System.out.println("this is abstract");

    }


}
