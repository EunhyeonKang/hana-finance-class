package com.Example19;

import java.util.ArrayList;
import java.util.List;

class OnlyOneFlower {
    private static OnlyOneFlower instance;

    private OnlyOneFlower() {

    }

    public static OnlyOneFlower getInstance() {
        if (instance == null) {
            instance = new OnlyOneFlower();
        }
        return instance;
    }
}


public class Main {
    public static void main(String[] args) {
        // OnlyOneFlower flower1 = new OnlyOneFlower(); 에러
        OnlyOneFlower flower2 = OnlyOneFlower.getInstance();
        Button button2 = new Button(new OnClickEvent() {

            @Override
            public void onClick() {
                System.out.println("클릭");
            }
        });
        List<Button> buttons = new ArrayList<>();
        buttons.add(button2);
        buttons.stream().forEach(e -> e.click());
    }
}


interface OnClickEvent {
    void onClick();
}


class Button {
    OnClickEvent listener;

    public Button(OnClickEvent listener) {
        this.listener = listener;
    }

    void click() {
        listener.onClick();
    }
}
