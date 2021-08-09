$(document).ready(function(){
	$("#button").click(function(){
		var input_url = $("#url").val();
		var url = "./GetUrlServlet";
		htmlobj = $.ajax({url:url,data:{ input_url: input_url},async:false});
		$('#runmp3').html(htmlobj.responseText);
		$("#mp3").css("display","block");
	});
});