<html>
	<head>
		
	</head>
	
	<body>
		<h4>Resultado IMC</h4>
		<?php
			$altura = $_POST["Altura"];
			$peso = $_POST["Peso"];

			$resultado = $peso/($altura*$altura);
			
			echo $resultado;
		?>

		<br><br>

		<?php	
		 if ($resultado <=18){
			echo "Valores menores que 18 kg/m² – Consideradas pessoas de baixo peso.";
		} else if ($resultado >= 18 && $resultado <= 24) {
			echo "Valores entre 18-24 kg/m² – consideradas IMC de pessoas normais.";
		}  else if ($resultado >= 25 && $resultado <= 30) {
			echo "Entre 25-30 kg/m² – consideradas pessoas com sobrepeso.";
		}   else if ($resultado >= 35 && $resultado<= 40) {
			echo "Entre 35-40 kg/m² – consideradas pessoas com sobrepeso.";
		} 	else if ($resultado >= 40) {
			echo "Valores > 40kg/m² – pessoas com obesidade grave.";
		}	else if ($resultado >= 50) {
			echo "Maiores que 50 kg/m² – pessoas com obesidade gravíssima.";
		 }
		?>
		<br><br>
		<button><a href="CalcIMC.php">Voltar</a></button>
	</body>
</html>