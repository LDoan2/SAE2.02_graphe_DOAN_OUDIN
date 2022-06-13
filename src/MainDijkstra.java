import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainDijkstra {

    public static void main(String[] args) throws IOException {

        String fichier = "../documents/Graphe1.txt";

        GrapheListe graphe = new GrapheListe(fichier);

        Dijkstra dijkstra = new Dijkstra();
        Valeur val = dijkstra.resoudre(graphe, "1");

        System.out.println(val.calculerChemin("10"));


    }
}
