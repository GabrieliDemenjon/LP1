package Main;

/**
 * @author Radames J Halmeman - rjhalmeman@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        String s =entrada.lerString("Digite um nome");
     
        
        Processamento processamento = new Processamento();
        String nomeEmMaiusculo=processamento.LetrasMaiusculo(s);
        

        Saida saida = new Saida();
        saida.imprimirAvisoString(nomeEmMaiusculo);
        
        

    }

}
