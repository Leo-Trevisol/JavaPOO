package com.reflexao;

import com.reflexao.models.Pessoa;

import java.lang.reflect.Field;
import java.text.ParseException;

public class AlteracaoAtributosDaClasse {

    public static void main(String[] args) throws ClassNotFoundException {
        Pessoa pessoa = new Pessoa(1, "Danilo Caneschi", "55566633352");

        Class<?> classe = Class.forName("com.reflexao.models.Pessoa");

        try {
            Field cpf = classe.getDeclaredField("cpf");
            cpf.setAccessible(true);
            cpf.set(pessoa, "11122233344");

            System.out.println("Novo valor do atributo: " + pessoa.cpfFormatado());
        } catch (IllegalAccessException | NoSuchFieldException | ParseException e) {
            e.printStackTrace();
        }
    }
}
