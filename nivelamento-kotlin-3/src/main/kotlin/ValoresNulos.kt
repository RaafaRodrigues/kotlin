




fun main() {

    var endereco:String?=null;

    println("Endereço: ${endereco?.toUpperCase()}");
   // println("Endereço: ${endereco!!.toUpperCase()}");

    val telefone = null;

    val estadoX=Estado();
    estadoX.nome="Paraná";
    estadoX.capital="Coritiba";
    println(estadoX.descrever());



}