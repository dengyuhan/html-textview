### 新增的特性
1. 支持`<span>`;  
2. 支持`<a>`自定义URL点击事件;  
3. `<u>` `<strong>`等等其它文字类型的标签也支持style.  

### 已知的问题
1. 不支持`<table>`;
2. 不支持`<img>`;
3. `<ol>`、`<ol>`样式兼容性不太好.

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
2. `<img>` is not supported;
3. `<ol>`, `<ol>` style compatibility is not very good.

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
