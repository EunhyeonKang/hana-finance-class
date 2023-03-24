package com.finalproject;

import java.io.IOException;
import java.util.Scanner;

public class UI {
	private Scanner sc;
	private CRUDInterface crud;
	private boolean select;
	private String[] menus;

	public UI() {
		sc = new Scanner(System.in);
		crud = new FileIO();
		select = true;
		menus = new String[] { "조회", "등록", "수정", "삭제" };
	}

	// 초기 메뉴
	public void initMenu() throws IOException {
		while (select) {
			System.out.println("=======도서 대출 관리 프로그램=======");
			System.out.println("\t**회원가입부터 하세요**\t");
			System.out.println("1. 관리자로그인\t2. 회원로그인\t3. 회원가입\t4. 종료");
			System.out.print("번호로 입력해주세요 -> ");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				loginMenu("관리자");
				break;
			case 2:
				loginMenu("회원");
				break;
			case 3:
				crud.registerFile("member");
			default:
				System.out.println("잘못 입력했습니다.");
			}
			if (select == false) {
				break;
			}
			System.out.println("메뉴로 이동하시겠습니까? 1.yes 2.no");
			if (sc.nextInt() == 1) {
				select = true;
			} else {
				select = false;
				break;
			}
		}
	}

	// 로그인 메뉴
	private void loginMenu(String role) throws IOException {
		System.out.println("=======로그인=======");
		String name = sc.next();
		if (crud.selectOneMember(name, role)) {
			System.out.println("로그인을 성공했습니다");
			if (role.equals("관리자")) {
				managerMenu();
			} else {
				bookMenu();
			}
		} else {
			System.out.println(name + "이라는 "+role+"은(는) 없습니다.");
			initMenu();
		}

		// 로긴성공하면 관리자 메뉴로 이동하고
		// 실패하면 초기화면
	}

	// 도서 메뉴
	private void bookMenu() throws IOException {
		while (select) {
			System.out.println("=======관리자 프로그램=======");
			System.out.println("0. 뒤로\t 1. 나의대출내역\t 2. 대출가능도서\t3. 종료");
			System.out.print("번호로 입력해주세요 -> ");
			int input = sc.nextInt();
			switch (input) {
			case 0:
				initMenu();
				break;
			case 1:

				break;
			case 2:

				break;
			case 3:
				select = false;
				break;
			default:
				System.out.println("잘못 입력했습니다.");

			}
			if (select == false) {
				break;
			}
			System.out.println("메뉴로 이동하시겠습니까? 1.yes 2.no");
			if (sc.nextInt() == 1) {
				select = true;
			} else {
				select = false;
				break;
			}
		}
	}

	// 관리자 메뉴
	public void managerMenu() throws IOException {
		while (select) {
			System.out.println("=======관리자 프로그램=======");
			System.out.println("0. 뒤로\t 1. 회원관리\t2. 도서관리\t3. 종료");
			System.out.print("번호로 입력해주세요 -> ");
			int input = sc.nextInt();
			switch (input) {
			case 0:
				initMenu();
				break;
			case 1:
				totalMenu("member");
				break;
			case 2:
				totalMenu("book");
				break;
			case 3:
				select = false;
				break;
			default:
				System.out.println("잘못 입력했습니다.");

			}
			if (select == false) {
				break;
			}
			System.out.println("메뉴로 이동하시겠습니까? 1.yes 2.no");
			if (sc.nextInt() == 1) {
				select = true;
			} else {
				select = false;
				break;
			}
		}
	}

	// 회원/도서 CRUD
	private void totalMenu(String role) throws IOException {
		System.out.println("=======" + role + "Menu=======");
		while (select) {
			System.out.print("0. 뒤로 \t");
			for (int i = 0; i < menus.length; i++) {
				System.out.print((i + 1) + ". " + role + menus[i] + "\t");
			}
			System.out.println("5. 삭제취소");
			System.out.print("번호로 입력해주세요 -> ");
			int input = sc.nextInt();
			switch (input) {
			// 뒤로
			case 0:
				managerMenu();
				break;
			// 조회
			case 1:
				crud.selectFile(role);
				break;
			// 등록
			case 2:
				crud.registerFile(role);
				break;
			// 수정
			case 3:
				crud.updateFile(role);
				break;
			// 삭제
			case 4:
				crud.deleteFile(role, "backup_" + role);
				break;
			// 삭제 취소
			case 5:
				System.out.println("삭제를 취소했습니다");

				break;
			default:
				System.out.println("잘못 입력했습니다.");

			}
			System.out.println(menus[input - 1] + "을(를) 성공했습니다");
			if (select == false) {
				break;
			}
			System.out.println("메뉴로 이동하시겠습니까? 1.yes 2.no");
			if (sc.nextInt() == 1) {
				select = true;
			} else {
				select = false;
				break;
			}

		}

	}

	static void print(String header) {
		System.out.println(header + "를 입력하세요");
	}
}