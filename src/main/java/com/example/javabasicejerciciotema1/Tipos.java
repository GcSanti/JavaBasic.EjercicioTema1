package com.example.javabasicejerciciotema1;

import java.util.ArrayList;
import java.util.List;

public class Tipos {
    public static void main(String[] args) {

        List<String> nombres1 = new ArrayList<>();
        nombres1.add("Tipos de datos enteros:" + "    byte,short,int,long\n");
        nombres1.add("Tipos de datos decimales:" + "  float,double,double\n");
        nombres1.add("Tipos de datos booleano:" + "   true(verdadero),false(falso)\n");
        nombres1.add("Tipos de datos texto:" + "      char, String\n");

        for (String nn : nombres1) {
            System.out.println(nn);

        }
    }
}






