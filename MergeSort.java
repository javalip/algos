package practice1;

public class MergeSort {
	
	public  int[] sortedArrayMerge(int a[], int b[]) {
	    int result[] = new int[a.length +b.length];
	    int i =0; int j = 0;int k = 0;
	    while(i<a.length && j <b.length) {
	        if(a[i]<b[j]) {
	            result[k++] = a[i];
	            i++;
	        } else {
	            result[k++] = b[j];
	            j++;
	        }
	    }
	    System.arraycopy(a, i, result, k, (a.length -i));
	    System.arraycopy(b, j, result, k, (b.length -j));
	    return result;
	}
	
	
	public static void main(String args[]){
		MergeSort mergeSort = new MergeSort();
			int[] l1 =  {1,2,3,4};
			int[] l2 =  {6,7,8,9};
			mergeSort.sortedArrayMerge(l1,l2);
			
		
		
	}

}

