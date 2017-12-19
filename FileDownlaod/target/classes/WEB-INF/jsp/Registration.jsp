<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
$(function(){
	$('.b1').click(function(){
		$(':button').hide();
	});
	
	$('input').blur(function(){
		alert("hahaha");
		$(this).css("color","red");
	});
	$('p').on({
	
		mouseenter : function(){
			
			$(this).css("color","red");
		},
		mouseleave : function(){
			
			$(this).css("color","green");
		},
		click : function(){
			
			$(this).hide(1000);
		}
	
	});
	$('#toggle').click(function(){
		$('p').toggle(2000);
	});
	
	$("#fi").click(function(){
		$("#p1").fadeIn();
		$("#p2").fadeIn("slow");
		$("#p3").fadeIn(3000);
	});
	
	 $("#fo").click(function(){
	        $("#div1").fadeOut();
	        $("#div2").fadeOut("slow");
	        $("#div3").fadeOut(3000);
	    });
	 
	 $("#ft").click(function(){
	        $("#p4").fadeToggle();
	        $("#p5").fadeToggle("slow");
	        $("#p6").fadeToggle(3000);
	    });
	 
	 $("#fTo").click(function(){
		 $("#div1").fadeTo(1000,0.6);
		 $("#div2").fadeTo(3000,0.45);
		 $("#div3").fadeTo(5000,0.7);
	    });
});

</script>

<body>

<a href="fileDownload">Download file</a>

<p>------------------------------------</p>
	<p id = "pId">ajksfbasfsbf</p>
	<p>hdfkhn fdsf</p>
	<p>safsdgfdsgs</p>
	<button class ="b1">hide text</button>
	<button id = "a1">abc</button>
<p>------------------------------------</p>
	<input type = "text" value = "asdfs"/> 
	
<p>------------------------------------</p>

<p>toggle event</p>

<button id="toggle">Toggle</button>

<p>------------------------------------</p>

<button id="fi">FadeIn</button>

<span id = "p1" style="display:none">hello1</span>
<span id = "p2" style="display:none">hello2</span>
<span id = "p3" style="display:none">hello3</span>



<p>------------------------------------</p>

<button id = "fo">Click to fade out boxes</button><br><br>
<p><button id="fTo">FadeTo</button></p>
<br>
<div id="div1" style="width:80px;height:80px;background-color:red;"></div><br>
<div id="div2" style="width:80px;height:80px;background-color:green;"></div><br>
<div id="div3" style="width:80px;height:80px;background-color:blue;"></div>

<p>------------------------------------</p>

<button id="ft">FadeToggle</button>

<span id = "p4" style="display:none">hello1</span>
<span id = "p5" style="display:none">hello2</span>
<span id = "p6" style="display:none">hello3</span>

<p>------------------------------------</p>

</body>