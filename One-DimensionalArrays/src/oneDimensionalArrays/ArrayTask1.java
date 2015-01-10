/*Task1:
Given an array of dimension N, find the smallest and largest elements of the array
and outputs to the console (if several smallest elements - count them).
Change largest and smallest elements of the array locations. */

package oneDimensionalArrays;

public class ArrayTask1 {

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
		int min,max,indexOfMinElem=0,indexOfMaxElem=0;
		min=max=arr[0];
		for(int i=1;i<N;i++){
			if(min>arr[i]){
				min=arr[i];
				indexOfMinElem=i;
			}
			if(max<arr[i]){
				max=arr[i];
				indexOfMaxElem=i;
			}
		}
		arr[indexOfMinElem]=max;
		arr[indexOfMaxElem]=min;
		System.out.println('\n'+"After changes the positions of max and min elements:");
		for(int i=0;i<N;i++){
			System.out.print(arr[i]+" ");
		}
		int countOfMinElem=0,countOfMaxElem=0;
		for(int i=0;i<N;i++){
			if(min==arr[i])  countOfMinElem++;
			if(max==arr[i])  countOfMaxElem++;
		}
		System.out.println('\n'+"min="+min+" max="+max);
		System.out.println("The count of same min elements is "+countOfMinElem);
		System.out.println("The count of same max elements is "+countOfMaxElem);
		
	}
}
