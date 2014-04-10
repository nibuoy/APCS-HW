//Youbin Kim and Vincent Wong

public class DoubleLL2<E> {
    private class Node<E>{
	E data;
	Node<E> next,prev;
	public Node(E d){
	    this.data = d;
	}
	
	public String toString(){
	    return "" + data;
	}

	public void setData(E d) {data = d;}
	public E getData() {return data;};
	
	public void setNext(Node<E> n){ next = n;}
	public Node<E> getNext(){return next;}
	
	public void setPrev(Node<E> p) {prev = p;}
	public Node<E> getPrev(){return prev;}
    }
    
    private Node<E> current;
    
    public void insert (E d){
	Node<E> n = new Node<E>(d);
	if (current == null){
	    current = n;
	    current.next = n;
	    current.prev = n;
	}else{
	    //System.out.println("n: " + n + ", current: " + current);
	    n.prev = current;
	    n.next = current.next;
	    current.next.setPrev(n);	
	    current.next = n;	    
	    
	    current = n;
	    //System.out.println( "current: " + current);
	}
    }

    public E getCurrent(){
	return current.getData();
    }

    public void forward(){
	if (current.getNext() != null)
	    current = current.getNext();
    }

    public void back(){
	if (current.getPrev() != null)
	    current = current.getPrev();
    }
	
    public String toString(){
	if (current == null)
	    return "";
	
	Node<E> tmp = current.getNext();
	String s = "";
	while (tmp != current){
	    s= s + tmp.getData() + ",";
	    tmp = tmp.getNext();
	}
	s+= current;
	
	return s;
    }
    
    public static void main(String[] args){
	DoubleLL2<String> L = new DoubleLL2<String>();
	System.out.println(L);
	L.insert("hello");
	System.out.println(L);
	L.insert("world");
	System.out.println(L);
	L.insert("three");
	System.out.println(L);
	
	System.out.println(L.getCurrent());
	L.back();
	L.back();
	System.out.println(L.getCurrent());
	L.insert("inserted");
	System.out.println(L);
	
	
    }
    
    
}