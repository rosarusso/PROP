package domain.algorithm;

import java.util.HashMap;

public class Cluster {
    private Centroid centroid;
    private HashMap<Integer, HashMap<Integer, String>> people;

    /**
     * @return the set of elements which makes the cluster
     */
    public HashMap<Integer, HashMap<Integer, String>> getPeople() {
        return this.people;
    }

    /**
     * @return the generic element for the cluster
     */
    public Centroid getCentroid() {
        return this.centroid;
    }
}
