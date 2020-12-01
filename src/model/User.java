package model;
//calendaro_dos_signos
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 1
 * @since 22/11/2020
 */
public class User {
    
    private String nome;
    private byte byteDay, byteMonth;
    private int intYear;

    public byte getByteDay() {
        return byteDay;
    }

    public void setByteDay(byte byteDay) {
        this.byteDay = byteDay;
    }

    public byte getByteMonth() {
        return byteMonth;
    }

    public void setByteMonth(byte byteMonth) {
        this.byteMonth = byteMonth;
    }

    public int getIntYear() {
        return intYear;
    }

    public void setIntYear(int intYear) {
        this.intYear = intYear;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String calcularSigno(byte day, byte month, int year){
        String stringAnswer = null;
       
                switch(month){
                    case 1:
                        if(day >= 1 && day <= 21){
                            stringAnswer = "capricornio";
                        }else{
                            stringAnswer = "Aquario";
                        }
                        
                        break;
                    case 2:
                        if(day >= 1 && day <= 18){
                            stringAnswer = "Aquario";
                        }else{
                            stringAnswer = "Peixes";
                        }
                        break;
                    case 3:
                        if(day >= 1 && day <= 19){
                            stringAnswer = "Peixes";
                        }else{
                            stringAnswer = "Aries";
                        }
                        break;
                    case 4:
                        if(day >= 1 && day <= 20){
                            stringAnswer = "Aries";
                        }else{
                            stringAnswer = "Touro";
                        }
                        break;
                    case 5:
                        if(day >= 1 && day <= 20){
                            stringAnswer = "Touro";
                        }else{
                            stringAnswer = "Gêmeos";
                        }
                        break;
                    case 6:
                        if(day >= 1 && day <= 20){
                            stringAnswer = "Gêmeos";
                        }else{
                            stringAnswer = "Câncer";
                        }
                        break;                    
                    case 7:
                        if(day >= 1 && day <= 21){
                            stringAnswer = "Câncer";
                        }else{
                            stringAnswer = "Leão";
                        }
                        break;
                    case 8:
                        if(day >= 1 && day <= 22){
                            stringAnswer = "Leão";
                        }else{
                            stringAnswer = "Virgem";
                        }
                        break;
                    case 9:
                        if(day >= 1 && day <= 22){
                            stringAnswer = "Virgem";
                        }else{
                            stringAnswer = "Libra";
                        }
                        break;
                    case 10:
                        if(day >= 1 && day <= 22){
                            stringAnswer = "Libra";
                        }else{
                            stringAnswer = "Escorpião";
                        }
                        break;
                    case 11:
                        if(day >= 1 && day <= 21){
                            stringAnswer = "Escorpião";
                        }else{
                            stringAnswer = "Sargitário";
                        }
                        break;
                    case 12:
                        if(day >= 1 && day <= 21){
                            stringAnswer = "Sargitário";
                        }else{
                            stringAnswer = "Capricórnio";
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                        break;
                }
        return stringAnswer;
    }

    @Override
    public String toString() {
        return "nome: " + this.nome + "\n"
                + "Dia: " + this.byteDay + "\n"
                + "Mês: " + this.byteMonth + "\n"
                + "Ano: " + this.intYear + "\n\n"
                + "Signo: " + calcularSigno(byteDay, byteMonth, intYear);
    }

    
    
}
