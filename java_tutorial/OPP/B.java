package mypack;
import pack.*;

class B extends A{
	public static void main(String args[]){
		A obj = new A(); // Compile Time Error
		obj.msg(); // Compile Time Error
	}
}