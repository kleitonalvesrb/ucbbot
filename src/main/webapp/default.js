
var inputShowContent = "";

function clearInput(){
	$('.inputShowed').val("");
}

function prepareSendMessage(){
	
	if($(".inputHidden").val().trim() == "" && $(".inputShowed").val().trim() != ""){
		transferInputData();
	}
	clearInput();
}

function transferInputData(){
	inputShowContent = $(".inputShowed").val();	
	$(".inputHidden").val(inputShowContent);
}

function sentMessage(data) {
	
	if(data.status == "begin"){
		$(".inputShowed").prop('readonly', true);
		$(".send_message").prop('disabled', true);
	}

	if (data.status == "success") {
		
		$('.inputHidden').val("");
		$(".inputShowed").prop('readonly', false);
		$(".send_message").prop('disabled', false);
		$(".inputShowed").focus();
		
		$(".messages").animate({ scrollTop: $('.messages').prop("scrollHeight")}, 500);
    }
}

function maximizeAna(){
	
	$("#anaMinimized").hide();
	$("#form").fadeIn("fast");
	
}

function minimizeAna(){
	$("#form").hide();
	$("#anaMinimized").fadeIn("fast");
}

function closeAna(){
	$("#form").fadeOut("fast");
	$("#anaMinimized").fadeOut("fast");
}
