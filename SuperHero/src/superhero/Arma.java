package superhero;

public class Arma {
    private String nom_arma;
    private int damage_arma;
    
    public Arma(String nom_arma, int daño_arma){
        
    this.nom_arma=nom_arma;
    this.damage_arma=damage_arma;
    
}

    public String getNom_arma() {
        return nom_arma;
    }

    public int getDamage_arma() {
        return damage_arma;
    }

    public void setNom_arma(String nom_arma) {
        this.nom_arma = nom_arma;
    }

    public void setDamage_arma(int damage_arma) {
        this.damage_arma = damage_arma;
    }
   
}