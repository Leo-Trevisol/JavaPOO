package com.reflexao;

import java.lang.reflect.Field;

public class AtributosDaClasse {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> classe = Class.forName("com.reflexao.models.Pessoa");

        //Field[] atributos = classe.getDeclaredFields();
        Field[] atributos = classe.getFields();

        for (Field atributo : atributos) {
            System.out.println(atributo);
        }
    }
}
