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
<body>

<div class="w3-display-middle">
  <img src="tesouro.png"><br>
  <a href="index.php" class="w3-button w3-blue">Home</a>
  <a href="sair.php" class="w3-button w3-red">Sair</a>
</div>
            
</body>
</html>
