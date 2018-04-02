package com.yapa.api;

import com.yapa.base.IPaperManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

public interface IPaperWorker {

    int getLayoutId();
    String getWorkerName();

    View findViewById(int id);
    Context getContext();

    void onCreate(IPaperManager manager, View rootView, Bundle options);
    void onResume(IPaperManager manager);
    void onPause(IPaperManager manager);
    void onDestroy(IPaperManager manager);
}
