import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class factorial {
    private JTextField txtinput1;
    private JTextField txtoutput1;
    private JButton findFactorialButton;

    public factorial() {
        findFactorialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int num = Integer.parseInt(txtinput1.getText());
//                int res = Integer.parseInt(txtoutput1.getText());

//                if(num == 1){
//                    txtoutput1.setText("1");
//                }
//
//                if (num == 0){
//                    txtoutput1.setText("0");
//                }

                    int res = multiplyNumbers(num);
//                    Math.abs(res);
                    txtoutput1.setText(String.valueOf(res));
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtoutput1.setText("");
                txtinput1.setText("");
            }
        });
    }

    public static int multiplyNumbers(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        } else if (num == 0) {
            return 0; // base case for zero
        } else if (num == 1) {
            return 1; // base case for one
        } else {
            return num * multiplyNumbers(num - 1); // recursive case
        }
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("factorial");
        frame.setContentPane(new factorial().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



    private JPanel Main;
    private JButton clearButton;
}
