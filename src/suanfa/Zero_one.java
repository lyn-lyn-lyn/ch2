package suanfa;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Zero_one {
	public int packageweight;//������������
	public int productnum;//��Ʒ����
	public ArrayList<Integer> weights;//ÿ����Ʒ������
	public ArrayList<Integer> values;//ÿ����Ʒ�ļ�ֵ
	
	public static void main(String[] args) throws Exception {
		Zero_one zero_one = new Zero_one();
		while(true){
			zero_one.readdata();// ��ȡ�����ļ�������
			int[][] m = zero_one.initpkdata();//
			int[][] res = zero_one.result(m);
			System.out.print("����������:");
			System.out.println(zero_one.packageweight);
			System.out.println("��Ʒ������"+zero_one.productnum);
			System.out.println("��Ʒ��������ֵ��Ӧ��ϵ��");
			for(int i = 0; i < zero_one.weights.size(); i++){
				System.out.print(zero_one.weights.get(i)+" ");
			}
			System.out.println();
			for(int i = 0; i < zero_one.values.size(); i++){
				System.out.print(zero_one.values.get(i)+" ");
			}
			System.out.println();
			System.out.println("           ");
			System.out.println("������:");
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[i].length; j++) {
					System.out.print(res[i][j]+"    ");
				}
				System.out.println();
			}
			System.out.println("           ");
			System.out.println("��ʱ����������ֵ�ܺ�Ϊ��"+res[zero_one.productnum][zero_one.packageweight]);
			System.out.print("װ�뱳������Ʒ���Ϊ��");
			zero_one.findproducts(res);
			System.out.println();
			System.out.println("           ");
		}
	}
	 
	public void readdata() throws Exception{//��ȡ��������
		System.out.println("���������ݱ�ţ�1~5����");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		BufferedReader br = new BufferedReader(new FileReader("D:/Program Files (x86)/MyStudy/src/Zero_one_Package/input/input_assign02_0" + num + ".dat"));
		String string = br.readLine();
		this.packageweight = Integer.parseInt(string.split(" ")[0]);
		this.productnum = Integer.parseInt(string.split(" ")[1]);
		String weight = br.readLine();
		this.weights = new ArrayList <Integer>();
		for (int i = 0; i < this.productnum; i++) {
			this.weights.add(Integer.parseInt(weight.split(" ")[i]));
		}
		
		String value = br.readLine();
		this.values = new ArrayList <Integer>();
		for (int i = 0; i < this.productnum; i++) {
			this.values.add(Integer.parseInt(value.split(" ")[i]));
		}
	}
	
	/**
	 * ��ʼ������
	 * m[i][0] = 0 :��ʾ��������Ϊ0������װ��������˼�ֵȫΪ0
	 * m[0][j] = 0 :��ʾû�п���װ����Ʒ����˼�ֵΪ0
	 */
	public int[][] initpkdata(){
		int[][] m = new int[this.productnum+1][this.packageweight+1];
		for(int i = 0; i <= this.productnum; i++){
			m[i][0] = 0;
		}
		for(int j = 0; j <= this.packageweight; j++){
			m[0][j] = 0;
		}
		return m;
	}
	
	public int[][] result(int[][] arr){
		for(int i = 1; i <= this.productnum; i++){
			for(int j = 1; j <= this.packageweight; j++){
				// ����i����Ʒ�������ڵ�ǰ�������� ��Ų���ȥ
				// ���Ե�ǰ����������ֵ����ǰi-1����Ʒ�ļ�ֵ
				if(this.weights.get(i-1) > j){
					arr[i][j] = arr[i-1][j];
				}
				/*����i����Ʒ�ܷŽ�ȥʱ
				1 ������Ʒ����ֵΪ��arr[i-1][j-(int)this.weights.get(i-1)] + (int)this.values.get(i-1)
				2��������Ʒ����ֵΪǰi-1����Ʒ��ֵ�ͣ�arr[i][j] = arr[i-1][j];
				��ʱ����ֵΪ�������ַ���������һ��
				*/
				else{
					if(arr[i-1][j] < arr[i-1][j-this.weights.get(i-1)] + this.values.get(i-1)){
						arr[i][j] = arr[i-1][j-this.weights.get(i-1)] + this.values.get(i-1);
					}
					else{
						arr[i][j] = arr[i-1][j];
					}
				}
			}
		}
		return arr;
	}
	
	public void findproducts(int[][] arr){
		int j = this.packageweight;  
		for(int i = this.productnum; i > 0; i--){
		    if(arr[i][j] > arr[i-1][j]){
		        System.out.print(i+"  ");//���ѡ�е���Ʒ�ı��
		        j = j - this.weights.get(i-1);
		        if(j < 0){
		        	break;
		        }
		    }
		}
	}
}