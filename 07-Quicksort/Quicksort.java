import java.util.ArrayList;

public class Quicksort{
    
     public static ArrayList<Integer> qsort(ArrayList<Integer> a){
	//System.out.println(a.size());
	if (a.size() < 1){
	    return a;
	}

	int pI = (int)(Math.random() * a.size());
	//System.out.print(pI);
	int pV = a.get(pI);
	//System.out.println( " : " + pV);

	ArrayList<Integer> upper = new ArrayList<Integer>();
	ArrayList<Integer> pivot = new ArrayList<Integer>();
	ArrayList<Integer> lower = new ArrayList<Integer>();
	
	for(int n: a){
	    if (n>pV)
		upper.add(n);
	    else if (n == pV)
		pivot.add(n);
	    else
		lower.add(n);
	}

	ArrayList<Integer> ans = qsort(lower);
	ans.addAll(pivot);
	ans.addAll(qsort(upper));

	return ans;
		
    }
    
    public static String pt(ArrayList<Integer> a){
	String ans = "";
	for (int n: a){
	    ans += (n + " ");
	}
	return ans;
	
    }

    public static void main(String[] args){
	ArrayList<Integer> ar = new ArrayList<Integer>();
	for (int i = 0; i<100; i++){
	    ar.add((int)(Math.random() * 100));
	}
	System.out.println(pt(ar));
	System.out.println(pt(qsort(ar)));
    }
    
}