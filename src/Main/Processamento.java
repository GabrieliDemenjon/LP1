package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
class Processamento {

    String LetrasMaiusculo(String s) {
        String aux[]=s.split(" ");
        String resp="";
         for (int i = 0; i < aux.length ; i++) {
             resp+=aux[i].charAt(0);
             
             
         }
        return resp;
      
        
        
       
    }

}
