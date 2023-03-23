package com.finalproject;

import java.io.IOException;
import java.util.Scanner;

public class UI {
    private Scanner sc;
    private Member member;
    private Book book;
    private Management management;
    private boolean select;

    public UI() {
        sc = new Scanner(System.in);
        management = new Management();
        member = new Member();
        book = new Book();
        select = true;
    }

    // 초기 메뉴
    public void initMenu() throws IOException {
        while (select) {
            System.out.println("=======도서 대출 관리 프로그램=======");
            System.out.println("1. 관리자로그인\t2. 회원로그인\t3. 회원가입\t4. 종료");
            System.out.print("번호로 입력해주세요 -> ");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    managerMenu();
                    break;
                case 2:
                    // bookMenu();
                    break;
                case 3:
                    management.registerMember();
                default:
                    select = false;
                    return;
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

    private void loginMenu() {
        // 구분이 관리자면 관리자 메뉴로 이동
        // 구분이 회원이라 사용자 메뉴로 이동
    }

    // 관리자 메뉴
    public void managerMenu() {
        while (select) {
            System.out.println("=======관리자 프로그램=======");
            System.out.println("1. 회원관리\t2. 도서관리\t3. 종료");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    memberMenu();
                    break;
                case 2:
                    bookMenu();
                    break;
                case 3:
                    break;
                default:
                    select = false;
                    break;
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

    // 회원 메뉴
    private void memberMenu() {
        while (select) {
            System.out.println("0. 뒤로 \t1. 회원조회\t2. 회원등록\t3. 회원수정\t4. 회원삭제\t5. 삭제취소");
            int input = sc.nextInt();
            switch (input) {
                // 뒤로
                case 0:
                    break;
                // 조회
                case 1:
                    System.out.println("회원조회");
                    member.selectMember();
                    break;
                // 등록
                case 2:
                    System.out.println("회원등록");
                    management.registerMember();
                    break;
                // 수정
                case 3:
                    System.out.println("회원수정");
                    member.updateMember();
                    break;
                // 삭제
                case 4:
                    System.out.println("회원삭제");
                    member.deleteMember();
                    break;
                // 삭제 취소
                case 5:
                    System.out.println("삭제취소");

                    break;
                default:
                    select = false;
                    break;
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

    private void bookMenu() {
        while (select) {
            System.out.println("0. 뒤로 \t1. 도서조회\t2. 도서등록\t3. 도서수정\t4. 도서삭제\t5. 삭제취소");
            int input = sc.nextInt();
            switch (input) {
                // 뒤로
                case 0:
                    break;
                // 조회
                case 1:
                    System.out.println("회원조회");
                    book.selectBook();
                    break;
                // 등록
                case 2:
                    System.out.println("회원등록");
                    book.insertBook();
                    break;
                // 수정
                case 3:
                    System.out.println("회원수정");
                    book.updateBook();
                    break;
                // 삭제
                case 4:
                    System.out.println("회원삭제");
                    book.deleteBook();
                    break;
                // 삭제 취소
                case 5:
                    System.out.println("삭제취소");

                    break;
                default:
                    select = false;
                    break;
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
}
