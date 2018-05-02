# XMark

一个简易的埋点解决方案（基于JakeWharton的hugo基础上改造）

[![xm][xmsvg]][xm]  [![api][apisvg]][api]


## 特点

* JakeWharton的[hugo](https://github.com/JakeWharton/hugo)的所有特点。

* 支持自定义对象序列化接口，方便打印对象。

* 内置默认的logcat打印突破了4000的打印限制。

* 支持日志的自定义打印（不仅简单的Logcat）。你可以使用我的[XLog](https://github.com/xuexiangjys/XLog)进行扩展。

* 支持设置日志的打印优先级。

## 如何使用

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
        classpath 'com.github.xuexiangjys.XMark:xmark-plugin:1.0.5'
    }
}
```

3.在项目的 build.gradle 中增加依赖并引用xmark插件

```
apply plugin: 'com.xuexiang.xmark' //引用xmark插件

dependencies {
    ···
    implementation 'com.github.xuexiangjys.XMark:xmark-runtime:1.0.5'  //添加依赖
}

```

## 联系方式

[![](https://img.shields.io/badge/点击一键加入QQ群-602082750-blue.svg)](http://shang.qq.com/wpa/qunwpa?idkey=9922861ef85c19f1575aecea0e8680f60d9386080a97ed310c971ae074998887)

[xmsvg]: https://img.shields.io/badge/XMark-v1.0.5-brightgreen.svg
[xm]: https://github.com/xuexiangjys/XMark
[apisvg]: https://img.shields.io/badge/API-14+-brightgreen.svg
[api]: https://android-arsenal.com/api?level=19