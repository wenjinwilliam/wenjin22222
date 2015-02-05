package com.wenjin.paixu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class paixu {
	public static void main(String[] args) {
		int array[] = { 5, 6, 8, 9, 4, 7, 0, 2, 3, 1 };
		Fangfa fangfa = new Fangfa();
		// ð������
		// fangfa.bubbleSort(array);
		// ��������
		// fangfa.sort(array);
		// ѡ������
		// fangfa.xuanze(array);
		// Josephusroll
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("��������������");
		 int totalNum = scanner.nextInt();
		 System.out.print("�����뱨���Ĵ�С��");
		 int cycleNum = scanner.nextInt();
		 fangfa.josephus(totalNum, cycleNum);
//		fangfa.feibonaqie();
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}

	}

	static class Fangfa {
		//ð������
		public void bubbleSort(int[] array) {
			int temp;
			for (int i = 0; i < array.length; i++) {// ����
				for (int j = 0; j < array.length - i - 1; j++) {// �Ƚϴ���
					if (array[j] > array[j + 1]) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
		}
		//��������
		public void sort(int[] a) {
			for (int i = 0; i < a.length; i++) {
				int temp = a[i];
				int left = 0;
				int right = i - 1;
				int mid = 0;
				while (left <= right) {
					mid = (left + right) / 2;
					if (temp < a[mid]) {
						right = mid - 1;
					} else {
						left = mid + 1;
					}
				}
				for (int j = i - 1; j >= left; j--) {
					a[j + 1] = a[j];
				}
				if (left != i) {
					a[left] = temp;
				}
			}
		}
		//ѡ������
		public void xuanze(int[] a) {
			for (int i = 0; i < a.length; i++) {
				int min = a[i];
				int n = i; // ��С��������
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] < min) { // �ҳ���С����
						min = a[j];
						n = j;
					}
				}
				a[n] = a[i];
				a[i] = min;
			}
		}
		//Լɪ��
		public void josephus(int totalNum, int countNum) {
			// ��ʼ������
			List<Integer> start = new ArrayList<Integer>();
			for (int i = 1; i <= totalNum; i++) {
				start.add(i);
			}
			// �ӵ�K����ʼ����
			int k = 0;
			System.out.println(start.size());
			while (start.size() > 0) {
				k = k + countNum;
				// ��m�˵�����λ��
				k = k % (start.size()) - 1;
				// �ж��Ƿ񵽶�β
				if (k < 0) {
					System.out.println(start.get(start.size() - 1));
					start.remove(start.size() - 1);
					k = 0;
				} else {
					System.out.println(start.get(k));
					start.remove(k);
				}
			}
		}
		//쳲�����
		public void feibonaqie() {
			int a = 1, b = 1, c = 0;
			System.out.println("쳲���������ǰ20��Ϊ��");
			System.out.print(a + "\t" + b + "\t");
			for (int i = 1; i <= 10; i++) {
				c = a + b;
				a = b;
				b = c;
				System.out.print(c + "\t");
				
			}
		}

	}
}
