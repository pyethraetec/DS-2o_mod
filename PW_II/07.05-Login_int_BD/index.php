<?php session_start(); ?>
<!DOCTYPE html>
<html>
<title>Acesso ao terouro</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-container">
  <h2>Acesso ao tesouro</h2>
	
  <?php
  if(isset($_SESSION["logado"]) != true || $_SESSION["logado"] == false){
  ?>
  <button onclick="document.getElementById('id01').style.display='block'" class="w3-button w3-green w3-large">Acessar</button>
	<?php
  }
  else{
	?>
	<p>Você já está logado!</p>
	<br>
	<a href="sair.php" class="w3-button w3-red">Sair</a>
	
	<a href="tesouro.php" class="w3-button w3-amber">Ir ao Tesouro</a>
  <?php } ?>
  <div id="id01" class="w3-modal">

    <div class="w3-modal-content w3-card-4 w3-animate-zoom w3-round" style="max-width:600px">
  
      <div class="w3-center"><br>
        <div onclick="document.getElementById('id01').style.display='none'" class="w3-button w3-xlarge w3-transparent w3-display-topright" title="Fechar Modal">×</div>
      </div>
      <form class="w3-container" action="acessar.php" method="post">
        <div class="w3-section">
          <label><b>Usuario</b></label>
          <input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="Insira o Usuário" name="usuario" required>
          <label><b>Senha</b></label>
          <input class="w3-input w3-border" type="text" placeholder="Informe a Senha" name="senha" required>
          <button class="w3-button w3-block w3-green w3-section w3-padding" type="submit">Acessar</button>
        </div>
      </form>
    </div>

  </div>
    
<h6>Não tem cadastro? Clique <a href="./cadastro.php">aqui!</a></h6>
</div>

</body>
</html>
