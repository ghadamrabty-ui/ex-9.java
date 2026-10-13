package tpp;

public class mot_dic {
	String mot;
	String def;
	public mot_dic(String mot ,String def) {
	this.mot=mot;
	this.def=def;
	}
	public String getmot() {
		return mot;
	}
	public String getdef() {
		return def;
	}
	public void setdef(String x) {
	    this.def = x;
	}

	public void setmot(String x) {
	    this.mot = x;
	}
	public boolean synonyme(String x) {
        return this.def.equals(x);
    
	}
		

}

