package Algorithm;
 
import java.util.Scanner;
 
public class BAG {
	public static void main(String args[]){
		int n,i,j;
		double C;
		System.out.println("�������ѡ�����Ʒ�ĸ�����");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		System.out.println("�����뱳��������");
		C = scanner.nextDouble();
		double[] a = new double[n];    //��Ʒ��������
		double[] b = new double[n];    //��Ʒ��ֵ����
		double[] x = new double[n];
		for(i = 0; i < n; i++){
			a[i] = Math.floor(Math.random()*20);
		}
		for(i = 0; i < n; i++){
			b[i] = Math.floor(Math.random()*20);
		}
		System.out.println("�����������Ʒ����Ϊ��");
		for(i = 0; i < n; i++){
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		System.out.println("�����������Ʒ��ֵΪ��");
		for(i = 0; i < n; i++){
			System.out.print(b[i]+"  ");
		}
		System.out.println();
		double value = Knapsack(a,b,x,C,n);
		System.out.println("����ֵΪ��"+value);
	}
	static void sort(double[] a, double[] b, int n){
		double[] c = new double[n];
		for(int i = 1; i < n; i++){
            c[i] = b[i]/a[i];
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < n-i; j++){
                if(c[j] < c[j+1]){
 
                    double temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
 
                    double temp2=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp2;
 
                    double temp3=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp3;
                }
            }
        }
    }
	static double Knapsack(double[] a, double[] b, double[] x, double C, int n){
		sort(a,b,n);
		int i;
		double total = 0;
		for (i = 0; i < n; i++) {
            if (a[i] <= C){//�������ʣ����������ڵ��ڵ�i�����������
            x[i] = 1;   //�ѵ�i����������װ������
            C = C - a[i];  //������ʣ�����������˵�i�����������
            }else {     
                break;  //�˳�ѭ��
            }
        }
        if (i < n){//�ж��Ƿ��n����������װ��ȥ��������,���i<=n��ʾ��
            x[i] = C/a[i];    
        }
        for(i = 0; i < n; i++){
        total = total+x[i]*b[i];
        }
        return total;
	}
}