import java.util.Scanner;

//jinjie week1 hw: 输入四个整数，组成两个分数，对其进行加减乘除
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入四个整数(用空格区分)：");
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}
}
class Fraction{
	// String s="";
	double result;
	int a,b;
	Fraction(int a,int b){
		this.a = a;
		this.b = b;
		// s = a+"/"+b;
		// print();
	}
	double toDouble(){
		return (double)(a/b);
		
	}
	Fraction plus(Fraction r){
		Fraction f = new Fraction(0, 1); //?
		f.a = a*r.b+r.a*b;
		f.b = b*r.b;
		return f;
	}
	Fraction multiply(Fraction r){
		Fraction f = new Fraction(0, 1); //?
		f.a = a*r.a;
		f.b = b*r.b;
		return f;
	}
	void print(){
		for(int i=2;i<=Math.min(a,b);i++){
			if(a%i==0 && b%i==0){
				a/=i;
				b/=i;
			}
		}
		if(a==b){
			System.out.println(1);
		}
		else{
			System.out.println(a+"/"+b);
		}
		
	}
}
