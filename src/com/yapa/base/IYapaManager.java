package com.yapa.base;

import java.util.List;

import com.yapa.api.IYapaCenter;
import com.yapa.api.IYapaWorker;
import com.yapa.space.api.IScene;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;

public interface IYapaManager {

    IScene getScene();
    int workCount();
    IYapaWorker getWorker(int index);
    List<IYapaWorker> getWorkers();

    void register(Activity activity, IYapaCenter center);
    void onCreate(Bundle savedInstanceState);

    void addObserver(IYapaObserver observer);
    void removeObserver(IYapaObserver observer);

    Context context();
    Looper looper();

    void startWork(Intent intent, Bundle options);
    void finishWork(IYapaWorker layer);
    void goBackWork();

    void requestLayout(IYapaWorker worker);
    void update(IYapaWorker layer, int what, Object oldValue, Object newValue);

    boolean spaceInOut();
    int getStandWidth();
    int getStandHeight();
    int getNormalSize();
    // int getNormalDeep();

    public interface IYapaObserver {
        final int SPACE_INOUT = 0; // Boolean
        final int SPACE_PUBLIC_MAX = SPACE_INOUT + 1;

        void observer(int what, Object object);
    }

    public static class YapaBaseObserver implements IYapaObserver {
        @Override
        public void observer(int what, Object object) {
 
        }
    }

}
