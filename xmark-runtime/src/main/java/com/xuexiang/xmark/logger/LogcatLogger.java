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

package com.xuexiang.xmark.logger;

import android.util.Log;


/**
 * 默认Logcat日志记录
 *
 * @author xuexiang
 * @date 2018/3/9 上午12:33
 */
public class LogcatLogger implements ILogger {

    /**
     * 是否是调试模式
     */
    private boolean mIsDebug = false;

    /**
     * 当前是否是debug模式
     *
     * @return
     */
    @Override
    public boolean isDebug() {
        return mIsDebug;
    }

    @Override
    public void debug(boolean isDebug) {
        mIsDebug = isDebug;
    }

    /**
     * 打印信息
     *
     * @param tag
     * @param msg
     */
    @Override
    public void log(String tag, String msg) {
        if (isDebug()) {
            Log.v(tag, msg);
        }
    }


}
