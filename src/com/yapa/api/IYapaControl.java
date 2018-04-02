package com.yapa.api;

import com.yapa.base.IYapaManager;

import android.os.Bundle;
import android.view.ViewGroup;

public interface IYapaControl {


    public static final int SPCAE_SCALE_X = 0;
    public static final int SPCAE_SCALE_Y = SPCAE_SCALE_X + 1;
    public static final int SPCAE_SCALE_Z = SPCAE_SCALE_Y + 1;

    public void set(IYapaControlObserver observer);
    public void reset();

    public void setup(IYapaManager spaceManager, ViewGroup parent, Bundle savedInstanceState);
    public void onWhat(int what, int value);

    public static final int SPACECONTROLID_INVALID             = -1;
    public static final int SPACECONTROLID                     = 0;
    public static final int SPACECONTROLID_PROJECTION          = 1;
    public static final int SPACECONTROLID_CAMERA              = 2;
    public static final int SPACECONTROLID_SENSORCALIBRATION   = 3;
    public static final int SPACECONTROLID_SCREEN              = 4;
    public static final int SPACECONTROLID_WINDOWVISIBLE       = 5;
    public static final int SPACECONTROLID_WINDOWMULTI         = 6;
    public static final int SPACECONTROLID_WINDOWSHAPE         = 7;
    public static final int SPACECONTROLID_WINDOWROTATION      = 8;
    public static final int SPACECONTROLID_WINDOWBACKGROUND    = 9;

    public static final int SPACECONTROLID_WIDTHREDUCE         = 10;
    public static final int SPACECONTROLID_WIDTHINCREASE       = 11;
    public static final int SPACECONTROLID_HEIGHTREDUCE        = 12;
    public static final int SPACECONTROLID_HEIGHTINCREASE      = 13;
    public static final int SPACECONTROLID_DEEPREDUCE          = 14;
    public static final int SPACECONTROLID_DEEPINCREASE        = 15;
    public static final int SPACECONTROLID_RESETSIZE           = 16;

    public static final int SPACECONTROLID_ORIENTATION         = 17;

    public static final int SPACECONTROLID_SPACEROTATION       = 18;
    public static final int SPACECONTROLID_WINDOWROTATIONORNOROTATION      = 19;


    public static final int SPACECONTROLID_BACK                = 10000;
    public static final int SPACECONTROLID_GROUP               = 10001;
    public static final int SPACECONTROLID_FULLSCREEN          = 10002;

    public static final int SPACECONTROLID_FULLSCREENVIEWID    = 20000;
    /**
     * Data
     */
    public static final int SPACE_ZERO                         = 0X00000000;
    public static final int SPACE_NORMAL                       = SPACE_ZERO;
    public static final int SPACE_ENTERFUSE                    = 0X00000001;
    public static final int SPACE_MASK                         = SPACE_ENTERFUSE;

    public static final int SPACE_PROJECTION_PERESPECTIVE      = SPACE_ZERO;
    public static final int SPACE_PROJECTION_ORTHO             = 0X00000002;
    public static final int SPACE_PROJECTION_MASK              = SPACE_PROJECTION_ORTHO;

    public static final int SPACE_SPACEROTATIONCAMERA          = SPACE_ZERO;
    public static final int SPACE_CAMERAROTATIONPOINTER        = 0X00000004;
    public static final int SPACE_CAMERA_MASK                  = SPACE_CAMERAROTATIONPOINTER;

    // calibration
    public static final int SPACE_SENSORCALIBRATION           = 0X00000008;

    public static final int SPACE_SCREEN_ONE                  = SPACE_ZERO;
    public static final int SPACE_SCREEN_TWO                  = 0X00000010;
    public static final int SPACE_SCREEN_MASK                 = SPACE_SCREEN_TWO;

    public static final int SPACE_WINDOW_VISIBLE              = SPACE_ZERO;
    public static final int SPACE_WINDOW_INVISIBLE            = 0X00000020;
    public static final int SPACE_WINDOWVISIBLE_MASK          = SPACE_WINDOW_INVISIBLE;

    public static final int SPACE_WINDOW_NOMULTI              = SPACE_ZERO;
    public static final int SPACE_WINDOW_MULTI                = 0X00000040;
    public static final int SPACE_WINDOWMULTI_MASK            = SPACE_WINDOW_MULTI;

    public static final int SPACE_WINDOW_PLANSHAPE            = SPACE_ZERO;
    public static final int SPACE_WINDOW_CURVESHAPE           = 0X00000080;
    public static final int SPACE_WINDOWSHAPE_MASK            = SPACE_WINDOW_CURVESHAPE;

    public static final int SPACEWINDOW_ROTATION             = SPACE_ZERO;
    public static final int SPACEWINDOW_YAW                  = 0X00000100;
    public static final int SPACEWINDOW_PITCH                = 0X00000200;
    public static final int SPACEWINDOW_ROLL                 = 0X00000400;
    public static final int SPACEWINDOW_NOROTATION           = 0X00000800;

    public static final int SPACE_WINDOWROTATION_MASK         = SPACEWINDOW_ROTATION |
                                                                SPACEWINDOW_YAW |
                                                                SPACEWINDOW_PITCH |
                                                                SPACEWINDOW_ROLL |
                                                                SPACEWINDOW_NOROTATION;

    public static final int SPACE_WINDOW_TRANSPARENT          = SPACE_ZERO;
    public static final int SPACE_WINDOW_OPAQUE               = 0X00001000;
    public static final int SPACE_WINDOWBACKGROUND_MASK       = SPACE_WINDOW_OPAQUE;

    public static final int SPACE_ORIENTATION_LANDSCAPE       = SPACE_ZERO;
    public static final int SPACE_ORIENTATION_PORTRAIT        = 0X00002000;
    public static final int SPACE_ORIENTATION_MASK            = SPACE_ORIENTATION_PORTRAIT;

    public static final int SPACE_ROTATION                    = SPACE_ZERO;
    public static final int SPACE_NOROTATION                  = 0X00004000;
    public static final int SPACE_ROTATION_MASK               = SPACE_ROTATION | SPACE_NOROTATION;

    public static final int SPACE_FULLSCREEN_LOCKED           = SPACE_ZERO;
    public static final int SPACE_FULLSCREEN_NOLOCKED         = 0X80000000;
    public static final int SPACE_FULLSCREEN_MASK             = SPACE_FULLSCREEN_LOCKED | SPACE_FULLSCREEN_NOLOCKED;

}
