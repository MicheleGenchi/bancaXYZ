package model;

public class Main {
// progetto su github
	public static void main(String[] args) {
		Common c=null;
		Preferred p=null;
		for (int i=1; i<=3; i++) {
			System.out.println(i);
			c=new Common();
			p=new Preferred();
			c.setSimbolo("aaa");
			p.setSimbolo("bbb");
			c.setAmount(2+i);
			System.out.printf("Common %s\t",c.getSimbolo());
			System.out.printf("Yield = %s\n",c.yield(2));

			p.setAmount(2+i);
			p.setFixed(5);
			p.setParValue(2.5d);
			System.out.printf("Preferred %s\t",p.getSimbolo());
			System.out.printf("Yield = %s\n",p.yield(3));
			System.out.println("------------------------------------------");
		}
	}

}
