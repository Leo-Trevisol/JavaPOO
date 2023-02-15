package com.reflexao.models;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.time.LocalDate;

public class Pessoa {
    public static int totalPessoa;

    private long codigo;
    private String nome;
    private String cpf;
    private int idade;
    private String email;
    private LocalDate dataAniversario;

    public Pessoa() {
    }

    public Pessoa(long codigo, String nome, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String cpfFormatado() throws ParseException {
        MaskFormatter formatter = new MaskFormatter("###.###.###-##");
        formatter.setValueContainsLiteralCharacters(false);
        return formatter.valueToString(this.cpf);
    }

    public String cpfQualquerFormatado(String cpf) throws ParseException {
        MaskFormatter formatter = new MaskFormatter("###.###.###-##");
        formatter.setValueContainsLiteralCharacters(false);
        return formatter.valueToString(cpf);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
