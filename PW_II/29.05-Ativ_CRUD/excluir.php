
<?php
    session_start();

    //conexão com banco
    $url = "localhost";
    $user = "root";
    $pass = "";
    $db = "test";

    $conexao = mysqli_connect($url, $user, $pass, $db);
          
    if($conexao == false){
       die("A conexão falhou!");
    }

    $query = mysqli_query($conexao,"DELETE FROM produtos WHERE Cod  = '". $_SESSION['Cod'] . "'");

    if($query == true){
      $_SESSION["Cod"] = false;
      header("Location:crud.php");	
    }
    else{
      echo "Erro ao excluir o cadastro!";
    }

?>
	