package net.nightwhistler.htmlspanner.spans;

import android.os.Parcel;
import android.text.TextPaint;
import android.text.style.URLSpan;

/**
 * 可以控制是否需要默认样式的urlspan
 * @author dengyuhan
 *         created 2018/9/10 17:06
 */
public class URLStyleSpan extends URLSpan {
    private boolean mDefaultStyleEnable;

    public URLStyleSpan(String url, boolean defaultStyleEnable) {
        super(url);
        this.mDefaultStyleEnable = defaultStyleEnable;
    }

    public URLStyleSpan(Parcel src, boolean defaultStyleEnable) {
        super(src);
        this.mDefaultStyleEnable = defaultStyleEnable;
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        if (mDefaultStyleEnable) {
            super.updateDrawState(ds);
        }
    }
}
