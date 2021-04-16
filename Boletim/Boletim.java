
import java.util.Objects;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorbe
 */
public class Boletim {
    public static void main(String[] args){
        double nota1,nota2,nota3,nota4,nota5,media;
        String nome,Qtd;
        
        //JOption.showInputDialog - local para o usuário escrever a informação aparecendo em uma janela
        nome = JOptionPane.showInputDialog("Digite seu nome");
        
        Qtd = JOptionPane.showInputDialog("Digite quantidade de notas que você recebeu:");
        
        if(Objects.equals(Qtd, "4")){
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota:"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota:"));
            nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3° nota:"));
            nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4° nota:"));
            
            media = (nota1+nota2+nota3+nota4)/4;
            
            //Para exibir a nota
            JOptionPane.showMessageDialog(null," Aluno: " + nome + " \nSua média : "  + media);
            if(media >= 6){
            JOptionPane.showMessageDialog(null,"APROVADO!!");
            }else{
            JOptionPane.showMessageDialog(null,"REPROVADO!!");
            }
            
        }else if (Objects.equals(Qtd, "3")){
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota:"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota:"));
            nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3° nota:"));
            
            media = (nota1+nota2+nota3)/3;
            
            JOptionPane.showMessageDialog(null," Aluno: " + nome + " \nSua média : " + media);
            if(media >= 6){
            JOptionPane.showMessageDialog(null,"APROVADO!!");
            }else{
            JOptionPane.showMessageDialog(null,"REPROVADO!!");
            }
        }else if(Objects.equals(Qtd, "2")){
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota:"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota:"));
            
            media = (nota1+nota2)/2;
            
            JOptionPane.showMessageDialog(null," Aluno: " + nome + " \nSua média : " + media);
            if(media >= 6){
            JOptionPane.showMessageDialog(null,"APROVADO!!");
            }else{
            JOptionPane.showMessageDialog(null,"REPROVADO!!");
            }
        }else{
            JOptionPane.showMessageDialog(null,"ERRO!! \n Permitido somente quantidade de notas entre 2 a 4");
        }
    }
}
