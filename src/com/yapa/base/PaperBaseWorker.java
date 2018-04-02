package com.yapa.base;

import com.yapa.api.IPaperWorker;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public abstract class PaperBaseWorker implements IPaperWorker {

    protected IPaperManager mYapaManager;
    protected View mWorkView;

    @Override
    public View findViewById(int id) {
        if (null == mWorkView)
            return null;
        return mWorkView.findViewById(id);
    }

    @Override
    public Context getContext() {
        if (null == mYapaManager)
            return null;
        return mYapaManager.getContext();
    }

    @Override
    public void onCreate(IPaperManager manager, View rootView, Bundle options) {
        mYapaManager = manager;
        mWorkView = rootView;
    }
}
