package com.example.calculadoraetanolgas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
              double quantLitros;
              double valorGasolina;
              double valorEtanol;
              double perc;

              /*Scanner teclado;
              teclado = new Scanner(System.in);

                System.out.println("Calculo de Etanol/Gasolina");
                System.out.println("Qual preço do etanol? ");
                valorEtanol = teclado.nextDouble();
                System.out.println("Qual preço da gasolina? ");
                valorGasolina = teclado.nextDouble();
                perc = (valorEtanol / valorGasolina) * 100;
                   if(perc <=70) {
                       System.out.println("Abasteça com etanol!");
                   } else System.out.println("Abasteça com gasolina!");
                    }
                }*/
            }
}