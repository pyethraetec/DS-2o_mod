<?php
	//time hora atual convertida em segundos
	echo time();
	
	//definindo um cookie de nome teste, valor 1020304050 que irá expirar em 30 dias
	setcookie("teste", 1020304050, time() + (86400 * 30));
	
	//deletando o cookie apenas colocando a data dele inferior a agora.
	setcookie("teste", 102030, time() -1);
	
	//exibindo o valor de um cookie de nome teste
	echo $_COOKIE["teste"];
	
	//essa tela irá resultar em erro pq tenta mostrar um cookie expirado
?>