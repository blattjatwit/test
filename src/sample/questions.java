package sample;

import java.util.ArrayList;

public class questions {
    public String question(int counter){
        ArrayList<String> answers = new ArrayList<>();
        answers.add("what is the capital of Massachusetts");
        answers.add("Who produces the most coffee in the world");
        answers.add("how many liters of blood is in the average man");
        answers.add("who was the 33rd president of united states");
        answers.add("how many lord of the rings movies are there");
        answers.add("what year did the bruins last win the stanley cup");
        answers.add("what year did Boston record over 11 feet of snow");
        answers.add("what language do we get the word kindergarden from");
        answers.add("whats the name of the man on the MBTA pass");
        answers.add("how long was the 100 year war");
        return answers.get(counter);
    }
}
