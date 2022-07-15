package com.gm.main;

public class Main {
	// test data set
	int[] nums = {1, 2, 3};
	
	// Stack.add -> {4, 1, 2, 3}
	// Stack.remove -> {2, 3}
	
	// Que.add -> {4, 1, 2, 3}
	// Que.remove -> {1, 2}
	
	// Set.add -> {1, 2, 3, 4}
	// Set.remove -> 1 선택 시 -> {2, 3}
	public static void main(String[] args) {
		// 1. com.gm.util.CollectionStack
		// 	 add - 새로운 숫자 추가 - 무조건 0번에 추가
		// 	 remove - 0번 인덱스 삭제
		
		// 2. com.gm.util.CollectionQue
		//	 add - 새로운 숫자 추가 - 무조건 0번에 추가
		//	 remove - 마지막 인덱스 번호 삭제
		
		// 3. com.gm.util.CollectionSet
		//	 add - 새로운 숫자 추가 - 마지막에 추가
		//		   단, 중복되지 않는 숫자만 추가
		//	 remove - 삭제할 숫자를 입력받아서 일치하는 숫자 삭제

	}

}
