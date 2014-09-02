	$(function(){
			var numInput = $(".cy_jjInputNum")
			for(var i = 0; i < numInput.length; i++){
				numInput.eq(i)
				.append("<input type='text' /><a class='jia'>+</a><a class='jian'>-</a>")
				.css({
					"width":numInput.eq(i).attr("width"),
					"height":numInput.eq(i).attr("height")
				});
				numInput.eq(i).find("input").css({
					"width":numInput.eq(i).attr("width") - numInput.eq(i).attr("butWidth") - 11 ,//减去 input 左右的 margin 值
					"height":numInput.eq(i).attr("height") - 10 ,//减去 input 上下的 margin 值
				}).attr("id",numInput.eq(i).attr("inputId")).val(numInput.eq(i).attr("min"));
				numInput.eq(i).find("a").css({
					"width":numInput.eq(i).attr("butWidth"),
					"height":numInput.eq(i).attr("height") / 2,
					"line-height":numInput.eq(i).attr("height") / 2 + "px",
				})
				.first().css({
					"top":"0"
				})
				.next().css({
					"bottom":"-1px"
				});
			};
			$(".cy_jjInputNum input").keyup(function () {
				$(this).val($(this).val().replace(/\D/g, ''));//只能填写数字正则
				if ($(this).val() < $(this).parent().attr("min") || $(this).val() == "") {
					$(this).val("0");
				}else if($(this).val() > $(this).parent().attr("max")){
					$(this).val($(this).parent().attr("max"));
				};
				$(this).attr("value",$(this).val())
			});
			/*--
			点击加号减号的方法
			
			--*/
			$(".cy_jjInputNum a").click(function () {
				if ($(this).attr("class") == "jian"){
					if($(this).parent().attr("min") != "" && $(this).parent().attr("max") != null){
						if ($(this).parent().find("input").val() > $(this).parent().attr("min")) {
							$(this).parent().find("input").val($(this).parent().find("input").val() - 1);
						}else{
							alert("最小数量为 " + $(this).parent().attr("min") + " !")
						}
					}
				} else {
					if($(this).parent().attr("max") != "" && $(this).parent().attr("max") != null){
						if ($(this).parent().find("input").val() < new Number($(this).parent().attr("max"))){
								$(this).parent().find("input").val(new Number($(this).parent().find("input").val()) + 1);
							}else{
								alert("最大数量为 " + $(this).parent().attr("max") + " !")
							}
					}else{
						$(this).parent().find("input").val(new Number($(this).parent().find("input").val()) + 1);
					};
				};
				$(this).parent().find("input").attr("value",$(this).parent().find("input").val())
			});
		});