package com.opet;

import com.opet.util.Reader;
public class main
{

    public static void main(String[] args) throws Exception
    {
        // TODO Auto-generated method stub
        System.out.println("Digite um número: ");
        int numero = Reader.readInt();

        for(int x = 1; x<= numero; x++) {
            if( (x % 3 == 0) && (x % 7 == 0) ) {
                System.out.println("Número "+x+" é múltiplo de 3 e 7");
            }
        }

    }



}
