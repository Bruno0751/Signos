package model;
//calendaro_dos_signos

/**
 *
 * @author Bruno Gressler da Silveira
 * @version 1
 * @since 22/11/2020
 */
public class User {
    
    private String nome;
    private byte dia, mes;
    private int ano;

    public User() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "nome: " + this.nome + "\n"
                + "Dia: " + this.dia + "\n"
                + "Mês: " + this.mes + "\n"
                + "Ano: " + this.ano;
    }
}
