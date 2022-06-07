import java.util.ArrayList;
import java.util.List;

public class GrapheListe implements Graphe {

    /**
     * Liste contenant le nom des noeuds du graphe
     */
    private List<String> ensNom;
    /**
     * Liste d'objet noeud permettant de stocker les arcs
     */
    private List<Noeud> ensNoeuds;

    public GrapheListe(List<Noeud> noeuds) {
        this.ensNoeuds = noeuds;
    }

    /**
     * Methode permettant de renvoyer la liste des noeurds
     *
     * @return
     */
    @Override
    public List<String> listeNoeuds() {
        ArrayList<String> res = new ArrayList<String>();

        for (int i = 0; i < this.ensNoeuds.size(); i++) {
            res.add(this.ensNoeuds.get(i).getNom());
        }

        return res;
    }

    /**
     * Methode permettant d'afficher les arcs qui suivants le noeud n
     *
     * @param n Le noeud selectionne
     * @return
     */
    @Override
    public List<Arc> suivants(String n) {

        List<Arc> res = new ArrayList<Arc>();

        for (int i = 0; i < this.ensNoeuds.size(); i++) {
            if (this.ensNoeuds.get(i).getNom().equals(n)) {
                res = this.ensNoeuds.get(i).getAdj();
            }
        }

        return res;
    }

    /**
     * Methode permettant d ajouter un arc
     *
     * @param depart      le point de départ
     * @param destination la destination de l arc
     * @param cout        le cout
     */
    public void ajouterArc(String depart, String destination, double cout) {

        for (int i = 0; i < this.ensNoeuds.size(); i++) {

            if (this.ensNoeuds.get(i).getNom().equals(depart)) {
                this.ensNoeuds.get(i).ajouterArc(destination, cout);
            }
        }
    }

    /**
     * Methode permettant de renvoyer l objet en string
     */
    public String toString() {
        String res = "";

        for (int i = 0; i < this.ensNoeuds.size(); i++) {
            res += this.ensNoeuds.get(i).getNom() + " -> ";

            for (int j = 0; j < this.ensNoeuds.get(i).getAdj().size(); j++) {
                res += this.ensNoeuds.get(i).getAdj().get(j).getDest() + "(" + this.ensNoeuds.get(i).getAdj().get(j).getCout() + ")";
                res += " ";
            }
            res += "\n";
        }
        return res;
    }

    /**
     * graph sous la forme digraph
     * @return string
     */
    public String digraph() {
        String ch = "digraph {\n";
        for (int i = 0; i < this.ensNoeuds.size(); i++) {
            for (int j = 0; j < this.ensNoeuds.get(i).getAdj().size(); j++) {
                ch += this.ensNoeuds.get(i).getNom() + " -> " + this.ensNoeuds.get(i).getAdj().get(j).getDest() + " [label = " + this.ensNoeuds.get(i).getAdj().get(j).getCout() + "]\n";
            }
        }
        ch += "}";
        return ch;
    }

}
