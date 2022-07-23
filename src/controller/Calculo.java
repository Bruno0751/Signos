package controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Gressler da Silveira
 * @version 1
 * @since 10/07/2022
 */
public class Calculo {

    public static String calcularSigno(byte dia, byte mes, String anoBisexto) {
        String resposta = null;

        switch (mes) {
            case 1:
                if (dia >= 21 && dia <= 31) {
                    resposta = "Aquário";
                } else {
                    resposta = "Sargitário";
                }

                break;
            case 2:
                if (anoBisexto.equals("Sim")) {
                    if (dia >= 20 && dia <= 29) {
                        resposta = "Peixes";
                    } else {
                        resposta = "Aquário";
                    }
                } else {
                    if (dia >= 20 && dia <= 28) {
                        resposta = "Peixes";
                    } else {
                        resposta = "Aquário";
                    }
                }
                break;
            case 3:
                if (dia >= 21 && dia <= 31) {
                    resposta = "Aries";
                } else {
                    resposta = "Peixes";
                }
                break;
            case 4://abril
                if (dia >= 21 && dia <= 30) {
                    resposta = "Touro";
                } else {
                    resposta = "Aries";
                }
                break;
            case 5://maio
                if (dia >= 21 && dia <= 31) {
                    resposta = "Gêmeos";
                } else {
                    resposta = "Touro";
                }
                break;
            case 6://junho
                if (dia >= 22 && dia <= 30) {
                    resposta = "Câncer";
                } else {
                    resposta = "Gêmeos";
                }
                break;
            case 7://julho
                if (dia >= 21 && dia <= 31) {
                    resposta = "Leão";
                } else {
                    resposta = "Gêmeos";
                }
                break;
            case 8://agosto
                if (dia >= 23 && dia <= 31) {
                    resposta = "Virgem";
                } else {
                    resposta = "Leão";
                }
                break;
            case 9://setembro
                if (dia >= 23 && dia <= 30) {
                    resposta = "Libra";
                } else {
                    resposta = "Virgem";
                }
                break;
            case 10://outubro
                if (dia >= 23 && dia <= 31) {
                    resposta = "Escorpião";
                } else {
                    resposta = "Libra";
                }
                break;
            case 11:
                if (dia >= 20 && dia <= 30) {
                    resposta = "Sargitário";
                } else {
                    resposta = "Escorpião";
                }
                break;
            case 12:
                if (dia >= 22 && dia <= 31) {
                    resposta = "Capricórnio";
                } else {
                    resposta = "Sargitário";
                }
                break;
        }
        return resposta;
    }
}
