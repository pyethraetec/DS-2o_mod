<?php session_start(); ?>
<!DOCTYPE html>
<html>
<title>Acesso ao terouro</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-container w3-display-middle">
  <h2>Editar produtos</h2>
	
<!--Forms de cadastro-->
  <form action="" method="post" class="w3-xlarge">
    <table>
      <tr>
        <td>Nome:</td>
        <td><input type="text" name="nome" required></td>
      </tr>
      <tr>
        <td>E-mail:</td>
        <td><input type="email" name="email" required></td>
      </tr>
      <tr>
        <td>Senha:</td>
        <td><input type="password" name="senha" required></td>
      </tr>
      <tr>
        <td>
          <br>
          <button onclick="document.getElementById('id01').style.display='block'" class="w3-button w3-green w3-large">Cadastrar</button></td>
        <td align="right">
          <br>
          <a href="index.php" class="w3-button w3-red w3-large">Voltar ao Início</a></td>
      </tr>
    </table>
  </form>

  <!--Protocolando cadastros no banco-->
<?php
  if(isset($_POST["nome"])){

    $Produtos = $_POST["Produtos"];
    $email = $_POST["email"];
    $senha = $_POST["senha"];

      $url = "localhost";
      $user = "root";
      $pass = "";
      $db = "test";

      //1° passo - conectar com o banco
      $conexao = mysqli_connect($url, $user, $pass, $db);
      
    if($conexao == false){
      die("A conexão falhou!");
    }

    $query = mysqli_query($conexao,"INSERT INTO produtos(Produtos, Quant, Preco) VALUES('$Produtos','$Quant','$Preco')");

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
