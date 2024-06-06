
<?php
    session_start();
    $conexao = mysqli_connect("localhost","root","","teste");
      
    if($conexao == false){
      die("A conexão falhou!");
    }

    $query = mysqli_query($conexao,"DELETE FROM usuarios WHERE email = '". $_SESSION['email'] . "'");

    if($query == true){
      $_SESSION["logado"] = false;
      header("Location:index.php");	
    }
    else{
      echo "Erro ao excluir o cadastro!";
    }

?>
	