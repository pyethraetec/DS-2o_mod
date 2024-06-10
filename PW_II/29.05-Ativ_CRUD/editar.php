<?php session_start(); ?>
<!DOCTYPE html>
<html>
<title>Produtos</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-container w3-display-middle">
  <h2>Edição de produtos</h2>

<?php

$url = "localhost";
$user = "root";
$pass = "";
$db = "test";

//1° passo - conectar com o banco
$conexao = mysqli_connect($url, $user, $pass, $db);

  if($conexao == false){
    die("A conexão falhou!");
  }
  $Cod = $_GET["Cod"];
  
  $consulta = mysqli_query($conexao,"SELECT * FROM produtos WHERE Cod = '" . $_SESSION["Cod"]."'");
  
  $cadastro =  mysqli_fetch_assoc($consulta);
  
  ?>
  <form action="" method="post" class="w3-xlarge">
    <table>
      <tr>
        <td>Cod:</td>
        <td><input type="int" name="Cod" required value="<?php echo $cadastro["Cod"] ?>"></td>
      </tr>
      <tr>
        <td>Produto:</td>
        <td><input type="text" name="Produto" required value="<?php echo $cadastro["Produto"] ?>"></td>
      </tr>
      <tr>
        <td>Quant:</td>
        <td><input type="int" name="Quant" required value="<?php echo $cadastro["Quant"] ?>"></td>
      </tr>
      <tr>
        <td>Preço:</td>
        <td><input type="double" name="Preco" required value="<?php echo $cadastro["Preco"] ?>"></td>
      </tr>
      <tr>
        <td>
          <br>
          <button onclick="document.getElementById('id01').style.display='block'" class="w3-button w3-green w3-large">Editar</button></td>
        <td align="right">
          <br>
          <a href="crud.php" class="w3-button w3-red w3-large">Voltar ao Início</a></td>
      </tr>
    </table>
  </form>

<?php
  
  if(isset($_POST["Cod"])){

    $Produto = $_POST["Produto"];
    $Quant = $_POST["Quant"];
    $Preco = $_POST["Preco"];

    $query = mysqli_query($conexao,"UPDATE usuarios SET Produto = '$Produto', Quant = '$Quant', Preco = '$Preco'  WHERE Cod ='".$_SESSION["Cod"]."'");

    if($query == true){
      $_SESSION["Cod"] = $Cod;
      header("Location:crud.php");	
    }
    else{
      echo "Erro ao ALTERAR o produto!";
    }
  }
?>
	
</div>
</body>
</html>
