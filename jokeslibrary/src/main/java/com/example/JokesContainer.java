package com.example;


import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JokesContainer {

    private static ArrayList<String> jokes;

    public JokesContainer() {
//        try {
//            Scanner s = new Scanner(new File("/Users/Pradeep/AndroidStudioProjects/BuildItBigger/jokeslibrary/src/main/java/com/example/Jokes.txt"));
        jokes = new ArrayList<String>();
//            while (s.hasNextLine()) {
//                jokes.add(s.next());
//            }
//            s.close();

//        } catch (java.io.FileNotFoundException e) {
//            e.printStackTrace();
//        }
        jokes.add("Q: How does a crazy person travel through the woods? A: They take the psychopath.");
        jokes.add("A lawyer was just waking up from anesthesia after surgery, and his wife was sitting by his side. His eyes fluttered open and he said, \"You're beautiful!\" and then he fell asleep again. His wife had never heard him say that so she stayed by his side. A couple of minutes later, his eyes fluttered open and he said, \"You're cute!\" Well, the wife was dissapointed because instead of \"beautiful,\" it was \"cute.\" She asked, \"What happened to 'beautiful'?\" His reply was \"The drugs are wearing off!\"\n");
        jokes.add("Ordinarily, staring is creepy. But if you spread your attention across many individuals, then it's just people watching.\n");
        jokes.add("A neutron walks into a bar and orders a drink. When the neutron gets his drink, he asks, \"Bartender, how much do I owe you?\" \\n The bartender replies, \"For you, neutron, no charge.\"\n");
        jokes.add("A man walks into a bar and sees his friend sitting beside a 12-inch pianist. He says to his friend, \"That's amazing. How did you get that?\". The man pulls out a bottle and tells him to rub it and make a wish. He rubs the bottle, and a puff of smoke pops out and tells him that he can have one wish. So the man thinks and says, \"I wish I had a million bucks.\"The genie says, \"OK, go outside, and your wish will be granted.\" The man goes outside, but all he finds are ducks filling the sky and roads. He goes back in and tells his friend what happend, and his friend replies, \\n \"I know. Did you really think I wanted a 12-inch pianist?\"\n");
        jokes.add("Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.\n");
        jokes.add("A man asks a farmer near a field, “Sorry sir, would you mind if I crossed your field instead of going around it? You see, I have to catch the 4:23 train.” \\n The farmer says, “Sure, go right ahead. And if my bull sees you, you’ll even catch the 4:11 one.”\n");
        jokes.add("It is so cold outside I saw a politician with his hands in his own pockets.\n");
        jokes.add("Police officer: \"Can you identify yourself, sir?\" \\n Driver pulls out his mirror and says: \"Yes, it's me.\"\n");
    }

    public static String getJoke() {
        Random RNG = new Random();
        int randomChooser = RNG.nextInt(jokes.size());
        return jokes.get(randomChooser);
    }

}
