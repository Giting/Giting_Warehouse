$(function(){
	$("#tab1").click(function(){
		document.getElementById("F_Newbottom").style.display="";
		$('#F_Newbottom').window({    
		    width:800,    
		    height:400,    
		    modal:true   
		}); 
	});
	
});