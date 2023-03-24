package com.finalproject;

public interface CRUDInterface {
	// 전체조회
	void selectByFile(String fileName);
	// 검색
	boolean selectOneMember(String name, String role);
	// 수정
	void updateByFile(String fileName);
	// 삭제
	void deleteByFile(String fileName, String backupName);
	// 등록
	void registerByFile(String fileName);
}
