package com.yqb.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeMatchTest {
	public static void fun1(String str) {
		for (int i = 1; i < Math.pow(2, str.length()); i++) {
			int a = i;
			String ziji = "";
			for (int j = str.length() - 1; j >= 0; j--) {
				if ((a % 2) != 0)
					ziji = str.charAt(j) + ziji; // 利用十进制转换为二进制的算法，求最后几位二进制
				a = a / 2;
			}
			System.out.println(i + "  " + ziji);
		}
	}

	public static void fun2(String str) {
		for (int i = 1; i < Math.pow(2, str.length()); i++) {
			String ziji = "";
			String binary = Integer.toBinaryString(i); // 借助Java自带的方法，将一个整数转换为2进制形式，转换后最高位为1
			for (int j = binary.length() - 1; j >= 0; j--) {
				if (binary.charAt(j) != '0')
					ziji = str.charAt(j + str.length() - binary.length()) + ziji;

			}
			System.out.println(i + "  " + ziji);
		}
	}

	public static void fun3(List<Integer> intList) {
		String ziji = "";
		String binary = null;
		for (int i = 1; i < Math.pow(2, intList.size()); i++) {
			ziji = "";
			binary = Integer.toBinaryString(i); // 借助Java自带的方法，将一个整数转换为2进制形式，转换后最高位为1
			for (int j = binary.length() - 1; j >= 0; j--) {
				if (binary.charAt(j) != '0')
					ziji = intList.get(j + intList.size() - binary.length()) + "-" + ziji;

			}
			System.out.println(i + "  " + ziji);
		}
	}

	public static void fun4(List<Integer> intList) {
		List<Integer> ziji = new ArrayList<Integer>();
		String binary = null;
		for (int i = 1; i < Math.pow(2, intList.size()); i++) {
			ziji.clear();
			binary = Integer.toBinaryString(i); // 借助Java自带的方法，将一个整数转换为2进制形式，转换后最高位为1
			for (int j = binary.length() - 1; j >= 0; j--) {
				if (binary.charAt(j) != '0')
					ziji.add(intList.get(j + intList.size() - binary.length()));

			}
			System.out.println(i + "  " + ziji);
		}
	}

	public static void main(String[] args) {
        // TODO 自动生成的方法存根
//        String str="ABC";
//        fun1(str);
//        System.out.println();
//        fun2(str);
    	
//    	fun4(targetList);
    	
    	long start = System.currentTimeMillis();
//    	List<Integer> targetIntList = new ArrayList<Integer>(Arrays.asList(2804,5352,994,925,848,819,627,574,328,263,238,191,124,118,114,106,100,98,97,84,82,78,78,66,64,64,64,60,58,54,50,50,48,48,48,44,43,41,40,40,38,38,33,33,31,31,30,30,30,28,28,27,26,26,26,24,24,24,23,22,22,20,20,20,20,20,20,20,20,20,20,20,20,19,18,18,18,18,18,17,17,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,15,15,15,15,14,14,14,14,14,14,13,13,13,13,13,13,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,11,11,11,11,11,11,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,9,9,9,9,9,9,9,9,9,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,7,7,7,7,7,7,7,7,7,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1));
    	List<Integer> targetIntList = new ArrayList<Integer>(Arrays.asList(2804,5352,994,925,848,819,627,574,328,263,238,191,124,118,114,106,100,98,97,84,82,78,78,66,64));
//    	List<Integer> targetIntList = new ArrayList<Integer>(Arrays.asList(2804,5352,994,925,848,819,627,574,720));
    	
    	System.out.println("targetIntList.size()=" + targetIntList.size());
    	
    	Collections.sort(targetIntList);
    	Collections.reverse(targetIntList);
    	System.out.println("intList=" + targetIntList.toString());
    	
    	Integer targetSumNumber = 7300;
    	
    	getSimpleMatchResult(targetIntList, targetSumNumber);
    	System.out.println("took "+ (System.currentTimeMillis() - start) + " ms");
    	
    	getAllMatchResult(targetIntList, targetSumNumber);
    	System.out.println("took "+ (System.currentTimeMillis() - start) + " ms");
    }

	public static List<Integer> removeDuplicateIntFromList(List<Integer> targetIntList) {
		List<Integer> targetList = new ArrayList<Integer>();
		for (Integer number : targetIntList) {
			if (targetList.contains(number)) {
				continue;
			} else {
				targetList.add(number);
			}
		}
		System.out.println("targetList.size()=" + targetList.size());
		return targetList;
	}

	public static List<Integer> getSimpleMatchResult(List<Integer> targetIntList, Integer targetSumNumber) {
		Integer diff = targetSumNumber;
		List<Integer> result = new ArrayList<Integer>();

		for (Integer temp : targetIntList) {
			if (temp == diff) {
				result.add(temp);
				break;
			}
			if (temp < diff) {
				result.add(temp);
				diff = diff - temp;
			}
		}

		System.out.println("sum(result)=" + sum(result));
		System.out.println("result=" + result.toString());

		return result;
	}

	public static void getAllMatchResult(List<Integer> intList, int totalTarget) {

		Integer maxNegative = null;
		Integer minPositive = null;
		Integer totalSum = null;
		Integer diff = null;
		Map<Integer, List<Integer>> sumListMap = new HashMap<Integer, List<Integer>>();

		List<Integer> tempCombination = new ArrayList<Integer>();
		String binary = null;
		for (int i = 1; i < Math.pow(2, intList.size()); i++) {
			tempCombination.clear();

			binary = Integer.toBinaryString(i); // 借助Java自带的方法，将一个整数转换为2进制形式，转换后最高位为1
			for (int j = binary.length() - 1; j >= 0; j--) {
				if (binary.charAt(j) != '0') {
					tempCombination.add(intList.get(j + intList.size() - binary.length()));
				}
			}

			totalSum = sum(tempCombination);
//			log.info("totalSum=" + totalSum + "---" + tempCombination.toString());

			diff = totalSum - totalTarget;

			if (diff == 0) {
				System.out.println(tempCombination + "=" + totalSum);
			}

			if (diff > 0) {
				if (minPositive == null) {
					minPositive = totalSum;
					sumListMap.put(minPositive, new ArrayList<Integer>(tempCombination));
				} else {
					if (minPositive > totalSum) {
						sumListMap.remove(minPositive);
						minPositive = totalSum;
						sumListMap.put(minPositive, new ArrayList<Integer>(tempCombination));
					}
				}
			}

			if (diff < 0) {
				if (maxNegative == null) {
					maxNegative = totalSum;
					sumListMap.put(maxNegative, new ArrayList<Integer>(tempCombination));
				} else {
					if (maxNegative < totalSum) {
						sumListMap.remove(maxNegative);
						maxNegative = totalSum;
						sumListMap.put(maxNegative, new ArrayList<Integer>(tempCombination));
					}
				}
			}
		}

		System.out.println("minPositive=" + minPositive);
		System.out.println(sumListMap.get(minPositive));

		System.out.println("maxNegative=" + maxNegative);
		System.out.println(sumListMap.get(maxNegative));
	}

	public static int sum(List<Integer> list) {
		return list.stream().mapToInt(e -> e).sum();
	}
}