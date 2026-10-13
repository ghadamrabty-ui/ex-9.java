package tpp;

public class Dictionnaire {

	     int nb_mots;
	     mot_dic[] Dict;
	     String Nom;

	    public Dictionnaire(int taille, String nom) {
	    	    nb_mots=0;
	        Dict = new mot_dic[taille];
	        this.Nom = nom;
	    }
	    public void trier() {
	    	for(int i= 0; i<nb_mots-1;i++) {
		    	for(int j= 0; j<nb_mots-1;j++) {
	    		if(Dict[j].getmot().compareTo(Dict[j+1].getmot())>0) {
	    			mot_dic temp=Dict[j];
	    			Dict[j]=Dict[j+1];
	    			Dict[j+1]=temp;
	    							
	    		}
	    	}}
	    }
	    
	    public void Ajouter_Mot(mot_dic m) {

	        if (nb_mots < Dict.length) {
	            Dict[nb_mots] = m;
	            nb_mots++;
	            trier() ;

	        }}
	     public void Supprimer_Mot(mot_dic m) {
	    	   for (int i = 0; i < nb_mots; i++) {
	     
	                if (Dict[i] == m) {

	                    for (int j = i; j < nb_mots - 1; j++) {
	                        Dict[j] = Dict[j + 1];
	                     }

	                    Dict[nb_mots - 1] = null;
	                    nb_mots--;

	                    return;
	    	   
	            }}
	     }
	    public String Recherche_dicho(String x) {

	        for (int i = 0; i < nb_mots; i++) {
	        	if (Dict[i].getmot().equals(x)) {
	                return Dict[i].getdef();
	            }
	        }

	        return "Mot non trouvé";
	    }
	    public void Lister_dictionnaire() {
	        for (int i = 0; i < nb_mots; i++) {
	            System.out.println(Dict[i].getmot());
	            System.out.println(Dict[i].getdef());
	        }
	    }

        public int Nombre_synonyme(mot_dic m) {
        	int n = 0;
        	
        	for (int i = 0; i < nb_mots; i++) {
          if (Dict[i].synonyme(m.getdef())) {
             n++;
        }
    }

       return n;
}

	     }