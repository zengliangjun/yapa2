package com.yapa.api;

import com.yapa.base.IPaperManager;

import android.content.Intent;
import android.os.Bundle;

public interface IPaperCenter {

    Intent onActivityCreated(IPaperManager manager, Bundle outState);

    static final String workBundleExtra = "#papers";
    static final String workComponentArray = "#componentNames";

    public static final String ACTION_ACTIVITY_PANO = "com.yapa.space.ACTIONPANO";
    public static final String PANO_CONTENTENTY = "#contententy";

    void startSpace(IPaperManager manager);
    IPaperListener listener();
}
