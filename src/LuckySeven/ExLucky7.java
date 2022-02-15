package LuckySeven;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ExLucky7 {
    private JButton buttonLuckySeven;
    private JLabel labelNum1;
    private JLabel labelNum2;
    private JLabel labelNum3;
    private JLabel labelPremio;
    private JPanel panelLuckySeven;

    public static void main(String[] args) {
        JFrame frame = new JFrame("LuckySeven");
        frame.setContentPane(new ExLucky7().panelLuckySeven);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550,500);
        //frame.pack();
        frame.setVisible(true);
    }

    public ExLucky7() {
        buttonLuckySeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rnd = new Random();

                int n1 = rnd.nextInt(8);
                int n2 = rnd.nextInt(8);
                int n3 = rnd.nextInt(8);

                labelNum1.setText(String.valueOf(n1));
                labelNum2.setText(String.valueOf(n2));
                labelNum3.setText(String.valueOf(n3));

                String premio = "";
                if(n1==7 && n2==7 && n3==7){
                    premio = "Parabéns! Ganhou o 1º premio: 1.000.000€";
                }
                else if((n1==7 && n2==7) || (n2==7 && n3==7) || (n1==7 && n3==7)){
                    premio = "Parabéns! Ganhou o 2º premio: 500.000€";
                }
                else if(n1==7 || n2==7 || n3==7){
                    premio = "Parabéns! Ganhou o 3º premio: 100.000€";
                }
                else if((n1+n2+n3)==7){
                    premio = "Parabéns! Ganhou o 4º premio: 50.000€";
                }
                else{
                    premio = "Não desista! Tente novamente";
                }
                labelPremio.setText(premio);
            }
        });
    }
}
