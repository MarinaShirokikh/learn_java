package lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow extends JFrame {
    private static final int WIN_WIDTH = 500;
    private static final int WIN_HEIGHT = 300;
    private static final int WIN_POSX = 650;
    private static final int WIN_POSY = 250;
    private JLabel label;

    NewWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(WIN_POSX, WIN_POSY);
        setTitle("New window for practice GUI");

        setResizable(false); //запрет на изменение размеров окна
        JButton btnStart = new JButton("Don't Click");
        JButton btnStop = new JButton("Exit");
        JLabel label = new JLabel("You clicked the Button!");


        btnStop.addActionListener(new ActionListener() { //обработка кнопки exit
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        ActionListener listener = new ActionListener() { //?
            @Override
            public void actionPerformed(ActionEvent e) {
                setSize(WIN_WIDTH + 100, WIN_HEIGHT + 100);
                add(label, BorderLayout.NORTH);
                label.setVisible(true);

            }
        };

        btnStart.addActionListener(listener);

        JPanel pBtns = new JPanel(new GridLayout(1, 2));
        pBtns.add(btnStart);
        pBtns.add(btnStop);

        add(pBtns, BorderLayout.SOUTH);
        setVisible(true);

    }
}
