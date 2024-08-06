
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;


public class slider extends JFrame implements ChangeListener {
    JSlider redslider,greenslider,blueslider;
    JLabel redlabel,greenlabel,bluelabel;
    JTextField redtext,greetext,bluetext;
    JPanel panel;
    slider(){

        redlabel=new JLabel("Red");
        redlabel.setBounds(70,40,50,40);
        redlabel.setFont(new Font("Serif",Font.BOLD,20));
        redlabel.setForeground(Color.WHITE);
        add(redlabel);
        redslider=new JSlider(0,255,0);
        redslider.setBounds(190,40,450,40);
        redslider.setMinorTickSpacing(10);
        redslider.setMajorTickSpacing(50);
        redslider.setPaintTicks(true);
        redslider.setPaintLabels(true);
        redslider.addChangeListener(this);
        redslider.setToolTipText("Slide this bar for increasing red color quantity");
        add(redslider);
        redtext =new JTextField();
        redtext.setBounds(690,40,80,40);
        redtext.setBackground(Color.GRAY);
        redtext.setForeground(Color.WHITE);
        redtext.setFont(new Font("Serif",Font.BOLD,20));
        add(redtext);

        greenlabel=new JLabel("Green");
        greenlabel.setBounds(70,100,60,40);
        greenlabel.setFont(new Font("Serif",Font.BOLD,20));
        greenlabel.setForeground(Color.WHITE);
        add(greenlabel);
        greenslider=new JSlider(0,255,0);
        greenslider.setBounds(190,100,450,40);
        greenslider.setMinorTickSpacing(10);
        greenslider.setMajorTickSpacing(50);
        greenslider.setPaintTicks(true);
        greenslider.setPaintLabels(true);
        greenslider.addChangeListener(this);
        greenslider.setToolTipText("Slide this bar for increasing green color quantity");
        add(greenslider);
        greetext =new JTextField();
        greetext.setBounds(690,100,80,40);
        greetext.setBackground(Color.GRAY);
        greetext.setForeground(Color.WHITE);
        greetext.setFont(new Font("Serif",Font.BOLD,20));
        add(greetext);

        bluelabel=new JLabel("Blue");
        bluelabel.setBounds(70,160,50,40);
        bluelabel.setFont(new Font("Serif",Font.BOLD,20));
        bluelabel.setForeground(Color.WHITE);
        add(bluelabel);
        blueslider=new JSlider(0,255,0);
        blueslider.setBounds(190,160,450,40);
        blueslider.setMinorTickSpacing(10);
        blueslider.setMajorTickSpacing(50);
        blueslider.setPaintTicks(true);
        blueslider.setPaintLabels(true);
        blueslider.addChangeListener(this);
        blueslider.setToolTipText("Slide this bar for increasing blue color quantity");
        add(blueslider);
        bluetext =new JTextField();
        bluetext.setBounds(690,160,80,40);
        bluetext.setBackground(Color.GRAY);
        bluetext.setForeground(Color.WHITE);
        bluetext.setFont(new Font("Serif",Font.BOLD,20));
        add(bluetext);

        JLabel preview=new JLabel("Preview");
        preview.setBounds(380,280,120,50);
        preview.setFont(new Font("Arial",Font.BOLD,24));
        preview.setForeground(Color.WHITE);
        add(preview);

        panel=new JPanel();
        panel.setBounds(70,330,750,300);
        add(panel);




        ImageIcon icon = new ImageIcon(getClass().getResource("icon/logo.png"));
        setIconImage(icon.getImage());
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/back.jpeg"));
        Image i2=i1.getImage().getScaledInstance(900,700,4);
        ImageIcon i3=new ImageIcon(i2);
        JLabel back=new JLabel(i3);
        back.setBounds(0,0,900,700);
        add(back);
        setTitle("RGB Creator");
        setBounds(180,20,900,700);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        int redquantity=redslider.getValue();
        int greenquantity=greenslider.getValue();
        int bluequantity=blueslider.getValue();

        redtext.setText("    "+redquantity);
        greetext.setText("    "+greenquantity);
        bluetext.setText("    "+bluequantity);

        panel.setBackground(new Color(redquantity,greenquantity,bluequantity));

    }

    public static void main(String[] args) {
        new slider();
    }
}
