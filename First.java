public interface First{
	void blank();
	void space();
	void show();

}

class Second implements First{
	public void show(){
		system.out.println("implementation of show method");
	}

	public void blank (){
	System.out.println("hello blank");
	}

	public void space(){
	System.out.println("hello space");

}
	public static void main(String [] args){
	Second obj = new Second ();
	obj.space();
	obj.blank();
}

} 