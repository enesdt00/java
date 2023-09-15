public class hovedprogram {
    public static void main(String[] args) {
        Legemiddel legemiddel=new Vanlig("paracet", 43, 0.02); //id=1
        Legemiddel  vanedannende=new Vanedannende("Zobiklon", 1245, 0.075, 9);//id=2
        Legemiddel  narkotisk= new Narkotisk("Amfetamin", 1000, 0.002, 7);// id=3
        Lege lege1=new Lege("Eno");
        Spesialist spesialist=new Spesialist("Olav", "010230");
        MilResept milResept=new MilResept(narkotisk, 02035, spesialist);
        BlaaResept blaaResept=new BlaaResept(vanedannende, 13548, 10, lege1);
        pResepter pResepter=new pResepter(legemiddel, 35790, 20, spesialist);
       
        if(legemiddel.ID==1){
            System.out.println("Riktig 1");// skulle være riktig
        }else{
            System.out.println("Feil 1");
        }
        System.out.println(lege1.hentNavn().equals("Eno"));//skulle være true
        System.out.println(pResepter.pasientId==35790);//skulle være true


       System.out.println( milResept.toString());
       System.out.println(pResepter.toString());
       System.out.println( blaaResept.toString());
     
        
    }
    
}
