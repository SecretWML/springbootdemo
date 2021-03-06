import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyledDocument;
import java.util.ArrayList;

class TextPaneDemo extends JFrame
{
    public void createAndShowGUI()throws Exception
    {
        JTextPane tp = new JTextPane();
        ArrayList<String> data = new ArrayList();
        data.add("Data here");
        data.add("Data here 2");
        data.add("Data here 3");
        data.add("Data here 4");
        getContentPane().add(tp);
        setSize(300,400);
        StyledDocument doc = tp.getStyledDocument();
        SimpleAttributeSet attr = new SimpleAttributeSet();
        for (String dat : data )
        {
            doc.insertString(doc.getLength(), dat, attr );
            tp.setCaretPosition(tp.getDocument().getLength());
            tp.insertComponent(new JButton("Click"));
            doc.insertString(doc.getLength(), " ", attr );
        }

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                TextPaneDemo tpd = new TextPaneDemo();
                try
                {
                    tpd.createAndShowGUI();
                }
                catch (Exception ex){}
            }
        });
    }
}