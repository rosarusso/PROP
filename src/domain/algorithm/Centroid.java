package domain.algorithm;

import java.util.HashMap;

/**
 * @version 1.0
 */
public class Centroid {
    private HashMap<Integer, String> archetype;

    /**
     * The default constructor, without params the archetype will have the base capacity as defined by HashMap, 16.
     */
    public Centroid() {
        this.archetype = new HashMap<>();
    }

    /**
     * A parametrized constructor, sets the capacity for the archetype on instantiation.
     *
     * @param capacity the expected number of questions that will exist
     */
    public Centroid(int capacity) {
        this.archetype = new HashMap<>(capacity);
    }

    /**
     * @param question the question which exists inside the Centroid
     * @return the Centroid answer to the given question
     */
    public String getAnswerTo(Integer question) {
        return this.archetype.get(question);
    }

    /**
     * @param question the question which its answer will be updated
     * @param answer   the new value for the answer
     */
    public void setAnswerTo(Integer question, String answer) {
        this.archetype.compute(question, (q, a) -> answer);
    }
}
