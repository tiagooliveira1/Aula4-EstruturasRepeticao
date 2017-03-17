package com.opet;

import com.opet.util.Reader;
public class main
{

    public static void main(String[] args) throws Exception
    {
        // TODO Auto-generated method stub
        System.out.println("Digite um número: ");
        int numero = Reader.readInt();

        for(int x = 0; x<= numero; x++) {
            if( (x % 3 == 0) && (x % 7 == 0) && (x != 0)) {
                System.out.println("Número "+x+" é múltiplo de 3 e 7");
            }
        }
        System.out.println("Aperte uma tecla para executar o próximo exercício");
        System.in.read();

        // segunda parte do exercicio
        for(int x = 0; x<= 100; x++) {
            if( x % 2 == 0 )
                System.out.println(x+" é par");
            else
                System.out.println(x+" é ímpar");

        }

    }



}
