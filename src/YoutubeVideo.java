public class YoutubeVideo implements IObsah{
    private String nazev;
    private int delka;
    private String jmenoAutora;

    public YoutubeVideo(String nazev, int delka, String jmenoAutora) {
        this.nazev = nazev;
        this.delka = delka;
        this.jmenoAutora = jmenoAutora;
    }

    @Override
    public int getDelka() {
        return delka;
    }
    public String toString() {
        return "Youtube video '"+nazev+"' od autora "+jmenoAutora;

    }
}
