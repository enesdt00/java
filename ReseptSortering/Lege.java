public class Lege {
    protected String legensNavn;

    public Lege(String legensNavn){
        this.legensNavn=legensNavn;
    }

    public String hentNavn(){
        return this.legensNavn;
    }

    public String toString(){
        return "legens navn: "+this.legensNavn;
    }
    
}
