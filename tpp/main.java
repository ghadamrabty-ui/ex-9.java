
package tpp;

public class main {
    public static void main(String[] args) {

        mot_dic m1 = new mot_dic("beau", "joli");

        Dictionnaire d = new Dictionnaire(10, "Mon dictionnaire");

        d.Ajouter_Mot(m1);

        System.out.println(d.Recherche_dicho("beau"));

        System.out.println(d.Nombre_synonyme(m1));

        d.Supprimer_Mot(m1);

        d.Lister_dictionnaire();
    }
}
