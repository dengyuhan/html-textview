### 新增的特性
1. 支持`<span>`;  
2. 支持`<a>`自定义URL点击事件;  
3. `<u>` `<strong>`等等其它文字类型的标签也支持style.  

### 已知的问题
1. 不支持`<table>`；
2. 不支持`<img>`；已在[7cd2f35](https://github.com/dengyuhan/html-textview/commit/7cd2f35127fdb5b474423e5cedd2e15d5343e796)支持
3. 嵌套`<ol>`、`<ul>`间距不正确；
4. `<li>`不支持样式。

### 导入
```
implementation 'com.dyhdyh.support:html-textview:3.6.1-beta6'
```
### 自定义URL点击事件  
```
//在setHtml之前调用
textView.setOnClickUrlListener(new OnClickUrlListener() {
    @Override
    public boolean onClickUrl(View widget, String url) {
        Toast.makeText(MainActivity.this, url, Toast.LENGTH_SHORT).show();
        return true;
    }

});
```
### 参考项目
[PrivacyApps/html-textview](https://github.com/PrivacyApps/html-textview)  
[NightWhistler/HtmlSpanner](https://github.com/NightWhistler/HtmlSpanner)


***

### New Features
1. added support for `<span>`;  
2. added `<a>` url custom click event;  
3. let `<u>` `<strong>` and other text type tags support Inline style.  

### Known Issues
1. `<table>` is not supported;
2. `<img>` is not supported;(it is supported in [7cd2f35](https://github.com/dengyuhan/html-textview/commit/7cd2f35127fdb5b474423e5cedd2e15d5343e796))
3. nested `<ol>`, `<ul>` spacing is incorrect;
4. `<li>` does not support styles.

### Import
```
implementation 'com.dyhdyh.support:html-textview:3.6.1-beta6'
```
### Custom URL ClickListener
```
//called before setHtml
textView.setOnClickUrlListener(new OnClickUrlListener() {
    @Override
    public boolean onClickUrl(View widget, String url) {
        Toast.makeText(MainActivity.this, url, Toast.LENGTH_SHORT).show();
        return true;
    }

});
```

### Reference
[PrivacyApps/html-textview](https://github.com/PrivacyApps/html-textview)  
[NightWhistler/HtmlSpanner](https://github.com/NightWhistler/HtmlSpanner)
