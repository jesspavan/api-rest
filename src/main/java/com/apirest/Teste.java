package com.apirest;

import java.util.ArrayList;
import java.util.List;

public class Teste extends ApiRestApplication{
    static String a = "lalala";

    public static void main(String[] args) {
        String b;
        System.out.println(100+100+a);
        System.out.println(a+100+100);
        ArrayList<Integer> array = new ArrayList<>();

        principioDeSubstituiçãoDeLiskov(array);
    }

    public static void principioDeSubstituiçãoDeLiskov(List<Integer>lista){
        return;
    }
}
