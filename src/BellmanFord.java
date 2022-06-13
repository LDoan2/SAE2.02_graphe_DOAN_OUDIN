import java.util.ArrayList;
import java.util.List;

public class BellmanFord {

    /**
     * Methode de resolution de graphe par point fixe
     * @param g un graphe sur lequel on se base
     * @param depart le point de depart du point fixe
     * @return
     */
    public Valeur resoudre(Graphe g, String depart){
        // On cree une Valeur qui va servir de res
        Valeur val = new Valeur();

        for (int i = 0; i < g.listeNoeuds().size(); i++){
            val.setValeur(g.listeNoeuds().get(i), Double.MAX_VALUE);

            for (int j = 0; j < g.suivants(g.listeNoeuds().get(i)).size() ; j++){
                val.setParent(g.listeNoeuds().get(i), null);
            }
        }

        val.setValeur(depart, 0);

        boolean continuer = true;

        while (continuer){
            continuer = false;
            for (int i = 0; i < g.listeNoeuds().size(); i++) {
                for (int j = 0; j < g.suivants(g.listeNoeuds().get(i)).size(); j++) {
                    if(val.getValeur(g.suivants(g.listeNoeuds().get(i)).get(j).getDest()) > val.getValeur(g.listeNoeuds().get(i)) + g.suivants(g.listeNoeuds().get(i)).get(j).getCout()){
                        val.setValeur(g.suivants(g.listeNoeuds().get(i)).get(j).getDest(),val.getValeur(g.listeNoeuds().get(i)) + g.suivants(g.listeNoeuds().get(i)).get(j).getCout());
                        val.setParent(g.suivants(g.listeNoeuds().get(i)).get(j).getDest(),g.listeNoeuds().get(i));
                        continuer = true;
                        System.out.println(val.toString());
                    }
                }
            }
        }
        return val;
    }


}
