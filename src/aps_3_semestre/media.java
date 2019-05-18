/** @author matheus */
package aps_3_semestre;

import java.util.ArrayList;

public class media {
    
    ArrayList<Double> lista = new ArrayList();
    double media = 0;
    
    public double calculaMedia(double[] values) {
        
        //pega cada numero separado por virgula e coloca numa array list que e mais facil de trabalhar
        for (int i = 0; i < values.length; i++) {
            lista.add(values[i]);
        }

        //verifica quantos itens tem no array
        int tamanho = lista.size();
        System.out.println(tamanho);

        double soma_numeros = 0;

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Posição %d- %s\n", i, lista.get(i));
        }

        //como java nao tem funcao de soma como sum(), tenho que somar cada elemento
        for (int i = 0; i < tamanho; i++) {
            soma_numeros += lista.get(i);
        }

        //realiza o calculo da media
        media = (soma_numeros / tamanho);
        
        System.out.println(media);
        
        return media;
    }
    
}
