package InterfaceInABox;

public class CD implements Packable {

    private String artist;

    private String name;

    private int pubYear;

    public CD(String artist, String name, int pubYear) {
        this.artist = artist;
        this.name = name;
        this.pubYear = pubYear;
        this.weight = 0.1;
    }

    private double weight;

    @Override
    public double weight() {

        return this.weight;

    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.pubYear + ")";
    }

}