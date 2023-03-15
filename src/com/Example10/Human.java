package com.Example10;

public interface Human extends Creature{
    //생물의 기능을 확장한 휴먼
    void talk();
    void watch();
    void hear();
    //추가로, 슈퍼 인터페이스로부터 run()을 상속받고 있음
}
