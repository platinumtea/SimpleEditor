import javax.swing.*;

public class SimpleEditor {
	public static void main(String[] args) {
		JFrame frame = new JFrame("SimpleEditor");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new SimpleEditorPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
