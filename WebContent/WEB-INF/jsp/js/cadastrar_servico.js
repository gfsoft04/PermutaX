var input = 1;
var campo = "habilidade" + input;

function mais() { 
	
	document.getElementById("div_habilidade").innerHTML+="input "+input+" - "+campo+
	" <input type='text' name='"+campo+"' value=''><br>"; 
	document.form.campo.value=""; 
	input++;
} 
