package com.reflexao;

import java.lang.reflect.Method;

public class MetodosDaClasse {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> classe = Class.forName("com.reflexao.models.Pessoa");

       // Method[] metodos = classe.getDeclaredMethods();

         Method[] metodos = classe.getMethods();

        for (Method metodo : metodos) {
            System.out.println("Método:" + metodo);

            Class<?>[] parametros = metodo.getParameterTypes();

            for (Class<?> parametro : parametros) {
                System.out.println("Parâmetro do método " + parametro);
            }

            Class<?>[] excecoes = metodo.getExceptionTypes();

            for (Class<?> excecao : excecoes) {
                System.out.println("Exceções do método " + excecao);
            }

            System.out.println("\n-------------------------\n");
        }
    }
}
