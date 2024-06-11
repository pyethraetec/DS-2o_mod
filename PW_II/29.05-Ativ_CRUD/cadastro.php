<?php session_start(); ?>
<!DOCTYPE html>
<html>
<title>Cadastro de produtos
</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-container w3-display-middle">
  <h2>Cadastro de Acesso ao Tesouro</h2>
	
<!--Forms de cadastro-->

<!--
  Código
  Produto
  Quantidade
  Preço
  Ação
-->
  <form action="" method="post" class="w3-xlarge">
    <table>
      <tr>
        <td>Produto:</td>
        <td><input type="text" name="Produto" required></td>
      </tr>
      <tr>
        <td>Quantidade:</td>
        <td><input type="number" name="Quant" required></td>
      </tr>
      <tr>
        <td>Preço:</td>
        <td><input type="number" step="0.01" name="Preco" required></td>
      </tr>
      <tr>
        <td>
          <br>
          <input type="submit" value="Cadastrar" class="w3-button w3-green w3-large"></td>
        <td align="right">
          <br>
          <a href="./crud.php" class="w3-button w3-red w3-large">Voltar ao Início</a></td>
      </tr>
    </table>
  </form>


<?php

    //get propriedades do forms pro banco
  if(isset($_POST["Produto"])){
    $Produto = $_POST["Produto"];
    $Quant = $_POST["Quant"];
    $Preco = $_POST["Preco"];

    //conexão com banco
    $url = "localhost";
    $user = "root";
    $pass = "";
    $db = "teste";

    $conexao = mysqli_connect($url, $user, $pass, $db);
          
    if($conexao == false){
       die("A conexão falhou!");
    }

    $query;

     //inserindo no banco 
    $query = mysqli_query($conexao,"INSERT INTO produtos (Produto, Quant, Preco) VALUES('$Produto','$Quant','$Preco')");

    //testando se o insert deu certo
    if($query == true){
      header("Location:crud.php");	
    }
    else{
      echo "Erro ao efetuar o cadastro!";
    }
  }
?>
	
</div>
</body>
</html>
