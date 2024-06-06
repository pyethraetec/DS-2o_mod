<?php session_start(); ?>
<!DOCTYPE html>
<html>
<title>Acesso ao terouro</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-container w3-display-middle">
  <h2>Cadastro de Acesso ao Tesouro</h2>
	
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
<?php
  if(isset($_POST["nome"])){

    $nome = $_POST["nome"];
    $email = $_POST["email"];
    $senha = $_POST["senha"];

    $conexao = mysqli_connect("localhost","root","","teste");
      
    if($conexao == false){
      die("A conexão falhou!");
    }

    $query = mysqli_query($conexao,"INSERT INTO usuarios(nome,email,senha) VALUES('$nome','$email','$senha')");

    if($query == true){
      header("Location:index.php");	
    }
    else{
      echo "Erro ao efetuar o cadastro!";
    }
  }
?>
	
</div>
</body>
</html>
