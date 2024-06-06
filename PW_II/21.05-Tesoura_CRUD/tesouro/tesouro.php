<?php 
	session_start(); 
	if(isset($_SESSION["logado"]) != true || $_SESSION["logado"] == false){
		header("Location:index.php");
	}
?>
<!DOCTYPE html>
<html>
<title>Acessou o tesouro!!</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>

.anime {
    
	animation: pulse 1s linear infinite;
	width: 300px;
}

@-webkit-keyframes "pulse" {
0% {
 -webkit-transform: scale(1.1);
 transform: scale(1.1);
}
50% {
-webkit-transform: scale(0.8);
transform: scale(0.8);
}
100% {
 -webkit-transform: scale(1);
transform: scale(1);
}
}
</style>
<body>

<div class="w3-container w3-display-middle w3-center">
  <img src="tesouro.png" class="anime"><br>

  <div class="w3-small">
	<a href="index.php" class="w3-button w3-blue">Home</a>

	<a href="editar.php" class="w3-button w3-orange">Editar Cadastro</a>
	<a href="excluir.php" class="w3-button w3-red">Excluir Cadastro</a>

	<a href="sair.php" class="w3-button w3-gray">Sair</a>
	</div>
</div>
            
</body>
</html>
