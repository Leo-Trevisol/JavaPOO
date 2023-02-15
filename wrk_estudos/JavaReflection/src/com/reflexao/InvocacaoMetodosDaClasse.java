package com.reflexao;

import com.reflexao.models.Pessoa;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvocacaoMetodosDaClasse {

    public static void main(String[] args) throws ClassNotFoundException {
        Pessoa pessoa = new Pessoa(1, "Danilo Caneschi", "55566633352");

        try {
            Class<?> classe = Class.forName("com.reflexao.models.Pessoa");

            Method metodo = classe.getMethod("cpfFormatado");

            Object resultado = metodo.invoke(pessoa);

            System.out.println("Método sem parâmetro:" + resultado);

            //Método com parâmetro
            metodo = classe.getMethod("cpfQualquerFormatado", String.class);

            Object[] parametros = new Object[1];
            parametros[0] = "22244456602";
            resultado = metodo.invoke(pessoa, parametros);

            System.out.println("Método com parâmetro: " + resultado);

        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
