public class SpotifyPodcast implements IObsah {
    String nazev;
    int delka;
    String  moderator;
    @Override
    public int getDelka() {
        return 0;
    }
    public String toString() {
        return "Spotify podcast '"+nazev+"' od moderatora "+moderator;

    }
}
