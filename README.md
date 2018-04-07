# XMark

一个简易的埋点解决方案（基于JakeWharton的hugo基础上改造）

[![xm][xmsvg]][xm]  [![api][apisvg]][api]

## 关于我
[![github](https://img.shields.io/badge/GitHub-xuexiangjys-blue.svg)](https://github.com/xuexiangjys)   [![csdn](https://img.shields.io/badge/CSDN-xuexiangjys-green.svg)](http://blog.csdn.net/xuexiangjys)


## 特点

- JakeWharton的[hugo](https://github.com/JakeWharton/hugo)的所有特点。

- 支持日志的自定义打印（不仅简单的Logcat）。你可以使用我的[XLog](https://github.com/xuexiangjys/XLog)进行扩展。

## 1、演示（请star支持）


## 2、如何使用
目前支持主流开发工具AndroidStudio的使用，直接配置build.gradle，增加依赖即可.

### 2.1、Android Studio导入方法，添加Gradle依赖

1.先在项目根目录的 build.gradle 的 repositories 添加:
```
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

2.再在项目根目录的 build.gradle 的 dependencies 添加xmark插件：

```
buildscript {
    ···
    dependencies {
        ···
        classpath 'com.github.xuexiangjys.XMark:xmark-plugin:1.0.0'
    }
}
```

3.在项目的 build.gradle 中增加依赖并引用xmark插件

```
apply plugin: 'com.xuexiang.plugin.xmark' //引用xmark插件

dependencies {
    ···
    implementation 'com.github.xuexiangjys.XMark:xmark-runtime:1.0.0'  //添加依赖
}

```

## 特别感谢
https://github.com/JakeWharton/hugo

[xmsvg]: https://img.shields.io/badge/XMark-v1.0.0-brightgreen.svg
[xm]: https://github.com/xuexiangjys/XMark
[apisvg]: https://img.shields.io/badge/API-14+-brightgreen.svg
[api]: https://android-arsenal.com/api?level=19