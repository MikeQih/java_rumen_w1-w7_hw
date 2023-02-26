import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JPanel{
    private static final long serialVersionUID = -5258995676212660595L;
	private static final int GRID_SIZE = 16;
	private Field theField;
	
	public View(Field field) {
		theField = field;
	}
    @Override
	public void paint(Graphics g) {//每次窗口要显现出来时，这个paint就会被调用
		super.paint(g);
        g.setColor(Color.gray);
        for(int i=0;i<theField.getHeight();i++){//画网格，drawLine(int x1, int y1, int x2, int y2)
            g.drawLine(0, i*GRID_SIZE, theField.getWidth()*GRID_SIZE, i*GRID_SIZE);
            g.drawLine(i*GRID_SIZE, 0, i*GRID_SIZE, theField.getHeight()*GRID_SIZE);
        }
		for ( int row = 0; row<theField.getHeight(); row++ ) {
			for ( int col = 0; col<theField.getWidth(); col++ ) {
				Cell cell = theField.get(row, col);
				if ( cell != null ) { //如果细胞是有的，就把自己画出来
					cell.draw(g, col*GRID_SIZE, row*GRID_SIZE, GRID_SIZE);
				}
			}
		}
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(theField.getWidth()*GRID_SIZE+1, theField.getHeight()*GRID_SIZE+1);
	}
    
}
