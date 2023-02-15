package com.reflexao;

import java.lang.reflect.Constructor;

public class ConstrutorDaClasse {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> classe = Class.forName("com.reflexao.models.Pessoa");

        Constructor<?>[] construtores = classe.getDeclaredConstructors();

        for (Constructor<?> construtor : construtores) {
            System.out.println(construtor);
        }
    }
}
