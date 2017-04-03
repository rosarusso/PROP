package domain.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CentroidTest {
    @Test
    void itShouldUpdateTheAnswerToTheSpecifiedQuestion() {
        Integer question = 1;
        Centroid centroid = new Centroid();
        String answer = "Some answer";
        centroid.setAnswerTo(question, answer);
        assertEquals(centroid.getAnswerTo(question), answer);
    }
}