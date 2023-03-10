import java.util.ArrayList;

// package Jinjie_w3_notebook;
class Value{
    private int i;
    public String toString(){return ""+i;}
    public void set(int i){this.i = i;}
    public int get(){return i;}

}
public class NoteBook {
    private ArrayList<String> notes = new ArrayList<String>(); 
    public void add(String s){
        notes.add(s);

    }
    public int getSize(){
        return notes.size();
    }
    public String getNote(int index){
        return notes.get(index);
    }

    public void removeNote(int index){
        notes.remove(index);
    }

    public String[] list(){
        String[] a = new String[notes.size()];
        // for(int i=0;i<notes.size();i++){
        //     a[i] = notes.get(i);
        // }
        notes.toArray(a);
        return a;


    }
    public static void main(String[] args) {
        Value v = new Value();
        v.set(10);
        System.out.println(v);
        // int[] ia = new int[10];
        // // for(int i=0;)
        // String[] a = new String[10];
        // for(int i=0;i<a.length;i++){
        //     a[i] = ""+i;
        // }
        // System.out.println(ia[0]+2);
        // System.out.println(a[0].length());

        
        // NoteBook nb = new NoteBook();
        // nb.add("first");
        // nb.add("second");
        // nb.add("third");

        // System.out.println(nb.getSize());
        // nb.removeNote(0);
        // String[] a = nb.list();
        // for(String s:a){
        //     System.out.println(s);
        // }
        
    }
}

