<?php
$u = "tesouro";
$s = "123";

$usuario = $_POST["usuario"];
$senha = $_POST["senha"];

session_start();

if($usuario == $u && $senha == $s){
	
	$_SESSION["logado"] = true;
	header("Location:tesouro.php");
}
else{
	header("Location:index.php");
}
?>