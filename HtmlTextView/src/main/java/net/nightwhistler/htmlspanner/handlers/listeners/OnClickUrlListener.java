package net.nightwhistler.htmlspanner.handlers.listeners;

import android.view.View;

/**
 * @author dengyuhan
 *         created 2018/9/10 16:06
 */
public interface OnClickUrlListener {
    /**
     * @param widget
     * @param url
     * @return true消费掉事件, false不消费事件
     */
    boolean onClickUrl(View widget, String url);
}
