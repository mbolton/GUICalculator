import javax.swing.JFrame;
public class Interface
{
	private JFrame calc;
	public Interface(String name)
	{
		calc = new JFrame(name);
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void setVisible()
	{
		
		calc.pack();
		calc.setVisible(true);		
	}
}