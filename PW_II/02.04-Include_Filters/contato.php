<!DOCTYPE html>
<html>
<head>
<title>Contato</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html,body,h1,h2,h3,h4,h5,h6 {font-family: "Roboto", sans-serif;}
.w3-sidebar {
  z-index: 3;
  width: 250px;
  top: 43px;
  bottom: 0;
  height: inherit;
}
</style>
</head>
<body>

<?php 
	require 'menu.php';
?>



<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>


<div class="w3-main">

  <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-teal">Contato</h1>
      <form action="" method="post">
		  Nome: <input type="text" name="nome"><br><br>
		  E-mail: <input type="text" name="email"><br><br>
		  Mensagem:<br>
		  <textarea name="mensagem"></textarea>
		  <br><br>
		  <input type="submit" value="Enviar" class="w3-button w3-gray" />
	  </form>
    </div>
	
	<div class="w3-twothird w3-container">
	<?php
	if(isset($_POST["nome"])){
		$nome = $_POST["nome"];
		$email = $_POST["email"];
		$email = filter_var($email,FILTER_SANITIZE_EMAIL);
		$mensagem = $_POST["mensagem"];
		
		echo "<p>$nome</p>";
		echo "<p>$email</p>";
		echo "<p>$mensagem</p>";
		
	}
	?>
	</div>
    
  </div>


  <footer id="myFooter">
    <div class="w3-container w3-theme-l2 w3-padding-32">
      <h4>Footer</h4>
    </div>

    <div class="w3-container w3-theme-l1">
      <p>Powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank">w3.css</a></p>
    </div>
  </footer>

<!-- END MAIN -->
</div>

<script>
// Get the Sidebar
var mySidebar = document.getElementById("mySidebar");

// Get the DIV with overlay effect
var overlayBg = document.getElementById("myOverlay");

// Toggle between showing and hiding the sidebar, and add overlay effect
function w3_open() {
  if (mySidebar.style.display === 'block') {
    mySidebar.style.display = 'none';
    overlayBg.style.display = "none";
  } else {
    mySidebar.style.display = 'block';
    overlayBg.style.display = "block";
  }
}

// Close the sidebar with the close button
function w3_close() {
  mySidebar.style.display = "none";
  overlayBg.style.display = "none";
}
</script>

</body>
</html>