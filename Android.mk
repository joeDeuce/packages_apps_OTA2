LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_SRC_FILES := $(call all-subdir-java-files)
LOCAL_PACKAGE_NAME := OTA2
LOCAL_CERTIFICATE := platform
include $(BUILD_PACKAGE)
