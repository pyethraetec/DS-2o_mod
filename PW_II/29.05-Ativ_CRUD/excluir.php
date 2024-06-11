
<?php
    session_start();

    //conexão com banco
    $url = "localhost";
    $user = "root";
    $pass = "";
    $db = "teste";

    $conexao = mysqli_connect($url, $user, $pass, $db);
          
    if($conexao == false){
       die("A conexão falhou!");
    }

    $query = mysqli_query($conexao," DELETE FROM produtos WHERE cod  = ".$_GET["cod"]);

    if($query == true){
      header("Location:crud.php");	
    }
    else{
      echo "Erro ao excluir o cadastro!";
    }

?>
	