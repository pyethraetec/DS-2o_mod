//variáveis globais, podem ser lidas de qlq lugar
var var1, var2, var3;
	var1 = document.getElementById("n1");
	var2 = document.getElementById("n2");
	var3 = document.getElementById("n3");
		
function validar(){
	//manipulando um css com js
	var1.style="";
	var2.style="";
	if(var1.value == ""){
		var1.style="border:2px solid red;";
		return false;
	}
	else{
		if(var2.value == ""){
			var2.style="border:2px solid red;";
			return false;
		}
	}
	return true;
}

function somar(){
	let sair = validar();
	
	if(sair == false){
		return false;
	}
	else{
		var3.value = parseInt(var1.value) + parseInt(var2.value);
	}
}

function dividir(){
	let sair = validar();
	var2.style="";
	
	if(sair == false){
		return false;
	}
	else{
		if(var2.value == 0){
			var2.style="border:2px solid red;";
			alert("Impossivel divisao por ZERO");
		}
		else{
			var3.value = parseInt(var1.value) / parseInt(var2.value);
		}
	}
}

function multiplicar(){
	let sair = validar();
	
	if(sair == false){
		return false;
	}
	else{
		var3.value = parseInt(var1.value) * parseInt(var2.value);
	}
}