package com.yapa.api;

import com.yapa.base.IPaperManager;

import android.content.Context;
import android.content.Intent;

public interface IPaperListener {

    public static final String ACTION_PAPEREXTEND = "com.yapa.PAPEREXTEND";

    public static final int PAPERACTION_CREATE = 0;
    public static final int PAPERACTION_DESTORY = 1;
    public static final int PAPERACTION_LOWMEMORY = 2;
    public static final int PAPERACTION_STARTCONTEXT = 3;
    public static final int PAPERACTION_STOPCONTEXT = 4;
    public static final int PAPERACTION_VISIBLE = 5;
    public static final int PAPERACTION_INVISIBLE = 6;

    void onPaper(int action, IPaperManager paperManager);

    void onReceive(Context context, Intent intent);

}
