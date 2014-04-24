import java.io.*;
import java.util.*;

public class RPNcalc{
    MyStack stack;
    Boolean running;

    public RPNcalc(){
	stack = new MyStack();
	running = true;
    }

    public void run(){
	Scanner scn = new Scanner(System.in);

	while(running){
	    String s = scn.nextLine();
	    
	    double a,b;
	    
	    try{
		if (s.equals("exit")){
		    running = false;
		}else if (s.equals("show")){
		    System.out.println(stack);
		}else if (s.equals("+")){
		    a = stack.pop();
		    b = stack.pop();
		    stack.push(a+b);
		    System.out.println(stack.peek());
		}else if (s.equals("-")){
		    a = stack.pop();
		    b = stack.pop();
		    stack.push(b-a);
		    System.out.println(stack.peek());
		}else if (s.equals("*")){
		    a = stack.pop();
		    b = stack.pop();
		    stack.push(a*b);
		    System.out.println(stack.peek());
		}else if (s.equals("/")){
		    a = stack.pop();
		    b = stack.pop();
		    stack.push(b/a);
		    System.out.println(stack.peek());
		}else{
		stack.push(Integer.parseInt(s));
		}
	    }catch(Exception E){
		System.out.println("Please input at least 2 numbers before using an operator");
	    }
	}
    }
    
    public static void main (String[] args){
	RPNcalc calc = new RPNcalc();
	calc.run();
    }
    
}