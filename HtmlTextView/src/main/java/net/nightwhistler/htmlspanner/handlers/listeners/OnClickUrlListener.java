package net.nightwhistler.htmlspanner.handlers.listeners;

import android.text.style.URLSpan;
import android.view.View;

/**
 * @author dengyuhan
 *         created 2018/9/10 16:06
 */
public interface OnClickUrlListener {
    void onClickUrl(URLSpan span, View widget, String url);
}
