package Algorithm;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Zero_one {
	
	public void findproducts(int[][] arr){
		int j = this.packageweight;  
		for(int i = this.productnum; i > 0; i--){
		    if(arr[i][j] > arr[i-1][j]){
		        System.out.print(i+"  ");//输出选中的物品的编号
		        j = j - this.weights.get(i-1);
		        if(j < 0){
		        	break;
		        }
		    }
		}
	}
}