package test;

import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {

	private static final long serialVersionUID = 1L;

public void paint(Graphics g) {
    g.drawRect (100, 100, 100, 100);  
  }
}

public class DibujarCuadrado {
  public static void main(String[] a) {
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setBounds(10, 10, 300, 300);
    window.getContentPane().add(new MyCanvas());
    window.setVisible(true);
  }
}