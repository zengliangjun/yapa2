package com.yapa.api;

import com.yapa.base.IYapaManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;

public interface IYapaCenter {

    final int YAPA_ORIENTATIONLANDSCAPE_LAYOUTBACKGROUND = 0x000000;
    final int YAPA_ORIENTATIONLANDSCAPE_LAYOUTSPACELEFT  = 0x000001;
    final int YAPA_ORIENTATIONLANDSCAPE_LAYOUTSPACERIGHT = 0x000002;
    final int YAPA_ORIENTATIONPORTRAIT_LAYOUTBACKGROUND  = 0x010000;
    final int YAPA_ORIENTATIONPORTRAIT_LAYOUTSPACETOP    = 0x010001;
    final int YAPA_ORIENTATIONPORTRAIT_LAYOUTSPACEBOTTOM = 0x010002;

    final int YAPA_ORIENTATIONMASK                       = 0x010000;
    final int YAPA_ORIENTATIONLANDSCAPE                  = 0x000000;
    final int YAPA_ORIENTATIONPORTRAIT                   = 0x010000;

    final int YAPA_ORIENTATIONLAYOUT_MASK                = 0x01FFFF;

    final int YAPA_NOENTERSPACE                          = 0x000000;
    final int YAPA_ENTERSPACE                            = 0x020000;
    final int YAPA_ENTERSPACEMASK                        = 0x020000;

    int spaceStatus();

    static final int SPACEOPTION_HORIZONTALPOSITION = 0;
    static final int SPACEOPTION_HORIZONTALPOSITION_BILLBOARDFRONTTOP = 1;
    static final int SPACEOPTION_HORIZONTALPOSITION_BILLBOARDFRONTCENTER = 2;
    static final int SPACEOPTION_HORIZONTALPOSITION_BILLBOARDFRONTBOTTOM = 3;
    static final int SPACEOPTION_HORIZONTALPOSITION_BILLBOARDLEFTTOP = 4;
    static final int SPACEOPTION_HORIZONTALPOSITION_BILLBOARDLEFTCENTER = 5;
    static final int SPACEOPTION_HORIZONTALPOSITION_BILLBOARDLEFTBOTTOM = 6;
    static final int SPACEOPTION_HORIZONTALPOSITION_BILLBOARDRIGHTTOP = 7;
    static final int SPACEOPTION_HORIZONTALPOSITION_BILLBOARDRIGHTCENTER = 8;
    static final int SPACEOPTION_HORIZONTALPOSITION_BILLBOARDRIGHTBOTTOM = 9;
    static final int SPACEOPTION_HORIZONTALPOSITION_BILLBOARDBACKGROUNDTOP = 10;
    static final int SPACEOPTION_HORIZONTALPOSITION_BILLBOARDBACKGROUNDCENTER = 11;
    static final int SPACEOPTION_HORIZONTALPOSITION_BILLBOARDBACKGROUNDBOTTOM = 12;

    static final int SPACEOPTION_SYSTEMUI_ROTATIONRADIANS = 13;
    static final int SPACEOPTION_BILLBOARD_LEFTRADIANS = 14;
    static final int SPACEOPTION_BILLBOARD_RIGHTRADIANS = 15;
    static final int SPACEOPTION_MAX = 16;

    float getCenterSetting(int option);
    float[] getCenterSettings();
    boolean keepBrightness();
    int getDefaultSystemSettings();

    IYapaControl setupControl();
    GestureDetector.SimpleOnGestureListener setupDoubleTapListener();

    Intent onActivityCreated(IYapaManager manager, Bundle outState);

    static final String workBundleExtra = "#workers";
    static final String workComponentArray = "#componentNames";
}
