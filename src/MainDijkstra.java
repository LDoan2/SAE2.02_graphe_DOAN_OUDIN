import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainDijkstra {

    public static void main(String[] args) throws IOException {

        String fichier = "documents/Graphes/Graphe1.txt";

        GrapheListe graphe = new GrapheListe(fichier);

        Dijkstra dijkstra = new Dijkstra();

        long debut = System.nanoTime();
        Valeur val = dijkstra.resoudre(graphe, "1");
        long fin = System.nanoTime();
        long duree = fin - debut;
        System.out.println(val.toString());
        System.out.println(duree);
    }
}
