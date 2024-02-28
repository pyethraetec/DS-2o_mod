
    var peso, altura, resultado;
	peso = document.getElementById("peso");
	altura = document.getElementById("altura");
	resultado = document.getElementById("n3");
		
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

        resultado.value = (parseInt(peso.value) / (parseInt(altura.value)*parseInt(altura.value)))
	}
}

function nivel(){
	switch (true) {

		case (Calcular <= 18) :
			console.log ("Valores menores que 18 kg/m² – Consideradas pessoas de baixo peso.");
		break;
		
		case (Calcular >= 18 && Calcular <= 24):
			console.log ("Valores entre 18-24 kg/m² – consideradas IMC de pessoas normais.");
		break;
		
		case (Calcular >= 25 && Calcular <= 30):
			console.log ("Entre 25-30 kg/m² – consideradas pessoas com sobrepeso.");
		break;

		case (Calcular >= 35 && Calcular<= 40):
			console.log ("Entre 25-30 kg/m² – consideradas pessoas com sobrepeso.");
		break;

		case (Calcular >= 40):
			console.log ("Valores > 40kg/m² – pessoas com obesidade grave.");
		break;

		case (Calcular >= 50):
			console.log ("Maiores que 50 kg/m² – pessoas com obesidade gravíssima.");
		break;
	}
}

