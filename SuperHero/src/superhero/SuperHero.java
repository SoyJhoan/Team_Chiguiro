package superhero;

public class SuperHero {

private String Nom_heroe;
private int Salud;

    
public SuperHero(String Nom_heroe, int Salud){
    
    this.Nom_heroe=Nom_heroe;
    this.Salud=Salud;
    
}
    public String getNom_heroe() {
        return Nom_heroe;
   }

    public int getSalud() {
        return Salud;
    }

    public void setNom_heroe(String Nom_heroe) {
        this.Nom_heroe = Nom_heroe;
    }

    public void setSalud(int Salud) {
        this.Salud = Salud;
    }
   
}

