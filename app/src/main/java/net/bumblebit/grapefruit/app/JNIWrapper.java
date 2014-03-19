package net.bumblebit.grapefruit.app;

public class JNIWrapper {

    static {
        System.loadLibrary("app");
    }

    public static native void on_surface_created();

    public static native void on_surface_changed(int width, int height);

    public static native void on_draw_frame();

}
