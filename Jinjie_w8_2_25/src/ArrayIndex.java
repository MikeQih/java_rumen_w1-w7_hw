class OpenException extends Exception{

}
class CloseException extends OpenException{

}
class NewException extends Exception{

}
public class ArrayIndex{
    public ArrayIndex() throws OpenException{}
    public void f() throws OpenException{}
    public static void main(String[] args) {
        
    }
}
class NewClass extends ArrayIndex{
    public NewClass() throws OpenException, NewException{}
    public void f(){}
    public static void main(String[] args) {
        try {
            ArrayIndex p = new NewClass(); //把子类的对象new出来，当成父类的变量
            p.f();
        } catch (OpenException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NewException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
// public class ArrayIndex {
//     public static int open(){
//         int[] a = new int[10];
//         a[10]=10;
//         return -1;
//     }
//     public static void readFile() throws OpenException, CloseException{
//         if(open()==-1){
//             throw new OpenException();
//         }
//     }
//     public static void main(String[] args) {
//         try {
//             readFile();
//         } catch (OpenException e) {
//             e.printStackTrace();
//             System.out.println("open");
//         } catch (Exception e) {
//             e.printStackTrace();
//             System.out.println("close");
//         }
//     }
// }
