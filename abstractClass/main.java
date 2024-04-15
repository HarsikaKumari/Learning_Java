import javax.swing.*;
import java.awt.event.*;
class Gui implements MouseListener
{
JFrame jf;
JLabel jl;
int i=0;
Gui()
{
jf = new JFrame("Software");

jf.setSize(600,300);
jf.setLocation(450, 240);
jf.setLayout(null);
jl = new JLabel("Chetan Suri");
jl.setBounds(240,40,100,50);
jl.addMouseListener(this);

jf.add(jl);
jf.setVisible(true);

}

@Override
public void mouseClicked(MouseEvent e) {
i++;
System.out.println(i);
if(i==5)
{
System.exit(0);

}
}

@Override
public void mousePressed(MouseEvent e) {
// TODO Auto-generated method stub

}

@Override
public void mouseReleased(MouseEvent e) {
// TODO Auto-generated method stub

}

@Override
public void mouseEntered(MouseEvent e) {
jl.setText("You Enter in My Zone");

}

@Override
public void mouseExited(MouseEvent e) {
jl.setText("Chetan Suri");
}

}


public class Main {

public static void main(String[] args) {

Gui g = new Gui();

}

}