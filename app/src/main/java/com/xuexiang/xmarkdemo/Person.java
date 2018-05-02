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

package com.xuexiang.xmarkdemo;

/**
 * <pre>
 *     desc   :
 *     author : xuexiang
 *     time   : 2018/5/3 上午12:12
 * </pre>
 */
public class Person {

    private String name;
    private int gender;
    private int age;
    private String birthday;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getGender() {
        return gender;
    }

    public Person setGender(int gender) {
        this.gender = gender;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getBirthday() {
        return birthday;
    }

    public Person setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
}
