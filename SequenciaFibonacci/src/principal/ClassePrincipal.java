package principal;

import javax.swing.JOptionPane;
public class ClassePrincipal {
     public static void main(String[] args) {
        
        //Declara variáveis
        int enesimoTermo;
        String serieFibonacci;
        
        //Pede ao usuásio quantos termos da sequência são desejados
        enesimoTermo = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de valores a mostrar para a série de Fibonacci:"));
        serieFibonacci = calculaSequenciaFibonacci(enesimoTermo);
        System.out.println(serieFibonacci);
    }
    
    //Método de cálculo da Sequência de Fibonacci
    static String calculaSequenciaFibonacci(int limite){
        long anterior, atual, resultado;
        String serie = "0";
        anterior = 0;
        atual = 1;
        resultado = atual;
        
        if(limite > 1){
            for (int cta = 1; cta < limite; cta++) {
            serie = serie + " " + resultado;
            resultado = anterior + atual;
            anterior = atual;
            atual = resultado;
            
            }
        }else if (limite == 0) {
            serie = "vazio";
        }
        return serie;
    }
}
