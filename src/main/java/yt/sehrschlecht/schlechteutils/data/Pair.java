package yt.sehrschlecht.schlechteutils.data;

/**
 * A pair of two objects
 * @author sehrschlechtYT | https://github.com/sehrschlechtYT
 * @since 1.0.3
 */
public class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }
}
