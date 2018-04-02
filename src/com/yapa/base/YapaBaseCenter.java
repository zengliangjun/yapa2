package com.yapa.base;

import com.yapa.api.IYapaCenter;
import com.yapa.api.IYapaControl;

import android.view.GestureDetector;

public abstract class YapaBaseCenter implements IYapaCenter {

    @Override
    public int spaceStatus() {
        return IYapaCenter.YAPA_ENTERSPACE;
    }

    protected static float[] mDefaultCenterSettings = {
            0.0f, // SPACEOPTION_HORIZONTALPOSITION
            0.65f, // SPACEOPTION_HORIZONTALPOSITION_BILLBOARDFRONTTOP
            0.0f, // SPACEOPTION_HORIZONTALPOSITION_BILLBOARDFRONTCENTER
         - 0.65f, // SPACEOPTION_HORIZONTALPOSITION_BILLBOARDFRONTBOTTOM
            0.65f, // SPACEOPTION_HORIZONTALPOSITION_BILLBOARDLEFTTOP
            0.0f, // SPACEOPTION_HORIZONTALPOSITION_BILLBOARDLEFTCENTER
         - 0.65f, // SPACEOPTION_HORIZONTALPOSITION_BILLBOARDLEFTBOTTOM
            0.65f, // SPACEOPTION_HORIZONTALPOSITION_BILLBOARDRIGHTTOP
            0.0f, // SPACEOPTION_HORIZONTALPOSITION_BILLBOARDRIGHTCENTER
         - 0.65f, // SPACEOPTION_HORIZONTALPOSITION_BILLBOARDRIGHTBOTTOM
            0.65f, // SPACEOPTION_HORIZONTALPOSITION_BILLBOARDBACKGROUNDTOP
            0.0f, // SPACEOPTION_HORIZONTALPOSITION_BILLBOARDBACKGROUNDCENTER
         - 0.65f, // SPACEOPTION_HORIZONTALPOSITION_BILLBOARDBACKGROUNDBOTTOM

         (float) Math.toRadians(50.0f), // SPACEOPTION_SYSTEMUI_ROTATIONRADIANS
         (float) Math.toRadians(90.0f), // SPACEOPTION_BILLBOARD_LEFTRADIANS
         (float) Math.toRadians(-90.0f), // SPACEOPTION_SYSTEMUI_RIGHTRADIANS
    };

    @Override
    public float getCenterSetting(int option) {
        return mDefaultCenterSettings[option];
    }

    @Override
    public float[] getCenterSettings() {
        return mDefaultCenterSettings;
    }

    @Override
    public boolean keepBrightness() {
        return true;
    }

    @Override
    public GestureDetector.SimpleOnGestureListener setupDoubleTapListener() {
        return null;
    }

    @Override
    public int getDefaultSystemSettings() {
        return IYapaControl.SPACEWINDOW_NOROTATION | IYapaControl.SPACE_NOROTATION;
    }
}
