public class MyLinkedList2{
    private Node head;

    public MyLinkedList2(){
	head = new Node(null);
    }
    
    public void add(String d){
	Node tmp = new Node(d);
	tmp.setNext(head);
	head = tmp;
    }

    public void add(int i, String s){
	Node tmp = new Node(s);
	Node insertpt = head;
	for(int k = 0; k < i - 1; k++){
	    insertpt = insertpt.getNext();
	}
	tmp.setNext(insertpt.getNext());
	insertpt.setNext(tmp);
    }
    
    public String get(int i){
	Node returnpt = head;
	for (int k = 0; k < i; k++){
	    returnpt = returnpt.getNext();
	}
	return returnpt.getData();
	
    }
    
    public String set(int i, String s){
	Node changept = head;
	for (int k = 0; k < i; k++){
	    changept = changept.getNext();
	}
	String tmp = changept.getData();
	changept.setData(s);
	return tmp;
    }

    public String remove(int i){
	Node nextpt = head;
	for (int k = 0; k < i; k++){
	    nextpt = nextpt.getNext();
	}
	
	Node removept = nextpt.getNext();

	nextpt.setNext(removept.getNext());

	return removept.getData();
    }
	
    public int find(String s){
	Node search = head;
	int index = 0;
	int max = this.length();
	for (int k = 0; k < max; k++){
	    if (search.getData().equals(s)){
		return index;
	    }
	    index++;
	    search = search.getNext();
	}
	
	return -1;
    }
    
    public int length(){
	Node front = head;
	int len = 0;
	while (front.getData() != null){
	    len++;
	    front = front.getNext();
	}
	return len;
    }
    
    public String toString(){
	Node front = head;
	String ans = "";
	while (front.getData() != null){
	    ans += front.getData();
	    front = front.getNext();
	}
	return ans;
    }


}