package basics;

import java.util.concurrent.SynchronousQueue;

public class Bedingungen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool_var;
		bool_var = false;
		//
		if (bool_var == false) {
			System.out.println("1 Bool Var ist falsch");
		}
		//
		if (bool_var = false) {
			System.out.println("2 Bool Var ist falsch");
		}
		//
		if (bool_var == true) {
			System.out.println("Bool Var ist wahr");
		}
		//
		if (!bool_var);
		System.out.println("Bool Var ist falsch");
		//
		if (!bool_var == false) {
			System.out.println("Bool Var ist wahr");
			}
		//
		if (bool_var != true) {
			System.out.println("Bool Var ist falsch");
			}
		//
		// wenn dann sonst
		if (bool_var) { 
		System.out.println("wahr");
		}
		else {
			System.out.println("falsch");
		}
		//
		//
		if (true && false && true) {
			System.out.println("nix");
			
		}
		//
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;
		//
		if (bool1 && bool2 && bool3) {
		System.out.println("alle 3 bools sind wahr");
		
		}
		// "&&" logisches UND
		// "||" logisches ODER
		if (bool1 || bool2 || bool3) {
			System.out.println("einer der drei bools ist wahr");
			}
		//
		//
		
		
		}
		
		
	}

