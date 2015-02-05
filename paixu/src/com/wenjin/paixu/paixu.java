package com.wenjin.paixu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class paixu {
	public static void main(String[] args) {
		int array[] = { 5, 6, 8, 9, 4, 7, 0, 2, 3, 1 };
		Fangfa fangfa = new Fangfa();
		// 冒泡排序
		// fangfa.bubbleSort(array);
		// 二分排序
		// fangfa.sort(array);
		// 选择排序
		// fangfa.xuanze(array);
		// Josephusroll
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("请输入总人数：");
		 int totalNum = scanner.nextInt();
		 System.out.print("请输入报数的大小：");
		 int cycleNum = scanner.nextInt();
		 fangfa.josephus(totalNum, cycleNum);
//		fangfa.feibonaqie();
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}

	}

	static class Fangfa {
		//冒泡排序
		public void bubbleSort(int[] array) {
			int temp;
			for (int i = 0; i < array.length; i++) {// 趟数
				for (int j = 0; j < array.length - i - 1; j++) {// 比较次数
					if (array[j] > array[j + 1]) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
		}
		//二分排序
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
		//选择排序
		public void xuanze(int[] a) {
			for (int i = 0; i < a.length; i++) {
				int min = a[i];
				int n = i; // 最小数的索引
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] < min) { // 找出最小的数
						min = a[j];
						n = j;
					}
				}
				a[n] = a[i];
				a[i] = min;
			}
		}
		//约瑟夫环
		public void josephus(int totalNum, int countNum) {
			// 初始化人数
			List<Integer> start = new ArrayList<Integer>();
			for (int i = 1; i <= totalNum; i++) {
				start.add(i);
			}
			// 从第K个开始计数
			int k = 0;
			System.out.println(start.size());
			while (start.size() > 0) {
				k = k + countNum;
				// 第m人的索引位置
				k = k % (start.size()) - 1;
				// 判断是否到队尾
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
		//斐波那契
		public void feibonaqie() {
			int a = 1, b = 1, c = 0;
			System.out.println("斐波那契数列前20项为：");
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
