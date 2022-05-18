public class CD implements Packable{

    private String artist, name;
    private int publicationYear;
    private double weight;

    public CD(String artist, String name, int publicationYear){
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    @Override public double weight() {
        return 0;
    }

    @Override public String toString() {
        return this.artist + ": " + this.name + " (" + this.publicationYear +")";
    }

    public static void main(String[] args) {
        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);

    }
}
