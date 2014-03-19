package net.bumblebit.grapefruit.app;

import android.opengl.GLSurfaceView.Renderer;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class RendererWrapper implements Renderer {

    @Override
    public void onSurfaceCreated(GL10 unused, EGLConfig config) {
        JNIWrapper.on_surface_created();
    }

    @Override
    public void onSurfaceChanged(GL10 unused, int width, int height) {
        JNIWrapper.on_surface_changed(width, height);
    }

    @Override
    public void onDrawFrame(GL10 unused) {
        JNIWrapper.on_draw_frame();
    }

}
