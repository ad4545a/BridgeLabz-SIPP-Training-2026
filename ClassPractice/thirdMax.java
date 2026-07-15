import java.util.Scanner;

public class thirdMax {
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int max =  Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		for(int i:arr){
			if(max<i){	
				max3 = max2;
				max2 = max;
				max = i;}
			else if(max2<i){
				max3 = max2;
				max2=i;
			else if(max3<i){
				max3 = i;
				}
			}
        }
        System.out.println(max3);
    }
}
