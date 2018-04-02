package com.yapa.base;

import com.yapa.api.IPaperCenter;
import com.yapa.space.api.IScene;

import android.content.Context;

public interface IPaperManager {

    void register(Context context, IPaperCenter center);

    void onCreate(Context context);

    void onDestroy(Context context);

    Context getContext();

    IPaperCenter getCenter();

    IScene getGlScene();
}
