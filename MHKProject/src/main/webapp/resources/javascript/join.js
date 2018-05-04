
/*
 * join.jsp
 */

$(function(){
	$('#duplicate').on('click', function(){
			
		var joinId = document.getElementById('joinId').value;
		
		$.ajax({
			url : "idDuplication"
			, type : "POST"
			, data : joinId
			, contentType : "application/json; charset=utf-8"
			, dataType : "text"
			, success : function(result){
				var message = '';
				if (result == "true"){
					message = '<p id="result" style="color: lime;" value="true">This ID can be used.</p>';	
				} else if (result == "false") {
					message = '<p id="result" style="color: red;" value="false">This ID can not be used.</p>';
				}
				$('#idResult').html(message);
			}
			, error : function(err){
				
			}
		});

	});
	
});


function joinFormCheck(){
	var joinId = document.getElementById('joinId').value;
	var joinPw = document.getElementById('joinPw').value;
	var joinPwc = document.getElementById('joinPwc').value;
	var joinName = document.getElementById('joinName').value;
	var joinEmail = document.getElementById('joinEmail').value;
	var joinPhone = document.getElementById('joinPhone').value;
	var joinGender = document.getElementByName('joinGender').value;
	var joinAddress = document.getElementById('joinAddress').value;
	var joinField = document.getElementByName('joinField').value;
	var joinWT = document.getElementById('joinWT').value;
	var joinPayment = document.getElementById('joinPayment').value;
	var joinCD = document.getElementById('joinCD').value;
	var joinRN = document.getElementById('joinRN').value;

	if(joinId.length == 0 || joinPw.length == 0 ||
			joinPwc.length == 0 || joinName.length == 0 ||
			joinEmail.length == 0 || joinPhone.length == 0 ||
			joinGender == null || joinAddress.length == 0 ||
			joinField == null || joinWT.length == 0 ||
			joinPayment.length == 0 || joinCD.length == 0 ||
			joinRN.length == 0){
		alert('Fill the blanks.');
		return false;
	}
	
	if(joinPw != joinPwc){
		alert('Password is not identical.\nCheck the password.');
		return false;
	}
	
	if(isNaN(joinPhone)){
		alert('Enter only numbers.');
		document.getElementById('joinPhone').focus();
		return false;
	} else if(isNaN(joinWT)){
		alert('Enter only numbers.');
		document.getElementById('joinWT').focus();
		return false;
	} else if (isNaN(joinPayment)){
		alert('Enter only numbers.');
		document.getElementById('joinPayment').focus();
		return false;
	} else if (isNaN(joinCD)){
		alert('Enter only numbers.');
		document.getElementById('joinCD').focus();
		return false;
	} else if (joinGender == null) {
		alert('Select one in gender.');
		return false;
	} 
	

}

/*
 * joinComplete.jsp
 */
function home(){
	location.href="joinFinish";
}

