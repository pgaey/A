package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	// ����(Variable) : 
	// �޸�(RAM)�� DATA(VALUE)���� �����ϱ� ���� ����
	
	
	// ������ Ư¡ : 
	// 1. �ڵ���(Scope)�ȿ��� ����ǰ� ���ȴ�.
	// 2. �ڷ����� �����Ǿ���Ѵ�.
	
	// 3. ���������� ��� �ʱ�ȭ�� �ؾ߸� ����� �����ϴ�.
	// 4. �ĺ��ڸ� �ٿ��� ����Ѵ�.
	// 5. ũ�Ⱑ �������ִ�.
	// 6. ���������� ���� ���� �����ؼ� ���� ������ �� �ִ�.
	// 7. ������ �����ϴ�.
	// 8. �⺻�ڷ����� ��� stack�޸𸮿� ����ȴ�.
	// 9. �ʱ�ȭ�� �ѹ��� �����ϴ�.
	// 10. �ϳ��� ������������ �ϳ��� ���� ������ �����ϴ�.
	
	// 11. �������� �ּҰ��� �����Ѵ�.
	
	/*
	 * �迭 (Array) : �ϳ��� ������ �������� ���� ���� �� ����
	 * 				��, "���� �ڷ����� ����"�� ���� �� ������		��������
	 * 				=> �迭�� �� �ε����� ���� ���� ��� *** �ε����� '0'���� �����Ѵ�.
 	 * 
	 */
	
	public void method1() {
		
		// ���� �þ ������ ������ ���� ����ϰ� ����
		/*
		int num1 = 1;
		int num2 = 5;
		int num3= 11;
		int num4= 17;
		int num5= 20;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		int sum = 0;
		for(int i =1; i <= 5; i++) {
			// sum += numi;
		}
		sum = num1 + num2 + num3 + num4 + num5;
		*/
		// ������ 100����..? �� ������..?
		// �ذ� : �迭!
		
		
		// 1. �迭 ����
		
		/*
		 * ������ ���?
		 * �ڷ��� �����ĺ���;
		 * 
		 * �迭 �����!
		 * 1) �ڷ��� �迭�ĺ���[];
		 * 2) �ڷ���[] �迭�ĺ���;		=> �� ����� �ַ� ����� ��
		 */
		
		/*
		int num; // ���� ����!
		
		int nums[]; // 1�� ������� int�� �迭�� ����!		"int�� �迭" �̶�� �̸�
		
		int[] nums2; // 2�� ������� int�� �迭�� ����!		�迭�̶� ���� �ڿ� s�� ���̴� ���·� ���� ����.
		*/
		
		// 2. �迭 �Ҵ�
		
		/*
		 * �迭�� ��� ���� ���� �迭�� ũ�⸦ �����ִ� ���� . �ݵ�� ���� �����ؾ���
		 * ������ ������ŭ ���� �� ������ ������� 
		 * 
		 * [ ǥ����  ]
		 * int[] arr;
		 * arr = new int[S]; // �Ҵ�
		 * int[] arr2 = new int[5]; // ����� ���ÿ� �Ҵ�
		 * 
		 * �迭�� �������̴�!!!!
		 * ������ : new 			new�� ������ �������̶�� �����ϸ� ��
		 */
		
		int[] arr1;
		arr1 = new int[15];   //  arr1�� 15ĭ�� ������ ����
		
		int[] arr2 = new int[5];		// arr2�� 5ĭ ¥�� ������ ����
		
		
		// 3. �迭�� �� �ε����� �� ����
		
		/*
		 * [ ǥ����   ]
		 * �迭�ĺ���[�ε��� ��ȣ] = ��; // 0���� ����
		 */
		
		arr2[0] = 1;	//	int�� �迭�̱� ������ int�� ����
		arr2[1] = 5;
		arr2[2] = 7;
		arr2[3] = 9;
		arr2[4] = 17;
		
//		System.out.println(arr2[0]);
//		System.out.println(arr2[1]);
//		System.out.println(arr2[2]);
//		System.out.println(arr2[3]);
//		System.out.println(arr2[4]);
		
		// ������ ���̰� ����?
		
		int sum = 0;
		for(int i = 0; i < arr2.length; i++) {
			sum += arr2[i];
		}
		
		System.out.println(sum);
		// ���������� �迭�� ����ؼ� ���� �� �ִ� ���� ū ���� : �ݺ����� ��� ����
	}

	public void method2() {
		
		// String�� �迭
		// 1. �迭�� ����� �Ҵ�
		// names 27ĭ¥�� String[]
		
		String[] names = new String[27];
		
		// 2. �迭�� �ε����� ���� ����
		names[0] = "�迬��";
		names[1] = "��ä��";
		names[2] = "���·�";
		names[3] = "������";
		names[4] = "��ȣ��";
		names[5] = "��ȿ��";
		names[6] = "������";
		names[7] = "�缭��";
		names[8] = "�ڹμ�";
		names[9] = "���Ѽ�";
		names[10] = "�輱��";
		names[11] = "�ż���";
		names[12] = "������";
		names[13] = "������";
		names[14] = "������";
		names[15] = "������";
		names[16] = "������";
		names[17] = "������";
		names[18] = "�̱Ժ�";
		names[19] = "�̿���";
		names[20] = "������";
		names[21] = "������";
		names[22] = "���¿�";
		names[23] = "������";
		names[24] = "������";
		names[25] = "������";
		names[26] = "ȫ�غ�";
		
//		names[100] = "�̽�ö";		// ������ �ȶߴ� ���� : ���������δ� �°� ���. Ʋ���� ����~~
		
		// ArrayIndexOutOfBounds : 100 <= ����
		// �迭�� �ε��� ������ �����.
		// at com.kh.array.Array.method2(Array.java:163) <- �ε����� ������ ��� ��ġ!
		
		System.out.println("names�迭�� ���� : " + names.length); 	// names.length ���� 27��
					     	  /* 27 */
		for(int i = 0; i <= names.length; i++) {	//	i < names.length ��
			System.out.printf("�⼮��ȣ %d�� %s \n", i + 1, names[i]);		// ���������δ� �°� ���.
		}
	}
	
	public void method3() {
		
		// 1. ����ڷκ��� �Է��� ���� �迭�� ���� ���
		// �ټ�ĭ ¥�� ��Ʈ�� �迭 
		
		// �迭 ���� -> �迭�� ũ�� �Ҵ�
		
		int[] nums = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("������ �Է��ϼ���");
			nums[i] = sc.nextInt();
			System.out.println("nums��� �迭�� " + i + "�� ° �ε����� ���� �� : " + nums[i]);
			
		} // System.out.println(Arrays.toString(nums));
		
		// 2. �ش� �迭���� ���� ���� ��, �ּҰ��� ���ϴ� ����� ������
		
		int min = nums[0];				// 0 ���� ���� �Է��ϸ� ���� ���� ���� ������ ���� �� �־ ���� [0]�� ��
		
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] < min) {
				min = nums[i];
	    	} 
		}	
		System.out.println("�ּҰ� : " + min);
	}
	
	public void method4() {
		
		// 1. �迭 ���� + �Ҵ�
		int[] iArr = new int[3];	// 0, 1, 2				// new���� ���°� heap�޸𸮿� ��
		double[] dArr = new double[4];	// 0, 1, 2, 3
		
		System.out.println(iArr);
		System.out.println(dArr);
		
		
		// �迭�ĺ���.length : �迭�� ũ��(����) => ����
		System.out.println(iArr.length);		// iArr�ڿ� [ . ]�� ���������� or �������ٿ�����(������, ���۷���) ��� ��
		System.out.println(dArr.length);
		
		// int i	int[] iArr
		// double d double[] dArr
		
		/*
		int i;		
		double d;	// �������� => stack ������ �޸𸮰� ����
		
		i = 1;
		
		System.out.println(i);	
		System.out.println(d);	// ���� �ϰ� ���� ��� ����� �ȉ�	 =>	 ������ ����
		
		*/
		
		
//		iArr = 3; // �ּҰ� ����ִ� stack �޸𸮿� 3�� �ְڴٰ� ǥ���� ��
				  // �׷��� iArr[0] = 3; ��ó�� �ε����� �����ؾ���.
		
		
		System.out.println(iArr);
		System.out.println(dArr);		// heap�޸𸮿� �ö󰡸� ���� ���� ���� ��� �⺻ ���� �� ex) 0.0
										// ��� => 0.0
		
		
		/*
		 * �⺻�ڷ��� : boolean, char, byte, short, int, long, float, double
		 * => ���� ���� �ٷ� ���� �� ���� : �Ϲ� ����
		 * 
		 * �����ڷ��� : String, int[], double[], short[], float[]...
		 * => �ּ� ���� ��� �ִ� ���� : ���� ����(���۷��� ����)
		 * 
		 */
		
		// �����ڷ������� == (����� ��) �ּҰ��� ���ϱ� ������ ���ϴ� ����� ���� �� ����
		// ���ڿ�.equals("���ҹ��ڿ�");
		
		int[] iArr2 = new int[3];				// new�ϸ� heap �޸𸮿� ������ �����ȴٰ� �����ϸ� ��
		System.out.println(iArr == iArr2);
		
		System.out.println("iArr�� �ؽ��ڵ� �� : " + iArr.hashCode());	// hashCode (�ؽ��ڵ�) int�� : �ؽ��� ��(16����)�� 10������ �ٲ��ش�. 
		System.out.println("iArr2�� �ؽ��ڵ� �� : " + iArr2.hashCode());  // hashCode �� �ٸ��ٸ�   a! = b, ���ٰ� ������ ���� �ʴ�.
		System.out.println("dArr�� �ؽ��ڵ� �� : " + dArr.hashCode());
		// �ؽ��ڵ� : �ּҰ��� �������� ����(int��)���� ��Ÿ����
		
		// �ݺ���
		// 0�� �ε������� ������ �ε������� 1�� ������Ű�鼭 ���������� ���
		// ������ �ε��� == �迭�� ũ�� - 1
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
	}
	
	/*
	 * �迭�� �ƽ�����??
	 * 
	 * �� �� ������ �迭�� ũ�⸦ ���� �Ұ� !!!
	 */
	
	public void method5() {
		
		String[] sArr = new String[3];		//sArr�� heap �ּҿ� [3]�� ����� ����Ǿ�����  284 ->296��
		
		sArr[0] = "��";
	    sArr[1] = "��";
	    sArr[2] = "��";
	    
	    for(int i = 0; i < sArr.length; i++) {
	    	System.out.print(sArr[i]);
	    }
	    System.out.println("\nsArr�� �ؽ��ڵ� : " + sArr.hashCode());
	    
	    sArr = new String[5];				//sArr�� heap �ּҿ�  [5]�� ����
	    System.out.println("�׾��� ��Ƴ� sArr�� �ؽ��ڵ� : " + sArr.hashCode());		// hashCode�� ���� sArr[3] ������ sArr[5] ������ ����Ű�� ���� �ٲ�.
	    // �迭�� ũ�⸦ �����ϰ��� �Ѵٸ� ��¿ �� ���� �迭�� �ٽ� �������Ѵ�.
	    
	    for(int i = 0; i < sArr.length; i++) {			
	    	System.out.print(sArr[i]);
	    }
	    
	    /*
	     * ������ ���� ������ �迭��??
	     * heap������ �յ� ���ٴϴٰ� �����ð��� ������
	     * GC�� ���������ش�!! : �ڵ� �޸� ����        GC = Garbage Collection
	     * 
	     * �迭�� �׻� ������ �ּҰ��� �ο���
	     * ���� �迭�ĺ���(�̸�)�� �Ҵ縸 �ٽ��Ѵٸ�??
	     * => ������ �����ϰ� �ִ� ������ ����� ���ο� �迭�� �����
	     * => ���ο� ���� �����Ѵ�.
	     * 
	     * �ּҰ��� �ٸ��� �ٸ��迭�̴�!!!!
	     */
	    
	    // ���� ������� ���� �ʹ�.
	    sArr = null;  // null ��. ����. �ƹ��͵� �������� ������ �ǹ��ϴ� [��]
	    
	    
	    // sArr[0] = "����¼���";
	    
	    // NullPointerException
	    // ����Ű�� �ִ°� null�ε� �ּҰ� ���µ� ��� �����ҷ�?
	    // null�� ������?? ��� �����ҷ�??
	    
	    System.out.println("\n\n\n" + sArr);
	    
	    /*
	     * �⺻�ڷ��� �� ���� ���� ����
	     * 
	     * �����ڷ������� null�̶�� ������ �߰�!!! => �ּҰ��� �ֳ� ����
	     * 
	     * �⺻�ڷ��� �⺻����
	     * 
	     * int a = 0;
	     * double d = 0.0;
	     * char c= '';
	     * 
	     * �����ڷ����� �⺻���� => null(�ּҰ��� ����)
	     * 
	     * 
	     * int[] iArr = null;
	     * double[] dArr = null;
	     * 
	     * �ϴ� String�� ����
	     */
	    String str = new String();
	    
	    System.out.println(str); // String str�� ""�� �⺻ ������ ����ִ� ��
	    
	    str = null;		// ������ String����  null ����
	    
	    System.out.println(str); 
	}

	
	public void method6() {
		
		// �迭 ���� �� �Ҵ�� ���ÿ� �ʱ�ȭ(����)���� �ѹ��� ������ ���
		
		/*
		 * arr[0] = 1;
		 * arr[1] = 2;
		 * arr[2] = 3;
		 * arr[3] = 5;
		 */
		
		int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 5;
		
		// ��� 1.
		int[] arr1 = new int[] {1, 2, 3, 5};
		
		// ��� 2.								<<== ���������� ���� ���� ��
		int[] arr2 = {1, 2, 3, 5};  
	}
	
	/*
	 * �迭 ����
	 * 
	 * 1. ���� ����		-> ���������� �� �߿�.
	 * 
	 * 
	 * 
	 * 
	 * 2. ���� ���� 
	 * 
	 * 
	 */
	
	// ���� ����
	public void method7() {
		
		int[] origin = {1, 2, 3, 4, 5};

		System.out.println("�����迭");
		for(int i = 0; i < origin.length; i ++) {
			System.out.print(origin[i] + " ");
		}
		
		
		// ���� ����
		int[] copy = origin;		// origin�� ������ �ִ� ���� copy�� ������ ��. origin ��(�ּ�)�� ABC���ٸ� copy���� ��(�ּ�) ABC�� ����.
		
		System.out.println("\n���纻�迭");
		for(int i = 0; i < copy.length; i ++) {
			System.out.print(copy[i] + " ");
		}
		
		origin[3] = 100;
		System.out.println("\n�����迭");
		for(int i = 0; i < origin.length; i ++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n���纻�迭");
		for(int i = 0; i < copy.length; i ++) {
			System.out.print(copy[i] + " ");
		}
		
		// �� �� �Ȱ���??
		
		System.out.println("\n���� �迭�� �ؽ��ڵ� : " + origin.hashCode());
		System.out.println("���纻 �迭�� �ؽ��ڵ� : " + copy.hashCode());
		
		// �������� => �迭�� �ּҰ��� �����ϱ� ������ ����Ű�� �ִ� �迭�� ����.
	}
	
	// 2. ���� ����
	public void method8() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// 1�ܰ�. �����ϰ��� �ϴ� ���� �迭�� ������ ũ���� �� �迭�� ���� �� �Ҵ�
		
		int[] copy = new int[origin.length];		// origin �迭 ���� �� �þ ���� �ֱ� ������ ����'5'�� ���⺸�� origin.length�� ����
		
		// 2�ܰ�.
		// 
		// copy[0] = origin[0]
		// copy[1] = origin[1]
		// copy[2] = origin[2]
		// copy[���� �ְ��� �ϴ� �ε���] = origin[���� �����ϰ��� �ϴ� �ε���]
		
		for(int i = 0; i < origin.length; i++) {		
			copy[i] = origin[i];
		}
		
		origin[2] = 99;
		System.out.println("\n���� �迭 ���");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n���纻 �迭 ���");					// ���� ���翡���� [�ּҸ� ����]�߱� ������ ���纻�� ���� ��������
		for(int i = 0; i < copy.length; i++) {				// ������ �ε����� ũ�⸸ ����.
			System.out.print(copy[i] + " ");
		}													
		
		System.out.println("\n���� �迭�� �ؽ��ڵ� : " + origin.hashCode());
		System.out.println("\n���� �迭�� �ؽ��ڵ� : " + copy.hashCode());
		
		// �ּҰ��� ������ ���� �ƴ϶� �����迭�� �ε����� �����ؼ� ���� ���� ���纻�迭�� �ε����� ������ ��.
	}
	
	// �������� 2. arraycopy() ȣ��
	public void method9() {
		
		// ���ο� �迭�� ������ ��
		// SystemŬ���������� arraycopy() ȣ��
		// �� �� �ε������� �� ���� ��� ��ġ���� �������� ���� ���� ����
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[10];
		
		/*
		 * [ ǥ����  ]
		 * 
		 * System.arraycopy(�����迭�ĺ���, �����迭���� ���縦 ������ �ε���, ���纻 �迭�ĺ���, ���纻 �迭���� ���簡 ���۵� �ε���, ������ ����);
		 */
		
		System.arraycopy(origin, 0, copy, 0, 5);
		System.arraycopy(origin, 0, copy, 3, 5);
//		System.arraycopy(origin, 0, copy, 9, 2);		// ArrayIndexOutOfBounds
		
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");		// heap�������� ������ ���� ����ְ� �ʱⰪ�� 0 ��
		}
	}
	
	// �������� 3. copyOf() ȣ��
	public void method10() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// ArraysŬ�������� �����ϴ� copyOf()
		// [ ǥ����  ]
		// ���纻 �迭 = Arrays.copyOf(�����迭�̸�, �����Ұ���);
		
		int[] copy = Arrays.copyOf(origin, 10);
		
		// ���� �迭���� ū ���� �����ϸ� ���纻�迭�� �� ������ ����
		
		System.out.println("���纻 �迭 ���");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		/*
		 * System.arraycopy()
		 * �� �� �ε������� ��� ��� ��ġ�� �ε����� ������ ������ ��� ��������
		 * 
		 * Arrays.copyOf()
		 * ������ �����迭�� 0�� �ε������� ���� (���� ������ ������ŭ)
		 * 
		 */
	}
	
	// �������� 4. clone()
	public void method11() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// int[] copy = origin; ��������
		
		// ��������	[ ǥ����  ] ���纻�迭�ĺ��� = �����迭�ĺ���.clone();  �ݺ����� �Ⱦ���.
		int[] copy = origin.clone();
		// �ε����� ���� X, ������ ���� X -> �����迭�� ������ �Ȱ��� ���� �����ؼ� ����
		
		// Arrays.toStiring(������ ����ϰ� ���� �迭�� �ĺ���);
		// toString => �̻ڰ� �� ���� ~~~
		// �迭�� ��Ҹ� �������
		// ex) [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(copy));
		
		
	}
	
	
	
	
	
	
	
	
}
