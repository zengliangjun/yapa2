package com.yapa.api;

public interface IYapaControlObserver {

    void updateWhat(int option, int value);

    void updateOption(int option);

    int getOption(int spacecontrolid);

    float getValue(int what);

}
