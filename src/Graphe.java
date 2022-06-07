import java.util.List;

public interface Graphe {

    /**
     * Methode qui retourne les noeuds du graphes
     * @return
     */
    public List<String> listeNoeuds();

    /**
     * Methode qui retourne la liste des arcs partant du noeud n
     * @param n Le noeud selectionne
     * @return
     */
    public List<Arc> suivants(String n);

}
