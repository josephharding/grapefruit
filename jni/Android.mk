LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := app
LOCAL_CFLAGS := -Wall -Wextra
LOCAL_SRC_FILES := game.c jni.c
LOCAL_LDLIBS := -lGLESv2 -ldl -llog

include $(BUILD_SHARED_LIBRARY)
