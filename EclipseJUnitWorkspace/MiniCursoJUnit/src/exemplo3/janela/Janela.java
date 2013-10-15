//esta janela "n�o poderia" mudar de posi��o
package exemplo3.janela;

import java.awt.Point;
import javax.swing.JFrame;

public class Janela extends JFrame{
	private static final long serialVersionUID = 1L;
	private Point xy;
	
	public Janela(int x, int y) {
		super(x + "," + y);
		xy = new Point(x, y);
	}
	
	public void exibir() {
		this.setLocation(xy);
		this.setVisible(true);
	}
}
