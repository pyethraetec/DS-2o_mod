<?php session_start(); ?>
<!DOCTYPE html>
<html>
<title>Acesso ao terouro</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-container w3-display-middle">
  <h2>Edição de Acesso ao Tesouro</h2>
	<?php
  $conexao = mysqli_connect("localhost","root","","teste");
      
  if($conexao == false){
    die("A conexão falhou!");
  }

  $consulta = mysqli_query($conexao,"SELECT * FROM usuarios WHERE email = '" . $_SESSION["email"]."'");
  
  $cadastro =  mysqli_fetch_assoc($consulta);
  ?>
  <form action="" method="post" class="w3-xlarge">
    <table>
      <tr>
        <td>Nome:</td>
        <td><input type="text" name="nome" required value="<?php echo $cadastro["nome"] ?>"></td>
      </tr>
      <tr>
        <td>E-mail:</td>
        <td><input type="email" name="email" required value="<?php echo $cadastro["email"] ?>"></td>
      </tr>
      <tr>
        <td>Senha:</td>
        <td><input type="text" name="senha" required value="<?php echo $cadastro["senha"] ?>"></td>
      </tr>
      <tr>
        <td>
          <br>
          <button onclick="document.getElementById('id01').style.display='block'" class="w3-button w3-green w3-large">Editar</button></td>
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

    $query = mysqli_query($conexao,"UPDATE usuarios SET nome = '$nome', email = '$email', senha = '$senha' WHERE email ='".$_SESSION["email"]."'");

    if($query == true){
      $_SESSION["email"] = $email;
      header("Location:tesouro.php");	
    }
    else{
      echo "Erro ao ALTERAR o cadastro!";
    }
  }
?>
	
</div>
</body>
</html>
