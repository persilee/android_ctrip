![logo](https://cdn.lishaoy.net/ctrip/android/android_ctrip_h.png)

## Android Flutter 混合开发高仿大厂App

[![GitHub release (latest by date)](https://img.shields.io/github/v/release/persilee/android_ctrip?color=brightgreen)](https://github.com/persilee/android_ctrip/releases) [![author](https://img.shields.io/badge/author-persilee-orange.svg)](https://github.com/persilee) [![blog](https://img.shields.io/badge/blog-lishaoy.net-blue.svg)](https://h.lishaoy.net) ![GitHub commit activity](https://img.shields.io/github/commit-activity/m/persilee/android_ctrip?color=blueviolet&label=commit)

此项目使用 **Android组件化的架构搭建** 及 **Flutter** 和 **Android** 混合开发 *(整个App只有首页是用原生Android完成，其他页面都是引入之前的做好的Flutter页面)* ，主宿主程序由 Android 搭建，采用了组件化的架构搭建整个 **App** ，不同业务，对应不同的 module 工程，业务之间采用接口通信 *(ARouter)* ，以 module 的形式混入 Flutter，通过 **MethodChannel** 和 **Flutter** 端进行数据通信等

### 项目结构预览图

![project structure](https://cdn.lishaoy.net/ctrip/android/project.png "project structure")

### 项目效果预览图

|![second floor](https://cdn.lishaoy.net/ctrip/android/second_floor.gif "second floor" )|![search bar](https://cdn.lishaoy.net/ctrip/android/searchBar.gif "search bar" )|
|---|---|
|![banner](https://cdn.lishaoy.net/ctrip/android/banner.gif "banner")|![tab page](https://cdn.lishaoy.net/ctrip/android/tab_bar.gif "tab page")|

大家也可扫描，安装体验：[[AFCtrip.apk]](https://github.com/persilee/android_ctrip/releases/download/v0.0.05-bate.2/AFCtrip_v0.0.05-bate.2.apk)

![手机扫描二维码安装](https://www.pgyer.com/app/qrcode/AsHK?sign=&amp;auSign=&amp;code= "手机扫描二维码安装")

更多的项目实行效果 [请移步这里点击观看视频](https://www.bilibili.com/video/BV1W54y1B72U/) *(点击齿轮 --> 更多播放设置，可以隐藏黑边)*

### 插件

在这里把项目使用的插件整理列举出来供大家参考：

- [magicindicator](https://github.com/hackware1993/MagicIndicator) 强大、可定制、易扩展的 ViewPager 指示器框架，首页的4个 tab *(精选、附近、景点、美食)* 就是用这个实现的。
- [immersionbar](https://github.com/gyf-dev/ImmersionBar) 一句代码轻松实现状态栏、导航栏沉浸式管理
- [pagerBottomTabStrip](https://github.com/tyzlmjj/PagerBottomTabStrip) 页面底部和侧边的导航栏，首页、目的地、旅拍、我的页面切换就是用这个实现的。
- [rxjava/rxandroid](https://github.com/ReactiveX/RxAndroid) 异步和链式编程
- [butterknife](https://github.com/JakeWharton/butterknife) view注入插件，配合Android插件使用，可快速自动生成 init view的代码，不用写一句 `findViewById` 的代码。
- [gson](https://github.com/google/gson) json解析，配合Android插件使用，可快速生成实体类
- [smartRefreshLayout](https://github.com/scwang90/SmartRefreshLayout) 智能下拉刷新框架，携程二楼及下拉刷新加载更多就是用这个实现的
- [eventbus](https://github.com/greenrobot/EventBus) 发布/订阅事件总线，优雅的完成组件之间通信
- [arouter](https://github.com/alibaba/ARouter) 依赖注入、路由跳转、注册service，优雅的完成模块之间的通信
- [okhttp](https://github.com/square/okhttp) 网络请求插件
- [agentweb](https://github.com/Justson/AgentWeb) webview框架，进行简单的二次封装可优雅的进行网页跳转
- [glide](https://github.com/bumptech/glide) 高性能、可扩展的图片加载插件
- [banner](https://github.com/youth5201314/banner) 图片轮播控件

### 更新日志

- 2020-09-05 11:56 修复(携程Api改变导致) App 闪退问题
- 2020-07-20 12:34 发布 releases v0.0.05-bate.1 版本

更多相关详情，请查阅博客：[https://h.lishaoy.net](https://h.lishaoy.net/androidctrip)







