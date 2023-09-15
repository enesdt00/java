public class TestResepter {
    public static void main(String[] args){
        //Legemidler objekter
        Legemiddel legemiddel= new Vanlig("Otrivin", 43, 0.01); //id 1
        Legemiddel narkotisk1= new Narkotisk("Amfetamin", 1000, 0.002, 7); //id 2
        Legemiddel vanlig=new Vanlig("Ibux", 49, 0.02); //id3
        Lege lege=new Lege("Hakoon");
        Lege lege1=new Lege("Olav");
        Lege lege2=new Lege("Ida");

        

        // Resept objekter
        Resept resept=new BlaaResept(narkotisk1, 1, 4,lege); //id 2- narkotisk1
        hviteResepter hviteResepter1=new hviteResepter(narkotisk1, 0203, 4,lege1); //id 2 - narkotisk1
        hviteResepter hviteResepter=new hviteResepter(vanlig, 0270, 13,lege1); //id 3 - vanlig
        
        MilResept milResept=new MilResept(legemiddel, 0303,lege2);
        pResepter pResepter=new pResepter(legemiddel, 11, 10,lege2);
        BlaaResept blaaResept=new BlaaResept(narkotisk1, 1212, 4,lege1);

        
        if(resept.hentId()==2){
            System.out.println("Riktig ");//Skulle være riktig
        }else{
            System.out.println("Feil 1");
        }
        if(hviteResepter1.hentId()==2){
            System.out.println("Riktig ");//Skulle være riktig
        }else{
            System.out.println("Feil 1");
        }
        if(hviteResepter.hentId()==3){
           
            System.out.println("Riktig ");//Skulle være riktig
        }else{
            System.out.println("Feil 1");
        }
        if(hviteResepter.pasientId==0270){
            System.out.println("Riktig ");//Skulle være riktig
        }else{
            System.out.println("Feil 1");
        }
        if(milResept.hentReit()==3){
            System.out.println("Riktig ");//Skulle være riktig
        }else{
            System.out.println("Feil 1");
        }
        if(pResepter.prisAaBetale()==0){
            System.out.println("Riktig ");//Skulle være riktig
        }else{
            System.out.println("Feil 1");
        }
        if(blaaResept.prisAaBetale()==250){
            System.out.println("Riktig ");//Skulle være riktig
        }else{
            System.out.println("Feil 1");
        }
        System.out.println(resept.toString());
        System.out.println(hviteResepter.toString());
        System.out.println(milResept.toString());
        System.out.println(pResepter.toString());
        System.out.println(blaaResept.toString());
        
        
        
        

        

    }
    
}
