/*
 * Copyright (C) 2011 Alex Kuiper <http://www.nightwhistler.net>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.nightwhistler.htmlspanner.handlers;


import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;

import net.nightwhistler.htmlspanner.SpanStack;
import net.nightwhistler.htmlspanner.handlers.listeners.OnClickUrlListener;
import net.nightwhistler.htmlspanner.spans.URLStyleSpan;
import net.nightwhistler.htmlspanner.style.Style;

import org.htmlcleaner.TagNode;

/**
 * Creates clickable links.
 *
 * @author Alex Kuiper
 */
public class LinkHandler extends StyledTextHandler {
    private OnClickUrlListener mOnClickUrlListener;

    public LinkHandler setOnClickUrlListener(OnClickUrlListener listener) {
        this.mOnClickUrlListener = listener;
        return this;
    }

    @Override
    public void handleTagNode(TagNode node, SpannableStringBuilder builder, int start, int end, Style useStyle, SpanStack stack) {
        super.handleTagNode(node, builder, start, end, useStyle, stack);
        final String href = node.getAttributeByName("href");
        final String style = node.getAttributeByName("style");
        stack.pushSpan(new URLStyleSpan(href, TextUtils.isEmpty(style)) {
            @Override
            public void onClick(View widget) {
                if (mOnClickUrlListener == null || !mOnClickUrlListener.onClickUrl(widget, href)) {
                    super.onClick(widget);
                }
            }
        }, start, end);
    }


}