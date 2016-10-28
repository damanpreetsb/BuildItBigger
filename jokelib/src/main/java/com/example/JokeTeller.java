package com.example;

import java.util.Random;

public class JokeTeller {
    private Random random = new Random();

    public String getJoke(){
        String joke;
        switch (random.nextInt(4)) {
            case 0:
                joke = "A family of mice were surprised by a big cat. Father Mouse jumped and and said, \"Bow-wow!\" The cat ran away. \"What was that, Father?\" asked Baby Mouse. \"Well, son, that's why it's important to learn a second language.\" ";
                break;
            case 1:
                joke = "Patient: Doctor, I have a pain in my eye whenever I drink tea. \n" +
                        "Doctor: Take the spoon out of the mug before you drink. ";
                break;
            case 2:
                joke = "Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.";
                break;
            default:
                joke = "Patient: Doctor! You've got to help me! Nobody ever listens to me. No one ever pays any attention to what I have to say.\n" +
                        "Doctor: Next please! ";
                break;
        }
        return joke;
    }
}
