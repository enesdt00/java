public abstract class Resept {
    
     Lege legensNavn;
    Legemiddel legemiddel1;
    protected int pasientId;
    protected int reit;
    public Resept(Legemiddel legemiddel1, int pasientId,int reit, Lege legensNavn){
        this.legemiddel1=legemiddel1;
        this.pasientId=pasientId;
        this.reit=reit;
        this.legensNavn=legensNavn;
    }
    public int hentId(){
        return legemiddel1.ID;
    }
    public Legemiddel hentLegemiddel(){
        return this.legemiddel1;
    }
   
    public Lege hentLege(){
        return legensNavn;
    }
    public int pasientID(){
        return pasientId;
    }

    public int hentReit(){
        return reit;
    }

    public boolean bruk(){
        return reit>0;
    }

    abstract public int prisAaBetale();
    abstract public String farge();


    public String toString(){
        return legemiddel1.toString()+" PasientID:  "+ pasientId+" Reit:  "+reit+" "+legensNavn.toString();
    }


    
}
