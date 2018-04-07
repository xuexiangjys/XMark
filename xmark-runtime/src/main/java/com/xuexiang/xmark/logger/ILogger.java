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

/**
 * 简易的日志记录接口
 *
 * @author xuexiang
 * @date 2018/3/8 下午9:00
 */
public interface ILogger {

    /**
     * 当前是否是debug模式
     * @return
     */
    boolean isDebug();

    /**
     * 设置是否是调试模式
     * @param isDebug
     */
    void debug(boolean isDebug);

    /**
     * 打印信息
     * @param tag
     * @param msg
     */
    void log(String tag, String msg);

}
