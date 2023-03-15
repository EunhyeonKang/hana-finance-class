package com.Example10;

public abstract class Dancer extends Character implements Human, Creature{
    //댄서는 크리처야
    //차랙턴은 휴먼이 아니야
    public Dancer(String name) {
        super(name);
    }
    @Override
    public void attack(Kinoko kinoko) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void talk() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void watch() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void hear() {
        // TODO Auto-generated method stub
        
    }
}
