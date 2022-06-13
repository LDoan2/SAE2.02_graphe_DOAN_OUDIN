import java.util.ArrayList;
import java.util.List;

public class Dijkstra {
/*
Entrees :
G un graphe oriente avec une ponderation (poids) positive des arcs
A un sommet (depart) de G
Debut
Q <- {} // utilisation d’une liste de noeuds a traiter
Pour chaque sommet v de G faire
v.distance <- Infini
v.parent <- Indefini
Q <- Q U {v} // ajouter le sommet v a la liste Q
Fin Pour
A.distance <- 0
Tant que Q est un ensemble non vide faire
u <- un sommet de Q telle que u.distance est minimale
Q <- Q \ {u} // enlever le sommet u de la liste Q
Pour chaque sommet v de Q tel que l’arc (u,v) existe faire
D <- u.distance + poids(u,v)
Si D < v.distance
Alors v.distance <- D
v.parent <- u
Fin Si
Fin Pour
Fin Tant que
Fin
*/

    public Valeur resoudre(Graphe g, String depart){
        Valeur val = new Valeur();
        List<String> noeud = new ArrayList<>();
        String temp;
        for (int i = 0; i < g.listeNoeuds().size(); i++){
            val.setValeur(g.listeNoeuds().get(i), Double.MAX_VALUE);
            noeud.add(g.listeNoeuds().get(i));
            for (int j = 0; j < g.suivants(g.listeNoeuds().get(i)).size() ; j++){
                val.setParent(g.listeNoeuds().get(i), null);
            }
        }
        val.setValeur(depart, 0);
        while (!noeud.isEmpty()){
            temp = noeud.get(0);
            for (int i = 1; i < noeud.size(); i++) {
                if(val.getValeur(temp) > val.getValeur(noeud.get(i))){
                    temp = noeud.get(i);
                }
            }
            noeud.remove(temp);
            for (int i = 0; i < noeud.size(); i++) {
                for (int j = 0; j < g.suivants(temp).size(); j++) {
                    if (g.suivants(temp).get(j).getDest().equals(noeud.get(i))){
                        Double d = val.getValeur(temp) + g.suivants(temp).get(j).getCout();
                        if(val.getValeur(noeud.get(i)) > d ){
                            val.setParent(noeud.get(i),temp);
                            val.setValeur(noeud.get(i),d);
                            System.out.println(val.toString());
                        }
                    }
                }
            }
        }

        return val;
    }
}
