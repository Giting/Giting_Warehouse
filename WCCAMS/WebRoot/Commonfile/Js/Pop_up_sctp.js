// JavaScript Document
/*-------------------------- +
  获取id, class, tagName
 +-------------------------- */
var get = {
	byId: function(id) {
		return typeof id === "string" ? document.getElementById(id) : id
	},
	byClass: function(sClass, oParent) {
		var aClass = [];
		var reClass = new RegExp("(^| )" + sClass + "( |$)");
		var aElem = this.byTagName("*", oParent);
		for (var i = 0; i < aElem.length; i++) reClass.test(aElem[i].className) && aClass.push(aElem[i]);
		return aClass
	},
	byTagName: function(elem, obj) {
		return (obj || document).getElementsByTagName(elem)
	}
};
var dragMinWidth = 500;
var dragMinHeight = 150;

//弹出层拖拽
function drag(oDrag, handle){
	var fade=document.getElementById('fade');
	var disX = dixY = 0;
	var oMin = get.byClass("min", oDrag)[0];
	handle = handle || oDrag;
	handle.style.cursor = "move";
	handle.onmousedown = function (event){
		var event = event || window.event;
		disX = event.clientX - oDrag.offsetLeft;
		disY = event.clientY - oDrag.offsetTop;
		
		document.onmousemove = function (event){
			var event = event || window.event;
			var iL = event.clientX - disX;
			var iT = event.clientY - disY;
			var maxL = document.documentElement.clientWidth - oDrag.offsetWidth;
			var maxT = document.documentElement.clientHeight - oDrag.offsetHeight;
			
			iL <= 0 && (iL = 0);
			iT <= 0 && (iT = 0);
			iL >= maxL && (iL = maxL);
			iT >= maxT && (iT = maxT);
			
			oDrag.style.left = iL + "px";
			oDrag.style.top = iT + "px";
			
			return false
		};
		
		document.onmouseup = function (){
			document.onmousemove = null;
			document.onmouseup = null;
			this.releaseCapture && this.releaseCapture()
		};
		this.setCapture && this.setCapture();
		return false
	};	
	
	//最小化按钮
	//oMin.onclick = function (){
//		oDrag.style.display = "none";
//		fade.style.display='none'; //隐藏遮罩层
//		var oA = document.createElement("a");
//		oA.className = "open";
//		oA.href = "javascript:;";
//		oA.title = "还原";
//		document.body.appendChild(oA);
//		oA.onclick = function ()
//		{
//			oDrag.style.display = "block";
//			document.body.removeChild(this);
//			this.onclick = null;
//		};
//	};
	
	//阻止冒泡
//	oMin.onmousedown = oMax.onmousedown = oClose.onmousedown =oCloseB.onmousedown = function (event){
//		this.onfocus = function () {this.blur()};
//		(event || window.event).cancelBubble = true	
//	};
}
/*-------------------------- +
  改变大小函数
 +-------------------------- */
function resize(oParent, handle, isLeft, isTop, lockX, lockY)
{
	handle.onmousedown = function (event)
	{
		var event = event || window.event;
		var disX = event.clientX - handle.offsetLeft;
		var disY = event.clientY - handle.offsetTop;	
		var iParentTop = oParent.offsetTop;
		var iParentLeft = oParent.offsetLeft;
		var iParentWidth = oParent.offsetWidth;
		var iParentHeight = oParent.offsetHeight;
		
		document.onmousemove = function (event)
		{
			var event = event || window.event;
			
			var iL = event.clientX - disX;
			var iT = event.clientY - disY;
			var maxW = document.documentElement.clientWidth - oParent.offsetLeft - 2;
			var maxH = document.documentElement.clientHeight - oParent.offsetTop - 2;			
			var iW = isLeft ? iParentWidth - iL : handle.offsetWidth + iL;
			var iH = isTop ? iParentHeight - iT : handle.offsetHeight + iT;
			
			isLeft && (oParent.style.left = iParentLeft + iL + "px");
			isTop && (oParent.style.top = iParentTop + iT + "px");
			
			iW < dragMinWidth && (iW = dragMinWidth);
			iW > maxW && (iW = maxW);
			lockX || (oParent.style.width = iW + "px");
			
			iH < dragMinHeight && (iH = dragMinHeight);
			iH > maxH && (iH = maxH);
			lockY || (oParent.style.height = iH + "px");
			
			if((isLeft && iW == dragMinWidth) || (isTop && iH == dragMinHeight)) document.onmousemove = null;
			
			return false;	
		};
		document.onmouseup = function ()
		{
			document.onmousemove = null;
			document.onmouseup = null;
		};
		return false;
	}
}
  //弹出层显示
  function show(tag){
	var oDrag = document.getElementById(tag);//获取弹出层id
	var fade=document.getElementById('fade');//获取遮罩层id
	oDrag.style.display='block'; //显示弹出层
	fade.style.display='block'; //显示遮罩层
	var oTitle = get.byClass("title", oDrag)[0];
	var oL = get.byClass("resizeL", oDrag)[0];
	var oT = get.byClass("resizeT", oDrag)[0];
	var oR = get.byClass("resizeR", oDrag)[0];
	var oB = get.byClass("resizeB", oDrag)[0];
	var oLT = get.byClass("resizeLT", oDrag)[0];
	var oTR = get.byClass("resizeTR", oDrag)[0];
	var oBR = get.byClass("resizeBR", oDrag)[0];
	var oLB = get.byClass("resizeLB", oDrag)[0];
	
	drag(oDrag, oTitle);
	//四角
	resize(oDrag, oLT, true, true, false, false);
	resize(oDrag, oTR, false, true, false, false);
	resize(oDrag, oBR, false, false, false, false);
	resize(oDrag, oLB, true, false, false, false);
	//四边
	resize(oDrag, oL, true, false, false, true);
	resize(oDrag, oT, false, true, true, false);
	resize(oDrag, oR, false, false, false, true);
	resize(oDrag, oB, false, false, true, false);
	
	oDrag.style.left = (document.documentElement.clientWidth - oDrag.offsetWidth) / 2 + "px";
	oDrag.style.top = (document.documentElement.clientHeight - oDrag.offsetHeight) / 2 + "px";
	
	var oClose = get.byClass("close", oDrag)[0];
	var oCloseB = get.byClass("closeB", oDrag)[0];
	
	//头部关闭按钮
	oClose.onclick=function(){
	  oDrag.style.display='none'; //隐藏弹出层
	  fade.style.display='none'; //隐藏遮罩层
		}
    //下侧关闭按钮
	oCloseB.onclick=function(){
	  oDrag.style.display='none'; //隐藏弹出层
	  fade.style.display='none'; //隐藏遮罩层
		}
		
	var oMax = get.byClass("max", oDrag)[0];
	var oRevert = get.byClass("revert", oDrag)[0];
	
	//最大化按钮
	oMax.onclick = function (){
		oDrag.style.top = oDrag.style.left = 0;
		oDrag.style.width = document.documentElement.clientWidth - 2 + "px";
		oDrag.style.height = document.documentElement.clientHeight - 2 + "px";
		this.style.display = "none";
		oRevert.style.display = "block";
	};
	//还原按钮
	oRevert.onclick = function (){		
		oDrag.style.width = dragMinWidth + "px";
		oDrag.style.height = dragMinHeight + "px";
		oDrag.style.left = (document.documentElement.clientWidth - oDrag.offsetWidth) / 2 + "px";
		oDrag.style.top = (document.documentElement.clientHeight - oDrag.offsetHeight) / 2 + "px";
		this.style.display = "none";
		oMax.style.display = "block";
	};
}
/*****************************************************************************************************************/
/*************************第二层显示********************************************************************************/
/*****************************************************************************************************************/
/*****************************************************************************************************************/
  //第二层弹出层显示
  function showT(tag){
	var Two = document.getElementById(tag);//获取弹出层id
	var fadeT=document.getElementById('fadeT');//获取遮罩层id
	Two.style.display='block'; //显示弹出层
	fadeT.style.display='block'; //显示遮罩层
	var oTitle = get.byClass("title", Two)[0];
	var oL = get.byClass("resizeL", Two)[0];
	var oT = get.byClass("resizeT", Two)[0];
	var oR = get.byClass("resizeR", Two)[0];
	var oB = get.byClass("resizeB", Two)[0];
	var oLT = get.byClass("resizeLT", Two)[0];
	var oTR = get.byClass("resizeTR", Two)[0];
	var oBR = get.byClass("resizeBR", Two)[0];
	var oLB = get.byClass("resizeLB", Two)[0];
	
	dragT(Two, oTitle);//拖拽
	//弹出层拉伸改变大小
	//四角
	resize(Two, oLT, true, true, false, false);
	resize(Two, oTR, false, true, false, false);
	resize(Two, oBR, false, false, false, false);
	resize(Two, oLB, true, false, false, false);
	//四边
	resize(Two, oL, true, false, false, true);
	resize(Two, oT, false, true, true, false);
	resize(Two, oR, false, false, false, true);
	resize(Two, oB, false, false, true, false);
	
	Two.style.left = (document.documentElement.clientWidth - Two.offsetWidth) / 2 + "px";
	Two.style.top = (document.documentElement.clientHeight - Two.offsetHeight) / 2 + "px";	
	
}
//第二层弹出层拖拽
function dragT(oDrag, handle){
	var fadeT=document.getElementById('fadeT');
	var disX = dixY = 0;
	var oMin = get.byClass("min", oDrag)[0];
	var oMax = get.byClass("max", oDrag)[0];
	var oRevert = get.byClass("revert", oDrag)[0];
	var oCloseT = get.byClass("closeT", oDrag)[0];
	var oCloseBT = get.byClass("closeBT", oDrag)[0];
	handle = handle || oDrag;
	handle.style.cursor = "move";
	handle.onmousedown = function (event){
		var event = event || window.event;
		disX = event.clientX - oDrag.offsetLeft;
		disY = event.clientY - oDrag.offsetTop;
		
		document.onmousemove = function (event){
			var event = event || window.event;
			var iL = event.clientX - disX;
			var iT = event.clientY - disY;
			var maxL = document.documentElement.clientWidth - oDrag.offsetWidth;
			var maxT = document.documentElement.clientHeight - oDrag.offsetHeight;
			
			iL <= 0 && (iL = 0);
			iT <= 0 && (iT = 0);
			iL >= maxL && (iL = maxL);
			iT >= maxT && (iT = maxT);
			
			oDrag.style.left = iL + "px";
			oDrag.style.top = iT + "px";
			
			return false
		};
		
		document.onmouseup = function (){
			document.onmousemove = null;
			document.onmouseup = null;
			this.releaseCapture && this.releaseCapture()
		};
		this.setCapture && this.setCapture();
		return false
	};	
	//最大化按钮    
	oMax.onclick = function (){
		oDrag.style.top = oDrag.style.left = 0;
		oDrag.style.width = document.documentElement.clientWidth - 2 + "px";
		oDrag.style.height = document.documentElement.clientHeight - 2 + "px";
		this.style.display = "none";
		oRevert.style.display = "block";
	};
	//还原按钮
	oRevert.onclick = function (){		
		oDrag.style.width = dragMinWidth + "px";
		oDrag.style.height = dragMinHeight + "px";
		oDrag.style.left = (document.documentElement.clientWidth - oDrag.offsetWidth) / 2 + "px";
		oDrag.style.top = (document.documentElement.clientHeight - oDrag.offsetHeight) / 2 + "px";
		this.style.display = "none";
		oMax.style.display = "block";
	};
	//头部关闭按钮
	oCloseT.onclick=function(){
	  oDrag.style.display='none'; //隐藏弹出层
	  fadeT.style.display='none'; //隐藏遮罩层
		}
    //下侧关闭按钮
	oCloseBT.onclick=function(){
	  oDrag.style.display='none'; //隐藏弹出层
	  fadeT.style.display='none'; //隐藏遮罩层
		}
	//阻止冒泡
//	oMax.onmousedown = oCloseT.onmousedown =oCloseBT.onmousedown = function (event){
//		this.onfocus = function () {this.blur()};
//		(event || window.event).cancelBubble = true	
//	};
}   