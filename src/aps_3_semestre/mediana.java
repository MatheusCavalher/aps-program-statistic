/** @author matheus */
package aps_3_semestre;

import java.util.ArrayList;
import java.util.Collections;

public class mediana {
    
    ArrayList<Double> lista = new ArrayList();
    double mediana = 0;
    
    public double calculaMediana(double[] values) {
        //pega cada numero separado por virgula e coloca numa array list que e mais facil de trabalhar
        for (int i = 0; i < values.length; i++) {
            lista.add(values[i]);
        }
        
        //cria uma outra lista para poder ordenar ela já que uma vez ordenada uma lista você não consegue voltar ao normal
        ArrayList<Double> lista_ordenada = new ArrayList();

        //realiza um loop para passar os elementos do array principal para o secundario
        for (int i = 0; i < lista.size(); i++) {
            lista_ordenada.add(lista.get(i));
        }

        //usa uma collection para ordenar com a funcao sort
        Collections.sort(lista_ordenada);

        //verifica quantos itens tem no array
        int tamanho_lista_ordenada = lista_ordenada.size();

        int indice = (tamanho_lista_ordenada / 2);

        if (tamanho_lista_ordenada % 2 == 0) {
            mediana = lista_ordenada.get(indice) + lista_ordenada.get(indice - 1);
            mediana = mediana / 2;
        }
        else if(tamanho_lista_ordenada % 2 == 1) {
            mediana = lista_ordenada.get(indice);
        }
        
        return mediana;
    }
}
