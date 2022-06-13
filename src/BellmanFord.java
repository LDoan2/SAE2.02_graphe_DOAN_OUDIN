import java.util.ArrayList;
import java.util.List;

public class BellmanFord {


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

        }

        return val;
    }


}
