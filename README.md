# XEventBus
evnetbus修改版本
调用方式：com.tiger:XEventBus:1.0.0
使用方式：
//MainActivity.this为需要接收到的对象
XEventBus.getDefault().post(new Test(MainActivity.this));
