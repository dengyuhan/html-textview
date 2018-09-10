### 新增的特性
1. 支持`<span>`;  
2. 支持`<a>`自定义URL点击事件.  
3. `<u>` `<strong>`等等其它文字类型的标签也支持style.  

### 导入
```
implementation 'com.dyhdyh.support:html-textview:3.6.1-beta'
```
### 自定义URL点击事件.  
```
textView.setOnClickUrlListener(new OnClickUrlListener() {
    @Override
    public void onClickUrl(URLSpan span, String url) {
        Toast.makeText(MainActivity.this, url, Toast.LENGTH_SHORT).show();
    }

});
```
### 参考项目
[PrivacyApps/html-textview](https://github.com/PrivacyApps/html-textview)  
[NightWhistler/HtmlSpanner](https://github.com/NightWhistler/HtmlSpanner)

***

### New features
1. added support for `<span>`;  
2. added `<a>` url custom click event.  
3. let `<u>` `<strong>` and other text type tags support Inline style.  

### Import
```
implementation 'com.dyhdyh.support:html-textview:3.6.1-beta'
```
### Custom URL ClickListener
```
textView.setOnClickUrlListener(new OnClickUrlListener() {
    @Override
    public void onClickUrl(URLSpan span, String url) {
        Toast.makeText(MainActivity.this, url, Toast.LENGTH_SHORT).show();
    }

});
```

### Reference
[PrivacyApps/html-textview](https://github.com/PrivacyApps/html-textview)  
[NightWhistler/HtmlSpanner](https://github.com/NightWhistler/HtmlSpanner)