<?php
$usuario = $_POST["usuario"];
$senha = $_POST["senha"];

session_start();

$conexao = mysqli_connect("localhost","root","","teste");
	  
	  if($conexao == false){
		  die("A conexão falhou!");
	  }
	  
	  $query = mysqli_query($conexao,"SELECT * from usuarios WHERE email = '$usuario' AND senha = '$senha'");
	  

	  if(mysqli_num_rows($query) == 0){
		header("Location:index.php");		  
	  }
	  else{
		$_SESSION["logado"] = true;
		$_SESSION["email"] = $usuario;
		header("Location:tesouro.php");
	  }

?>