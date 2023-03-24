package com.finalproject;

public interface CRUDInterface {
	// 전체조회
	void selectFile(String fileName);
	// 검색
	boolean selectOneMember(String name, String role);
	// 수정
	void updateFile(String fileName);
	// 삭제
	void deleteFile(String fileName, String backupName);
	// 등록
	void registerFile(String fileName);
}
