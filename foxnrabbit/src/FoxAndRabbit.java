import java.awt.BorderLayout;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FoxAndRabbit {
    private Field theField;
    private View theView;
    private JFrame frame;

    public FoxAndRabbit(int size){
        theField = new Field(size,size);
        for ( int row = 0; row<theField.getHeight(); row++ ) {
			for ( int col = 0; col<theField.getWidth(); col++ ) {
                double probability = Math.random();
                if(probability<0.05){
                    theField.place(row, col, new Fox());
                }
                else if(probability<0.15){
                    theField.place(row, col, new Rabbit());
                }
				
			}
		}

        //把theField加入显示框
        theView = new View(theField);
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//图形右上角的"x"会结束该图形
		frame.setResizable(false);
		frame.setTitle("Cells");
		frame.add(theView);
        JButton btnStep = new JButton("单步");
        frame.add(btnStep,BorderLayout.NORTH);
        btnStep.addActionListener(new ActionListener() {//ActionListener是接口
            @Override
            public void actionPerformed(ActionEvent e) {//匿名类（函数的内部类）
                /*
                接口中就一个actionPerformed()函数，把实现了ActionListener接口的对象传给JButton
                JButton被按下去之后，再反过来顺着原来的路径，
                实现自己写的actionPerformed中的函数。这个过程叫：反转控制
                */
                System.out.println("按下啦！");
                step();
                frame.repaint();
            }
        });
		frame.pack();
		frame.setVisible(true);
    }
    public void start(int steps){
        for(int i=0;i<steps;i++){
            step();
            theView.repaint();

            try {//让细胞变化的慢一点
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }
    public void step(){
        for(int row=0;row<theField.getHeight();row++){
            for(int col=0;col<theField.getWidth();col++){
                Cell cell = theField.get(row, col);
                if(cell!=null){
                    Animal animal = (Animal)cell;
                    animal.grow();
                    if(animal.isAlive()){
                        //move
                        Location loc = animal.move(theField.getFreeNeighbour(row, col));
                        if(loc!=null){
                            theField.move(row, col,loc);
                        }

                        //eat
                        Cell[] neighbour = theField.getNeighbour(row,col);
                        ArrayList<Animal> listRabbit = new ArrayList<Animal>(); //试一下换成Rabbit类可以
                        for(Cell an:neighbour){
                            if(an instanceof Rabbit){//instanceof 测试左边的类是否是右边的实例
                                listRabbit.add((Rabbit)an);
                            }
                        }
                        if(!listRabbit.isEmpty()){ //用null呢？
                            Animal fed = animal.feed(listRabbit);
                            if(fed!=null){
                                theField.remove((Cell)fed);
                            }
                        }

                        //breed
                        Animal baby = animal.breed();
                        if(baby!=null){
                            theField.placeRandomAdj(row, col, (Cell)baby);
                        }
                    }
                    else{
                        theField.remove(row,col);
                    }

                }
            }
        }
    }
    public static void main(String[] args) {
        FoxAndRabbit fx = new FoxAndRabbit(30); //30x30的网格
        // fx.start(100); //走100步
        
    }
}
