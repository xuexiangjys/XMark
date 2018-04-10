# XMark

一个简易的埋点解决方案（基于JakeWharton的hugo基础上改造）

[![xm][xmsvg]][xm]  [![api][apisvg]][api]

## 关于我
[![github](https://img.shields.io/badge/GitHub-xuexiangjys-blue.svg)](https://github.com/xuexiangjys)   [![csdn](https://img.shields.io/badge/CSDN-xuexiangjys-green.svg)](http://blog.csdn.net/xuexiangjys)


## 特点

- JakeWharton的[hugo](https://github.com/JakeWharton/hugo)的所有特点。

- 内置默认的logcat打印突破了4000的打印限制。

- 支持日志的自定义打印（不仅简单的Logcat）。你可以使用我的[XLog](https://github.com/xuexiangjys/XLog)进行扩展。

- 支持设置日志的打印优先级。

## 1、演示（请star支持）

![](https://github.com/xuexiangjys/XMark/blob/master/img/xmark.jpg)

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
        classpath 'com.github.xuexiangjys.XMark:xmark-plugin:1.0.4'
    }
}
```

3.在项目的 build.gradle 中增加依赖并引用xmark插件

```
apply plugin: 'com.xuexiang.xmark' //引用xmark插件

dependencies {
    ···
    implementation 'com.github.xuexiangjys.XMark:xmark-runtime:1.0.4'  //添加依赖
}

```

### 2.2、设置日志是否打印

```

XMark.debug(true); //默认是false

```

### 2.3、使用@MarkLog进行埋点

1.记录方法的执行

priority： 打印日志的优先级
```
@MarkLog
private void printDemo1(String lab, String name) {
    Log.d("printing", lab + name);
}

@MarkLog(priority = Log.ERROR)
private String printDemo2(String lab, String name) {
    return lab + name;
}
```

2.记录类的创建

```
@MarkLog
static class Greeter {
    private final String name;

    Greeter(String name) {
        this.name = name;
    }

    private String sayHello() {
        return "Hello, " + name;
    }
}
```

### 2.4、修改日志的打印方式

1.可在应用初始化的Application下进行如下操作：

```

XMark.setLogger(new ILogger() { //设置日志打印的实现接口
    @Override
    public void log(int priority, String tag, String msg) {
        ···打印的方法
    }
});

```

2.设置打印日志的优先级

如果只想打印出错信息及以上的日志，可如下设置：

```
XMark.setPriority(Log.ERROR);

```


## 特别感谢
https://github.com/JakeWharton/hugo

[xmsvg]: https://img.shields.io/badge/XMark-v1.0.4-brightgreen.svg
[xm]: https://github.com/xuexiangjys/XMark
[apisvg]: https://img.shields.io/badge/API-14+-brightgreen.svg
[api]: https://android-arsenal.com/api?level=19