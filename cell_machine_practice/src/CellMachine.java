import javax.swing.JFrame;


public class CellMachine {
    public static void main(String[] args) {
        //准备数据
        Field field = new Field(30,30);
        for(int i=0;i<field.getHeight();i++){
            for(int j=0;j<field.getWidth();j++){
                field.place(i, j, new Cell());
            }
        }
        for(int i=0;i<field.getHeight();i++){
            for(int j=0;j<field.getWidth();j++){
                Cell cell = field.get(i, j);
                if(Math.random()<0.2){
                    cell.reborns();//上段for填进去的cell()是死的
                }
            }
        }
        //View
        View view = new View(field);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//图形右上角的"x"会结束该图形
        frame.setResizable(false);
        frame.setTitle("Cells");
        frame.add(view);
        frame.pack();
        frame.setVisible(true);

        for(int k=0;k<1000;k++){
            for(int i=0;i<field.getWidth();i++){
                for(int j=0;j<field.getHeight();j++){
                    Cell cell = field.get(i, j);
                    Cell[] neighbour = field.getNeighbour(i, j);
                    int numOfAlive=0;
                    for(Cell c: neighbour){
                        if(c.isAlive()==true){
                            numOfAlive++;
                        }
                    }
                    System.out.print("["+i+"]["+j+"]:");
					System.out.print(cell.isAlive()?"live":"dead");
					System.out.print(":"+numOfAlive+"-->");

                    if(cell.isAlive()){
                        if(numOfAlive<2 || numOfAlive>3){
                            cell.isDie();     
                            System.out.println("Die"); 
                        }
                    }
                    else if(numOfAlive==3){
                        cell.reborns();
                        System.out.println("Reborn");
                    }
                    
                }
            }
            System.out.println("UPDATE");
            frame.repaint();
            try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }

    }
}
