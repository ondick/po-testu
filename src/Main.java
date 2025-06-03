import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<IObsah> obsah = new ArrayList<IObsah>();
        boolean cycle = true;
        while (cycle) {
            System.out.println("Co chces delat?");
            System.out.println("1. Pridat obsah");
            System.out.println("2. Vypsat vsechna youtube videa?");
            System.out.println("3. Vypsat delku nejkratsiho obsahu");
            System.out.println("4. Konec programu?");

            int cislo = sc.nextInt();
            sc.nextLine();
            switch (cislo) {
                case 1:
                    System.out.println("Youtube video nebo podcast??(1-2)");
                    int c1 = sc.nextInt();
                    sc.nextLine();
                    switch (c1) {
                        case 1:

                            System.out.println("Nazev videa?");
                            String nazev = sc.nextLine();
                            System.out.println("Jmeno autora?");
                            String jmenoAutora = sc.nextLine();
                            System.out.println("Delka videa?");
                            int delka = sc.nextInt();
                            sc.nextLine();
                            YoutubeVideo youtubeVideo = new YoutubeVideo(nazev,delka,jmenoAutora);
                            obsah.add(youtubeVideo);
                            break;
                        case 2:
                            System.out.println("Nazev podcastu?");
                            String nazev1 = sc.nextLine();
                            System.out.println("Jmeno moderatora?");
                            String moderator = sc.nextLine();
                            System.out.println("Delka podcastu?");
                            int delka1 = sc.nextInt();
                            sc.nextLine();
                            SpotifyPodcast spotifyPodcast = new SpotifyPodcast(nazev1,delka1,moderator);
                            obsah.add(spotifyPodcast);
                            break;
                    }

                    break;
                case 2:
                    System.out.println("Vsechna youtube videa:");
                    for (int i = 0; i < obsah.size(); i++) {
                        System.out.println(obsah.get(i).toString());
                    }

                    break;
                case 3:
                    System.out.println("Nejkratsiho video:");
                    double nejk = Double.MAX_VALUE;
                    for (int i = 0; i < obsah.size(); i++) {
                        if (obsah.get(i) instanceof YoutubeVideo) {
                            if (((YoutubeVideo) obsah.get(i)).getDelka()<nejk) {
                                nejk = ((YoutubeVideo) obsah.get(i)).getDelka();
                            }
                        }

                    }
                    System.out.println(nejk+" minut");
                    break;
                case 4:
                    System.out.println("KONEC");
                    cycle = false;
                    break;

            }
        }





    }
}