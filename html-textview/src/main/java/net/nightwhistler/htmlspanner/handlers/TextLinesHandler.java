package net.nightwhistler.htmlspanner.handlers;

import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;

import net.nightwhistler.htmlspanner.SpanStack;
import net.nightwhistler.htmlspanner.style.Style;

import org.htmlcleaner.TagNode;

/**
 * 文字划线
 * author  dengyuhan
 * created 2018/9/10 15:28
 */
public class TextLinesHandler extends StyledTextHandler {

    public TextLinesHandler() {
        super();
    }

    public TextLinesHandler(Style style) {
        super(style);
    }

    @Override
    public void handleTagNode(TagNode node, SpannableStringBuilder builder,
                              int start, int end, Style style, SpanStack spanStack) {
        if (style.getTextLinesStyle() == Style.TextLinesStyle.OVERLINE) {
            Log.e("TextLinesHandler", "暂不不支持上划线");
        } else if (style.getTextLinesStyle() == Style.TextLinesStyle.LINE_THROUGH) {
            spanStack.pushSpan(new StrikethroughSpan(), start, end);
        } else if (style.getTextLinesStyle() == Style.TextLinesStyle.UNDERLINE) {
            spanStack.pushSpan(new UnderlineSpan(), start, end);
        }

        super.handleTagNode(node, builder, start, end, style, spanStack);
    }


}