import java.util.ArrayList;
import java.util.Scanner;


class Point{
    int x;
    int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}

public class FinalExam {
    private static int[][] field;
    private static int step;
    public static void main(String[] args) {
        getInput();
        run(step);
        int numOfAlive = getLiveCells();
        System.out.println(numOfAlive);
        
    }
    public static int getLiveCells(){
        int totalAlive=0;
        // System.out.println("filed[0]是："+field[0]);
        // System.out.println("filed[1]是："+field[1]);
        // System.out.println("filed[2]是："+field[2]);
        for(int[] rows:field){
            // System.out.println("rows[0]是："+rows[0]);
            // System.out.println("rows[1]是："+rows[1]);
            // System.out.println("rows[2]是："+rows[2]);
            for(int col:rows){
                // System.out.println("cols是："+col);
                totalAlive+=col;
            }
        }
        return totalAlive;
    }
    public static void run(int step){
        ArrayList<Point> liveCells = new ArrayList<>();
        ArrayList<Point> deadCells = new ArrayList<>();
        for(int k=0;k<step;k++){
            for(int i=0;i<field.length;i++){
                for(int j=0;j<field[i].length;j++){
                    int numberOfAlive = getNeighbour(i,j);
                    if(field[i][j]==1 && (numberOfAlive<2 || numberOfAlive>3)){
                        deadCells.add(new Point(i,j));
                    }
                
                    else if(field[i][j]==0 && numberOfAlive==3){
                        liveCells.add(new Point(i,j));
                    }
                }
            }
            for(Point point:liveCells){
                field[point.x][point.y]=1;
            }
            for(Point point:deadCells){
                field[point.x][point.y]=0;
            }
        }
    }
    public static int getNeighbour(int row, int col){
        int aliveNeighbour = 0;
        for(int i=-1;i<2;i++){
            for(int j=-1;j<2;j++){
                int r = row+i;
                int c = col+j;
                if(r>-1 && r<field.length && c>-1 && c<field.length && !(r==row && c==col)){
                    aliveNeighbour += field[r][c]; //活着的就是1，死的就是2
                }
            }
        }
        return aliveNeighbour;
    }

    public static void getInput(){
        Scanner num = new Scanner(System.in);
        System.out.print("请输入宽度和高度：");
        int width = num.nextInt();
        int height = num.nextInt();
        field = new int[width][height];

        int i,j;
        System.out.println("请输入活着的点：");
        while(true){
            i = num.nextInt();
            j = num.nextInt();
            if(i==-1 && j==-1){
                break;
            }
            else{
                field[i][j]=1;
            }
        }

        System.out.print("请输入要执行的步数：");
        step = num.nextInt();
        num.close();
    }
}


