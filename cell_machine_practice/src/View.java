import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JPanel{//JPanel是java中用来表示画面的东西
    private static final long serialVersionUID = -5258995676212660595L;
	private static final int GRID_SIZE = 16;
    private Field theField;

    public View(Field field){
        theField = field;
    }

    @Override
    public void paint(Graphics g) {//每次窗口要显现出来时，这个paint就会被调用
        // TODO Auto-generated method stub
        super.paint(g);
        for(int i=0;i<theField.getWidth();i++){
            for(int j=0;j<theField.getHeight();j++){
                Cell cell = theField.get(i, j);
                if(cell!=null){ //如果细胞是有的，就把自己画出来
                    cell.draw(g,i*GRID_SIZE, j*GRID_SIZE, GRID_SIZE);
                }
            }
        }
    }

    @Override
    public Dimension getPreferredSize() {
        // TODO Auto-generated method stub
		return new Dimension(theField.getWidth()*GRID_SIZE+1, theField.getHeight()*GRID_SIZE+1);
    }
    


}
