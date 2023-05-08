package io.endigo.plugins.pdfviewflutter;

// 滚动条的显示通知
public interface ScrollHandlerNotify {
    // 滚动条的显示改变，true为显示，false为隐藏
    void onScrollHandlerChanged(Boolean enable);
}
