<!DOCTYPE html>
<html>
<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>



<div class="w3-container w3-display-middle">
  <!--Botao enviar-->
Busca: <input type="text" name="busca" class=""> <input type="submit" value="Enviar" class="w3-button">

<!--Botao cadastro-->
<a href="./cadastro.php" class="w3-button w3-blue w3-right">Novo</a>


<br><br>

<!--Tabela produtos buscar-->
<table class="w3-table-all w3-bordered w3-striped w3-border" style="color:#000">
    <tbody><tr class="w3-green">
        <th>Código</th>
        <th>Produto</th>
        <th>Quantidade</th>
        <th>Preço</th>
        <th>Ação</th>
    </tr>
    </tbody><tbody>
    <tr>

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
          
          $query;
          
          if(isset($_POST["busca"]) == true){
            $query = mysqli_query($conexao,"SELECT * from produtos WHERE produtos LIKE '%" . $_POST["busca"] . "%'");
          }
          else{
            $query = mysqli_query($conexao,"SELECT * from produtos");
          }

          if(mysqli_num_rows($query) == 0){
            
            echo "Sem resultados a exibir";
          }
          else{
          echo "Mostrando " . mysqli_num_rows($query) . " resultados<br><br>";

          while($linha = mysqli_fetch_array($query)){
            echo "<tr>";
            echo "<td>" . $linha["Cod"] . "</td>";
            echo "<td>" . $linha["Produto"] . "</td>";
            echo "<td>" . $linha["Quant"] . "</td>";
            echo "<td>" . $linha["Preco"] . "</td>";
            echo "<td><a href='./editar.php" . "' class='w3-button w3-orange'>Editar</a> <a href='./excluir.php". "' class='w3-button w3-red'>Excluir</a></td>";
            echo "</tr>";
          }

          echo "</table>";  
          }
      ?>

    <!--
        <td>123</td>
        <td>Produto de Teste</td>
        <td>15</td>
        <td>25,00</td>
      <td><a href="" class="w3-button w3-orange">Editar</a> <a href="" class="w3-button w3-red">Excluir</a></td>
    -->
    </tr>
    </tbody>
    </table>
</div>

</body>
</html>