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
 * 埋点配置
 * @author xuexiang
 */
public class XMark {

    /**
     * 最大日志优先级【日志优先级为最大等级，所有日志都不打印】
     */
    private final static int MAX_LOG_PRIORITY = 10;
    /**
     * 最小日志优先级【日志优先级为最小等级，所有日志都打印】
     */
    private final static int MIN_LOG_PRIORITY = 0;

    //===============属性==============//
    /**
     * 默认的日志记录为Logcat
     */
    private static ILogger sILogger = new LogcatLogger();

    /**
     * 是否是调试模式
     */
    private static boolean sIsDebug = false;
    /**
     * 日志打印优先级
     */
    private static int sLogPriority = MAX_LOG_PRIORITY;

    //===============设置方法==============//
    /**
     * 设置日志记录者的接口
     *
     * @param logger
     */
    public static void setLogger(@NonNull ILogger logger) {
        sILogger = logger;
    }

    /**
     * 设置是否开启日志记录
     * @param isDebug
     */
    public static void debug(boolean isDebug) {
        setDebug(isDebug);
        if (isDebug) {
            setPriority(MIN_LOG_PRIORITY);
        } else {
            setPriority(MAX_LOG_PRIORITY);
        }
    }

    /**
     * 设置是否是调试模式
     *
     * @param isDebug
     */
    public static void setDebug(boolean isDebug) {
        sIsDebug = isDebug;
    }

    /**
     * 设置打印日志的等级（只打印改等级以上的日志）
     *
     * @param priority
     */
    public static void setPriority(int priority) {
        sLogPriority = priority;
    }

    //===============打印日志==============//
    /**
     * 打印日志
     * @param tag
     * @param msg
     */
    public static void log(int priority, String tag, String msg) {
        if (enableLog(priority)) {
            sILogger.log(priority, tag, msg);
        }
    }


    /**
     * 能否打印
     *
     * @param logPriority
     * @return
     */
    private static boolean enableLog(int logPriority) {
        return isDebug() && logPriority >= sLogPriority;
    }

    /**
     * 当前是否是调试模式
     * @return
     */
    public static boolean isDebug() {
        return sILogger != null && sIsDebug;
    }
}
