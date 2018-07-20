package com.example.android.jokeslibrary;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JokeFactory {


    private static List<String> jokes = Arrays.asList(
            "How can you tell you have a really bad case of acne?\nIt’s when the blind try to read your face.",
            "I invented a new word! plagiarism!",
            "I just got a photo from a speeding camera through the mail.\nI sent it right back – way too expensive and really bad quality.",
            "What's the best thing about switzerland? I don't know, but the flag is a big plus.",
            "Smile and the world smiles with you.\nFart and the world suddenly stops smiling.\n",
            "Hear about the new restaurant called karma? There's no menu: You get what you deserve.",
            "Accordion to research, 9 out of 10 people don't notice when you replace words with random musical instruments.",
            "-Anton, do you think I’m a bad mother?\n-My name is Paul.",
            "Patient: Oh doctor, I’m just so nervous. This is my first operation.\nDoctor: Don't worry. Mine too.",
            "I can’t believe I forgot to go to the gym today. That’s 7 years in a row now.",
            "Mum, I'm already 14, can't I finally get a bra?!\n-NO Harold!",
            "I thought I’d tell you a good time travel joke – but you didn't like it.",
            "What goes up and down but never moves? \nThe stairs!");

    public static String getJoke() {
        int random = new Random().nextInt(jokes.size());
        return jokes.get(random);
    }
}
