public class TestLegemiddel {
    public static void main(String[] args){
       
        Legemiddel narkotisk= new Narkotisk("Amfetamin", 1000, 0.002, 7);//id=1
        Legemiddel vanedannende=new Vanedannende("Zopiklon", 1245, 0.05, 6);//id=2
        Legemiddel vanlig=new Vanlig("Ibux", 49, 0.02);//id=3
       
      


        
      
        
     
        // Tester om narkotisk returnerer riktig når prisen er 1000
        if(narkotisk.ID==1){
            System.out.println("Riktig 1");//Skulle være riktig
        }else{
            System.out.println("Feil 1");
        }
        if(narkotisk.pris==1000){
            System.out.println("Riktig 1");//Skulle være riktig
        }else{
            System.out.println("Feil 1");
        }
        // Tester om vanedannende returnerer riktig når virkestoffet er 0.05
       if(vanedannende.ID==2){
        System.out.println("Riktig 1");//Skulle være riktig
       }else{
        System.out.println("Feil 1");
       }
        
        if(vanedannende.virkestoffet==0.05){
            System.out.println("Riktig 1");//Skulle være riktig
        }else{
            System.out.println("Feil 1");
        }
        // Tester om vanlig returnerer riktig når navnet er ibux
        if(vanlig.ID==3){
            System.out.println("Riktig 1");//Skulle være riktig
           }else{
            System.out.println("Feil 1");
           }
        if(vanlig.navn=="Ibux"){
            System.out.println("Riktig 1");//Skulle være riktig
        }else{
            System.out.println("Feil 1");
        }

        // Nå kalles samme methodet i forskjellige klasser. Så vi kan se hva det er forksjellen mellom klassene.
       
        System.out.println(narkotisk.toString());
        System.out.println(vanedannende.toString());
        System.out.println(vanlig.toString());

    }
    
}
