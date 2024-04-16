<?php
$url = "localhost";
$user = "root";
$pass = "";
$db = "teste";

//1° passo - conectar com o banco
$conexao = mysqli_connect($url, $user, $pass, $db);

//2° fazer a minha query (consulta/comando sql)
$query = mysqli_query($conexao,"SELECT curso,periodo from cursos");	

//3° exibir minha consulta 
while($linha = mysqli_fetch_array($query)){
	echo $linha["curso"] . " - " . $linha["periodo"]. "<br>";
}
?>