public class MyStack {
    private double[] data; 
    private int next;

    public MyStack(){
	data = new double[10];
	next = 0;
    }

    public void push(double s){
	if(next == data.length){
	    grow();
	}
	data[next] = s;
	next++;
    }

    public double pop() {
	double s = data[next - 1];
	next--;
	return s;
    }

    public void grow(){
	double[] temp = new double[2 * data.length];
	for (int i = 0; i < data.length; i++){
	    temp[i] = data[i];
	}
	data = temp;
    }

    public double peek() {
	return data[next - 1];
    }

    public int size() {
	return next;
    }
    
    public boolean isEmpty() {
	return next == 0;
    }
    public String toString() {
	String s = "";
	for (int i = 0; i < next; i++){
	    s += (data[i] + ", ");
	}
	return s;
    }

    public static void main(String[] args){
	MyStack a = new MyStack();
	/**	a.push("a");
	a.push("b");
	a.push("c");
	a.push("d");
	a.push("e");
	a.push("f");
	a.push("g");
	System.out.println(a);
	a.pop();
	System.out.println(a);
	System.out.println(a.peek());
	a.peek();
	System.out.println(a);
	**/
	}


}