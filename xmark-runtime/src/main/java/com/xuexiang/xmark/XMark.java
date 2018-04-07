/*
 * Copyright (C) 2018 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xuexiang.xmark;

import android.support.annotation.NonNull;

import com.xuexiang.xmark.logger.ILogger;
import com.xuexiang.xmark.logger.LogcatLogger;

/**
 * @author xuexiang
 * @date 2018/4/7 下午6:29
 */
public class XMark {

    /**
     * 默认的日志记录为Logcat
     */
    private static ILogger sILogger = new LogcatLogger();

    /**
     * 设置日志记录者的接口
     *
     * @param logger
     */
    public static void setLogger(@NonNull ILogger logger) {
        sILogger = logger;
    }


    /**
     * 当前是否是debug模式
     */
    public static boolean isDebug() {
        return sILogger != null && sILogger.isDebug();
    }

    /**
     * 设置是否是调试模式
     *
     * @param isDebug
     */
    public static void debug(boolean isDebug) {
        if (sILogger != null) {
            sILogger.debug(isDebug);
        }
    }

    /**
     * 打印日志
     * @param tag
     * @param msg
     */
    public static void log(int priority, String tag, String msg) {
        if (sILogger != null) {
            sILogger.log(priority, tag, msg);
        }
    }
}
