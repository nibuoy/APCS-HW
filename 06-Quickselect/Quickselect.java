import java.util.ArrayList;

public class Quickselect{
    public static int qselect(int[] a, int k, int min, int max){

	if (min >= max){
	    return a[min];
	}
	System.out.println (min + " --> " + max);	
	int pI = (int)(Math.random() * (max-min)) + min;
	int pV = a[pI];

	System.out.println(pI + " : " + pV);

	ArrayList<Integer> lower = new ArrayList<Integer>();
	ArrayList<Integer> higher = new ArrayList<Integer>();

	for (int i = min; i <= max; i++){
	    if (a[i] < pV){
		lower.add(a[i]);
	    }else{
		higher.add(a[i]);
	    }
	    
	}
	
	if (min + lower.size() == k){
	    return a[k];
	}
	
	for (int i = 0; i < lower.size(); i++){
	    a[min + i] = lower.get(i);
	}
	for (int i = 0; i < higher.size(); i++){
	    a[min + i + lower.size()] = higher.get(i);
	}
	
	if (k < min + lower.size())
	    return qselect(a,k,min,min + lower.size() - 1);
	else
	    return qselect(a,k,min + lower.size() + 1,max);

    }

    public static void main(String[] args){
	int[] ar = {3,1,2,4,6,5};

	System.out.println(qselect(ar,3,0,5));
    }
    
    
}