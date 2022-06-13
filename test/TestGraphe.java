import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGraphe {


    @Test
    public void testGraphe(){
        List<Noeud> noeuds = new ArrayList<Noeud>();
        Noeud a = new Noeud("A");
        Noeud b = new Noeud("B");
        Noeud c = new Noeud("C");
        Noeud d = new Noeud("D");

        a.ajouterArc("B", 12);
        a.ajouterArc("D", 10);
        b.ajouterArc("C", 11);
        c.ajouterArc("A", 19);

        noeuds.add(a);
        noeuds.add(b);
        noeuds.add(c);
        noeuds.add(d);

        GrapheListe graphe = new GrapheListe(noeuds);

        assertEquals(graphe.suivants("A").size(), 2, "Le nombre d arc n est pas le bon");
        assertEquals(graphe.suivants("A").get(0).getCout(), 12, "Le cout n'est pas le bon");
        assertEquals(graphe.suivants("A").get(1).getCout(), 10, "Le cout n'est pas le bon");
        assertEquals(graphe.listeNoeuds().size(), 4, "Le nombre de noeuds n est pas le bon");
    }

    @Test
    public void testPointFixe(){
        List<Noeud> noeuds = new ArrayList<Noeud>();
        Noeud a = new Noeud("A");
        Noeud b = new Noeud("B");
        Noeud c = new Noeud("C");
        Noeud d = new Noeud("D");

        a.ajouterArc("B", 12);
        a.ajouterArc("D", 10);
        b.ajouterArc("C", 11);
        c.ajouterArc("A", 19);

        noeuds.add(a);
        noeuds.add(b);
        noeuds.add(c);
        noeuds.add(d);

        GrapheListe graphe = new GrapheListe(noeuds);

        BellmanFord bellmanFord = new BellmanFord();
        Valeur val = bellmanFord.resoudre(graphe, "A");

        /*
        // On verifie
        assertEquals();

         */

    }



}
