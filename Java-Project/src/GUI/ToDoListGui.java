package GUI;

import javax.swing.*;

public class ToDoListGui extends JFrame {
    public ToDoListGui(){
        super("To Do List App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(CommonConstants.GUI_SIZE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        addGuiComponents();
    }
    private void addGuiComponents(){
        JLabel banner = new JLabel("To do List");
        banner.setBounds(
                (CommonConstants.GUI_SIZE.width - banner.getPreferredSize().width / 2),
                15,
                CommonConstants.BANNER_SIZE.width, CommonConstants.BANNER_SIZE.height
        );
        // añado al marco
        this.getContentPane().add(banner);
    }
}
