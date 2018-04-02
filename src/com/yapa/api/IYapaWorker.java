package com.yapa.api;

import com.yapa.base.IYapaManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;

public interface IYapaWorker {

    int getLayoutId();
    String getWorkerName();

    void onCreate(IYapaManager manager, View rootView, Bundle options);
    void onStart(IYapaManager manager);
    void onResume(IYapaManager manager);
    void onPause(IYapaManager manager);
    void onStop(IYapaManager manager);
    void onDestroy(IYapaManager manager);
    void onSaveInstanceState(IYapaManager manager, Bundle bundle);

    View findViewById(int id);
    Context getContext();
    IYapaManager spaceManager();

    void set(int key, Object object);
    Object get(int key);

    static final int ELEMENT = 0;
    static final int NORMALWORKER = 1;
    static final int SYSTEMWORKER = 2;
    static final int BILLBOARD_FRONTTOP = 3;
    static final int BILLBOARD_FRONTCENTER = 4;
    static final int BILLBOARD_FRONTBOTTOM = 5;

    static final int BILLBOARD_LEFTTOP = 6;
    static final int BILLBOARD_LEFTCENTER = 7;
    static final int BILLBOARD_LEFTBOTTOM = 8;

    static final int BILLBOARD_RIGHTTOP = 9;
    static final int BILLBOARD_RIGHTCENTER = 10;
    static final int BILLBOARD_RIGHTBOTTOM = 11;

    static final int BILLBOARD_BACKGROUNDTOP = 12;
    static final int BILLBOARD_BACKGROUNDCENTER = 13;
    static final int BILLBOARD_BACKGROUNDBOTTOM = 14;

    int getWorkType();

    /**
     * yapa space method
     */
    Point frameSize();
    boolean isVisible(IYapaManager mSpaceManager);
    boolean isOpaque(IYapaManager mSpaceManager);
    float getAlpha(IYapaManager mSpaceManager);
    boolean isSingle();
}
