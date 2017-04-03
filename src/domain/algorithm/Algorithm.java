package domain.algorithm;//package domain.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

/**
 * @version 1.0
 */
public class Algorithm {
    public static HashSet<Cluster> getClusters() {
        return new HashSet<Cluster>();
    }

    /**
     * @param answer1 answer to compare
     * @param answer2 answer against to which the comparison is made
     * @param min     lowest possible value for the rank to which the answers belong
     * @param max     highest possible value for the rank to which the answers belong
     * @return distance between answers in a scale from 0 (same answer) to 1.0 (oposite answer)
     */
    public static float getDistance(int answer1, int answer2, int min, int max) {
        return (float) Math.abs(answer1 - answer2) / (max - min);
    }

    /**
     * @param answer1         answer to compare
     * @param answer2         answer against to which the comparison is made
     * @param possibleAnswers list with all the values the answers can get
     * @return distance between answers in a scale from 0 (same answer) to 1.0 (oposite answer)
     */
    public static float getDistance(String answer1, String answer2, ArrayList<String> possibleAnswers) {
        return (float) Math.abs(possibleAnswers.indexOf(answer1) - possibleAnswers.indexOf(answer2)) / (possibleAnswers.size() - 1);
    }

    /**
     * @param answer1 answer to compare
     * @param answer2 answer against to which the comparison is made
     * @return distance between answers in a scale from 0 (same answer) to 1.0 (any other)
     */
    public static float getDistance(String answer1, String answer2) {
        return answer1.equalsIgnoreCase(answer2) ? 0 : 1;
    }

    /**
     * @param answer1 answer to compare
     * @param answer2 answer against to which the comparison is made
     * @return distance between answers in a scale from 0 (same answer) to 1.0 (oposite answer) based on the Jaccard coefficient
     */
    public static float getDistance(HashSet<String> answer1, HashSet<String> answer2) {
        return 1 - jaccardCoefficient(answer1, answer2);
    }

    /**
     * @param answer1 answer to compare
     * @param answer2 answer against to which the comparison is made
     * @return distance between answers in a scale from 0 (same answer) to 1.0 (any other) based on the Levenshtein distance
     */
    public static float getDistanceFree(String answer1, String answer2) {
        return (float) (levenshteinDistance(answer1, answer2) - Math.abs(answer1.length() - answer2.length())) / (Math.max(answer1.length(), answer2.length()) - Math.abs(answer1.length() - answer2.length()));
    }

    /**
     * @param string1 the first string to analyze
     * @param string2 the second string to analyze
     * @return the Levenshtein distance between string1 and string2
     */
    private static int levenshteinDistance(String string1, String string2) {
        if (Math.min(string1.length(), string2.length()) == 0) return Math.max(string1.length(), string2.length());
        int factor = string1.toLowerCase().charAt(0) == string2.toLowerCase().charAt(0) ? 0 : 1;
        return Math.min(Math.min(levenshteinDistance(string1.substring(1), string2) + 1, levenshteinDistance(string1, string2.substring(1)) + 1), levenshteinDistance(string1.substring(1), string2.substring(1)) + factor);
    }

    /**
     * @param set1 a set to analyze
     * @param set2 another set to analyze
     * @return the Jaccard coefficient between the sets
     */
    private static float jaccardCoefficient(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> union = new HashSet<>(set1);
        HashSet<String> intersection = new HashSet<>();
        union.addAll(set2);
        set1.forEach(item -> {
            if (set2.contains(item)||set2.contains(item.toLowerCase())) intersection.add(item);
        });
        return (float) intersection.size() / union.size();
    }

    public static void updateCentroid(Cluster cluster) {
        cluster.getPeople().forEach((question, answers) -> {
            //Send answers to each function
        });
    }

    /**
     * @param answers a set of answers with a numerical value
     * @return the computed mean for all answer values
     */
    private static float getMean(HashMap<Integer, Integer> answers) {
        final Integer[] summation = {0};
        answers.forEach((person, answer) -> summation[0] += answer);
        return summation[0] / answers.size();
    }

    /**
     * @param answers a set of answers with a unique word as value
     * @return the most common word in the given answer set
     */
    private static String getMode(HashMap<Integer, String> answers) {
        final HashMap<String, Integer> repetitions = new HashMap<>(answers.size());
        answers.forEach((person, answer) -> repetitions.compute(answer.toLowerCase(), (key, value) -> value == null ? 1 : ++value));
        TreeMap<Integer, String> ordered = new TreeMap<>();
        repetitions.forEach((answer, reps) -> ordered.put(reps, answer));
        return ordered.get(ordered.lastKey());
    }
}