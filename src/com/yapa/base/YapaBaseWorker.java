package com.yapa.base;

import com.yapa.api.IYapaWorker;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;

public abstract class YapaBaseWorker implements IYapaWorker {

    protected IYapaManager mYapaManager;
    protected View mWorkView;

    public YapaBaseWorker() {

    }

    @Override
    public String getWorkerName() {
        return getClass().getName();
    }

    @Override
    public void onCreate(IYapaManager manager, View rootView, Bundle options) {
        mYapaManager = manager;
        mWorkView = rootView;
    }

    @Override
    public void onStart(IYapaManager manager) {
    }

    @Override
    public void onResume(IYapaManager manager) {
    }

    @Override
    public void onPause(IYapaManager manager) {
    }

    @Override
    public void onStop(IYapaManager manager) {
    }

    @Override
    public void onDestroy(IYapaManager manager) {
    }

    @Override
    public void onSaveInstanceState(IYapaManager manager, Bundle bundle) {
    }
    @Override
    public View findViewById(int id) {
        return mWorkView.findViewById(id);
    }

    @Override
    public Context getContext() {
        return mYapaManager.context();
    }

    @Override
    public IYapaManager spaceManager() {
        return mYapaManager;
    }

    @Override
    public void set(int key, Object object) {
    }

    @Override
    public Object get(int key) {
        return null;
    }

    @Override
    public int getWorkType() {
        return NORMALWORKER;
    }

    @Override
    public boolean isVisible(IYapaManager mSpaceManager) {
        return true;
    }

    @Override
    public boolean isOpaque(IYapaManager mSpaceManager) {
        return false;
    }

    @Override
    public float getAlpha(IYapaManager mSpaceManager) {
        return 0;
    }

    @Override
    public Point frameSize() {
        return new Point(mYapaManager.getStandWidth(), mYapaManager.getStandHeight());
    }

    @Override
    public boolean isSingle() {
        return false;
    }
}
