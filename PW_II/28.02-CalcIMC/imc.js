
    var peso, altura, resultado;
	peso = document.getElementById("peso");
	altura = document.getElementById("altura");
	resultado = document.getElementById("n3");
	IMC = document.getElementById("IMC");
		
function validar(){
	//manipulando um css com js
	peso.style="";
	altura.style="";
	if(peso.value == ""){
		peso.style="border:2px solid red;";
		return false;
	}
	else{
		if(altura.value == ""){
			altura.style="border:2px solid red;";
			return false;
		}
	}
	return true;
}

// Peso / (Altura x Altura) 

function Calcular(){
	let sair = validar();
	
	if(sair == false){
		return false;
	}
	else{

        resultado.value = peso.value / (altura.value*altura.value);
	}

	if (resultado.value <=18){
		IMC.value = "Valores menores que 18 kg/m² – Consideradas pessoas de baixo peso.";
	} else if (resultado.value >= 18 && resultado.value <= 24) {
		IMC.value = "Valores entre 18-24 kg/m² – consideradas IMC de pessoas normais.";
	}  else if (resultado.value >= 25 && resultado.value <= 30) {
		IMC.value = "Entre 25-30 kg/m² – consideradas pessoas com sobrepeso.";
	}   else if (resultado.value >= 35 && resultado.value<= 40) {
		IMC.value = "Entre 35-40 kg/m² – consideradas pessoas com sobrepeso.";
	} 	else if (resultado.value >= 40) {
		IMC.value = "Valores > 40kg/m² – pessoas com obesidade grave.";
	}	else if (resultado.value >= 50) {
		IMC.value = "Maiores que 50 kg/m² – pessoas com obesidade gravíssima.";
	}
}