package com.sh.git;
/**
 * 되돌리기
 * - revert : 지정한 커밋의 작업내용을 취소한 버전으로 새로운 커밋으로 만든다 (conflict 발생가능)
 * 
 * - reset : 지정한 커밋으로 돌아간다.
 * 	- hard : 지정 커밋 이후 변경사항 버림
 * 	- mixed : 지정 커밋 이후 변경사항을 ubstaging area 보관. 재추가후 커밋 가능
 * 	- soft : 지정커밋 이후 변경사항을 staging area 보관. 즉시 커밋가능
 * 
 *
 */
public class Main {
	
	public void master() {
		System.out.println("master!!");
	}

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Hello git");
	}
	
	public void freture() {
		System.out.println("maaaaaaaaaaaaaster!!!");
		System.out.println("feeeeeeeeeeeeeeeeeeeeeature!");
	}

}
