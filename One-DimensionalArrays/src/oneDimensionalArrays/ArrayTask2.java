/* После заполнения массива прибавить к каждому третьему элементу число,
 *  которое находится в левом соседнем элементе.
 *  Определить сколько в массиве пар одинаковых элементов подряд
 *   и во всем массиве,не учитывая порядок расположения.
 */
package oneDimensionalArrays;

public class ArrayTask2 {

	public static void main(String[] args) {
		int N=20;
		int[] arr=new int[N];
		for(int i=0;i<N;i++){
			arr[i]=(int) (Math.random()*21)-10;
		}
		System.out.println("The original array:");
		for(int i=0;i<N;i++){
			System.out.print(arr[i]+" ");
		}
		
		int countOfSameElemInSequence=0;
		for(int j=0;j<N-1;j++){
			if(arr[j]==arr[j+1]){
				countOfSameElemInSequence++;
				j++;
			}
		}
		System.out.println('\n'+
				"The count of pairs of identical elements in the sequence is "+countOfSameElemInSequence);
		
		int[] countOfSameElem=new int[N];
		for(int p=0;p<N;p++){
			int count=0;
			for(int j=0;j<N;j++){
				if(arr[p]==arr[j]){
					count++;
					countOfSameElem[p]=count;
					if(count>1){
						countOfSameElem[j]=0;
					}	
				}
			}
		}
		System.out.println("The count of all elements in the original array without repetition:");
		for(int i=0;i<N;i++){
			if(countOfSameElem[i]==0) continue;
			System.out.println("number "+arr[i]+" is repeated "+countOfSameElem[i]+" times");
		}
		
		int numberOfPairs=0;
		for(int i=0;i<N;i++){
			if(countOfSameElem[i]>1) numberOfPairs+=countOfSameElem[i]/2;
		}
		System.out.println("The number of pairs of identical elements in the array is "+numberOfPairs);
		
		int k=3;
		for(int i=k-1;i<N;i+=k){
			arr[i]+=arr[i-1];
		}
		System.out.println("\nAfter addition of a third number to the next number on the left:");
		for(int i=0;i<N;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
