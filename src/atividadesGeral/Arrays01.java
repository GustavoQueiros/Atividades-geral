package atividadesGeral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner leia = new Scanner (System.in);


        String cores01 = "";

        //Digitação do usuario
        String digitacao;
        System.out.println("Digite 5 cores:");
        digitacao = leia.nextLine();

        ArrayList <String> cores = new ArrayList<String>();
        cores.add( digitacao);

        for (int c = 1; c < 5; c ++) {
            System.out.println("Digite outra cor:");
            cores01 = leia.nextLine();
            cores.add(cores01);

            }
        Collections.sort(cores);
        String resultado;
        System.out.println("Aqui estão as suas cores:" + cores);


    }

}