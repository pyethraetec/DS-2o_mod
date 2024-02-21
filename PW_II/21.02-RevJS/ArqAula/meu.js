function somar(){
	let var1, var2, var3;

	var1 = parseInt(document.getElementById("n1").value);
	var2 = parseInt(document.getElementById("n2").value);

	var3 = document.getElementById("n3");
	
	var3.value = var1 + var2;
}