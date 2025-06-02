public class YoutubeVideo implements IObsah{
    String nazev;
    int delka;
    String jmenoAutora;
    @Override
    public int getDelka() {
        return 0;
    }
    public String toString() {
        return "Youtube video '"+nazev+"' od autora "+jmenoAutora;

    }
}
