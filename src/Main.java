import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * classe main du projet
 */
public class Main {

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        List<Noeud> noeuds = new ArrayList<Noeud>();
        Noeud a = new Noeud("A");
        Noeud b = new Noeud("B");
        Noeud c = new Noeud("C");
        Noeud d = new Noeud("D");
        Noeud e = new Noeud("E");
        a.ajouterArc("B", 12);
        a.ajouterArc("D", 87);
        b.ajouterArc("E", 11);
        c.ajouterArc("A", 19);
        d.ajouterArc("B", 23);
        d.ajouterArc("C", 10);
        e.ajouterArc("D", 43);
        noeuds.add(a);
        noeuds.add(b);
        noeuds.add(c);
        noeuds.add(d);
        noeuds.add(e);
        GrapheListe graphe = new GrapheListe(noeuds);
        System.out.println(graphe.digraph());

        GrapheListe grapheListe = new GrapheListe("documents/Graphes/Graphe1.txt");
        System.out.println(grapheListe.toString());


        BellmanFord bellmanFord = new BellmanFord();

        Valeur val = bellmanFord.resoudre(graphe, "A");


/*
        System.out.println(val.toString());

        System.out.println(val.calculerChemin("C").get(0));
        System.out.println(val.calculerChemin("C").get(1));
        System.out.println(val.calculerChemin("C").get(2));
        System.out.println(val.calculerChemin("C").get(3));
        System.out.println(val.calculerChemin("C").get(4));
*/


    }
}
