package ObjectsAndClassesEx;

import java.util.Random;

public class Message {

    public Random random = new Random();

    public String[] phrases = {
            "Excellent product.",
            "Such a great product.",
            "I always use that product.",
            "Best product of its category.",
            "Exceptional product.",
            "I can’t live without this product."
    };
    public String[] events = {
            "Now I feel good.",
            "I have succeeded with this product.",
            "Makes miracles. I am happy of the results!",
            "I cannot believe but now I feel awesome.",
            "Try it yourself, I am very satisfied.",
            "I feel great!"
    };
    public String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
    public String[] town = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
    
    public String randomMessage() {

        String format = String.format("%s %s %s - %s",
                phrases[random.nextInt(phrases.length)],
                events[random.nextInt(events.length)],
                author[random.nextInt(author.length)],
                town[random.nextInt(town.length)]);
        return format;
    }
}
