<?php

$url = "localhost";
$user = "root";
$pass = "";
$db = "usuarios";

//1° passo - conectar com o banco
$conexao = mysqli_connect($url, $user, $pass, $db);

//2° fazer a minha query (consulta/comando sql)
$query = mysqli_query($conexao,"SELECT email, senha from usuarios_cadastro");	

//3° exibir minha consulta 
while($linha = mysqli_fetch_array($query)){
	
}


$u=;
$s;

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

	if (mysql_num_rows($usuario)==0 and mysql_num_rows($senha)==0){
		echo "Login não encontrado, faça o cadastro!";
	} else {
		echo "login";
	}

?>