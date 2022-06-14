import java.util.ArrayList;
import java.util.List;

public class GenererGraphe implements Graphe{

    /**
     * Liste d'objet noeud permettant de stocker les arcs
     */
    private List<Noeud> noeuds;
    /**
     * Liste contenant le nom des noeuds du graphe
     */
    private List<String> nom;

    /**
     * Constructeur de la classe GenererGraphe qui genere aleatoirement un graphe
     * @param taille qui represente le nombre de noeuds dans le graphe
     */
    public GenererGraphe(int taille){
        // On initialise l'attribut
        this.noeuds = new ArrayList<Noeud>();
        this.nom = new ArrayList<String>();

        // On genere au fur et a mesure des noeuds
        for (int i = 0; i < taille; i++){
            this.noeuds.add(new Noeud(""+ i));
            this.nom.add(""+ i);
        }

        for (int j = 0; j < this.noeuds.size(); j++){
            if (j+1 > this.noeuds.size()-1){
                this.noeuds.get(j).ajouterArc("0", Math.round(Math.random()*100));
            }else{
                this.noeuds.get(j).ajouterArc(""+(j+1), Math.round(Math.random()*100));
            }
        }
    }

    /**
     * Methode permettant de renvoyer la liste des noeurds
     *
     * @return
     */
    @Override
    public List<String> listeNoeuds() {
        return null;
    }

    /**
     * Methode permettant d'afficher les arcs qui suivants le noeud n
     *
     * @param n Le noeud selectionne
     * @return
     */
    @Override
    public List<Arc> suivants(String n) {
        return null;
    }

    /**
     * Methode permettant de renvoyer l objet en string
     */
    public String toString() {
        String res = "";

        for (int i = 0; i < this.noeuds.size(); i++) {
            res += this.noeuds.get(i).getNom() + " -> ";

            for (int j = 0; j < this.noeuds.get(i).getAdj().size(); j++) {
                res += this.noeuds.get(i).getAdj().get(j).getDest() + "(" + this.noeuds.get(i).getAdj().get(j).getCout() + ")";
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
        for (int i = 0; i < this.noeuds.size(); i++) {
            for (int j = 0; j < this.noeuds.get(i).getAdj().size(); j++) {
                ch += this.noeuds.get(i).getNom() + " -> " + this.noeuds.get(i).getAdj().get(j).getDest() + " [label = " + this.noeuds.get(i).getAdj().get(j).getCout() + "]\n";
            }
        }
        ch += "}";
        return ch;
    }
}
