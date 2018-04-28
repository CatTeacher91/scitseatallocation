!function(window,document,undefined){function IUSearch(){this.settings={CX:{},attributes:{resultsUrl:"/search"},opts:{cx:"",language:"en",theme:"V2_DEFAULT",uiOptions:{enableAutoComplete:!0,enableImageSearch:!1,imageSearchLayout:"popup",resultSetSize:"filtered_cse",enableOrderBy:!0,orderByOptions:[{label:"Relevance",key:""},{label:"Date",key:"date"}],overlayResults:!1,refinementStyle:"tab",webSearchSafesearch:"google.search.Search.SAFESEARCH_MODERATE",queryParameterName:"q",enableMobileLayout:!1,numTopRefinements:-1,showBookmarkLink:!1,isSitesearch:!1,enableSpeech:!0},protocol:"http",uds:"www.google.com",rawCss:"\n"},searchBoxIDs:["search"],wrapClass:"row pad"},this.searchState="closed"}!function(a,b){"function"==typeof define&&define.amd?define(b):"object"==typeof exports?module.exports=b:a.apollo=b()}(this,function(){"use strict";var a,b,c,d,e={},f=function(a,b){"[object Array]"!==Object.prototype.toString.call(a)&&(a=a.split(" "));for(var c=0;c<a.length;c++)b(a[c],c)};return"classList"in document.documentElement?(a=function(a,b){return a.classList.contains(b)},b=function(a,b){a.classList.add(b)},c=function(a,b){a.classList.remove(b)},d=function(a,b){a.classList.toggle(b)}):(a=function(a,b){return new RegExp("(^|\\s)"+b+"(\\s|$)").test(a.className)},b=function(b,c){a(b,c)||(b.className+=(b.className?" ":"")+c)},c=function(b,c){a(b,c)&&(b.className=b.className.replace(new RegExp("(^|\\s)*"+c+"(\\s|$)*","g"),""))},d=function(d,e){(a(d,e)?c:b)(d,e)}),e.hasClass=function(b,c){return a(b,c)},e.addClass=function(a,c){f(c,function(c){b(a,c)})},e.removeClass=function(a,b){f(b,function(b){c(a,b)})},e.toggleClass=function(a,b){f(b,function(b){d(a,b)})},e}),IUSearch.prototype.updateObject=function(a,b,c){for(var d=c.split(".");d.length>1;)a=a[d.shift()];a[d.shift()]=b},IUSearch.prototype.extend=function(a,b){var c,d={};for(c in a)Object.prototype.hasOwnProperty.call(a,c)&&(d[c]=a[c]);for(c in b)Object.prototype.hasOwnProperty.call(b,c)&&(d[c]=b[c]);return d},IUSearch.prototype.gcsCallback=function(){var a=this;"complete"==document.readyState||"interactive"==document.readyState?a.renderSearch&&a.renderSearch():google.setOnLoadCallback(function(){a.renderSearch&&a.renderSearch()},!0)},IUSearch.prototype.renderSearch=function(){var a=this;a.renderSearchElements&&a.renderSearchElements(),a.renderInlineSearch&&a.renderInlineSearch()},IUSearch.prototype.renderSearchElements=function(){var a=this;for(var b in this.settings.searchBoxIDs)google.search.cse.element.render({div:this.settings.searchBoxIDs[b],tag:"searchbox-only",attributes:a.settings.attributes});var c=document.getElementById("search");if(null!==c){var d=document.createElement("div");for(c.appendChild(d).setAttribute("class",a.settings.wrapClass);c.firstChild!==d;)d.appendChild(c.firstChild)}a.initToggle();var e=document.querySelectorAll("form.search-toggle");e.length&&e[0].parentElement.removeChild(e[0])},IUSearch.prototype.renderInlineSearch=function(){var a=this;google.search.cse.element.render({div:"inline-search",tag:"search",attributes:a.settings.attributes,gname:"inline"}),a.updateStyles()},IUSearch.prototype.initRadios=function(){for(var a=this,b=document.getElementsByName("searchToggle"),c=0;c<b.length;c++)b[c].onclick=function(){window.ga&&window.ga.loaded&&ga("send","event","Search Toggle","click","Value: "+this.value),a.toggleSearch(this.value)}},IUSearch.prototype.initToggle=function(){for(var a=this,b=document.querySelectorAll("a.search-toggle"),c=document.getElementsByTagName("body"),d=0;d<b.length;d++)b[d].addEventListener("click",function(b){var d="closed"==a.searchState?"Close Search":"Search";a.searchState="opened"==a.searchState?"closed":"opened",a.toggleSearchInputs(),this.innerHTML=d,apollo.toggleClass(c[0],"search-open"),b.preventDefault()})},IUSearch.prototype.toggleSearchInputs=function(){var a=this,b=document.getElementById("search");if(null!==b)for(var c=b.getElementsByTagName("input"),d=0;d<c.length;d++)c[d].disabled="opened"!=a.searchState},IUSearch.prototype.updateStyles=function(){var a=document.querySelectorAll("input.gsc-search-button");for(i=0;i<a.length;i++)a[i].type="submit",a[i].value="Go";var b=document.querySelectorAll("img.gsc-branding-img");for(i=0;i<b.length;i++)b[i].alt="Google logo"},IUSearch.prototype.removeSearchBoxes=function(){var a=["inline-search"];for(index=0;index<a.length;++index)for(var b=document.getElementById(a[index]);b.firstChild;)b.removeChild(b.firstChild)},IUSearch.prototype.deleteInstance=function(){var initFunc=String(google.search.cse.element.init),getReturn=/return\s([a-z\[\]A-Z\.\$]*)(?=\?)/,instanceCheck=initFunc.match(getReturn)[1],arr=instanceCheck.split("."),instance=arr.pop(),obj=eval(arr.join("."));delete obj[instance]},IUSearch.prototype.toggleSearch=function(a){var b=this,c=google.search.cse.element.getElement("inline"),d=c.getInputQuery();b.removeSearchBoxes(),b.deleteInstance(),b.settings.opts.cx=b.settings.CX[a],google.search.cse.element.init(b.settings.opts),b.renderInlineSearch();var c=google.search.cse.element.getElement("inline");c.prefillQuery(d),c.execute(d)},IUSearch.prototype.init=function(a){var b=this;b.settings=b.extend(b.settings,a),window.__gcse={parsetags:"explicit",callback:b.gcsCallback.bind(b)};var c=document.createElement("script");c.type="text/javascript",c.async=!0,c.src=("https:"==document.location.protocol?"https:":"http:")+"//www.google.com/cse/cse.js?cx="+b.settings.CX.site;var d=document.getElementsByTagName("script")[0];d.parentNode.insertBefore(c,d)},window.IUSearch=new IUSearch}(window,window.document);