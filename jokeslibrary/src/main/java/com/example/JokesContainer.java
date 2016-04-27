package com.example;


import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JokesContainer {

    private static ArrayList<String> jokes;

    public JokesContainer() {
        try {
            Scanner s = new Scanner(new File("filepath"));
            jokes = new ArrayList<String>();
            while (s.hasNextLine()) {
                jokes.add(s.next());
            }
            s.close();

        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getJoke() {
        Random RNG = new Random();
        int randomChooser = RNG.nextInt(jokes.size());
        return jokes.get(randomChooser);
    }


}
