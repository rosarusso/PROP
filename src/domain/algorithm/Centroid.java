package domain.algorithm;

import java.util.HashMap;

public class Centroid {
    private HashMap<String, String> archetype;

    public Centroid() {
        this.archetype = new HashMap<>();
    }

    public Centroid(int size) {
        this.archetype = new HashMap<>(size);
    }

    public String getAnswerTo(String question) {
        return this.archetype.get(question);
    }
}
