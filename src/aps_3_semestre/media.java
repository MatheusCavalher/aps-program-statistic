/** @author matheus */
package aps_3_semestre;

import java.util.ArrayList;

public class media {
    
    ArrayList<String> lista = new ArrayList();
    float media = 0.0f;
    
    public float calculaMedia(String[] values) {
        
        //pega cada numero separado por virgula e coloca numa array list que e mais facil de trabalhar
        for (int i = 0; i < values.length; i++) {
            lista.add(values[i]);
        }

        //verifica quantos itens tem no array
        int tamanho = lista.size();

        float soma_numeros = 0;

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Posição %d- %s\n", i, lista.get(i));
        }

        //como java nao tem funcao de soma como sum(), tenho que somar cada elemento
        for (int i = 0; i < tamanho; i++) {
            soma_numeros += Float.parseFloat(lista.get(i));
        }

        //realiza o calculo da media
        media = (soma_numeros / tamanho);

        //imprime o numero na label media com duas casas decimais
        //jLabelMedia.setText(String.format("%.2f", media));
        
        return media;
    }
    
}
