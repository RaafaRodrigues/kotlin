fun main() {
    // listOf cria uma lista imutavel
    val frutas= listOf<String>("macã","pera","uva");
    println(frutas);


    // mutableListOf cria uma lista mutavel
    val paises = mutableListOf<String>("México","Brasil");
    paises.add("Argentina");
    println(paises);

    println("um pais ${paises[1]}");
    println("outro pais ${paises.get(1)}");

    frutas.forEach { println("fruta da Lista: ${it}"); }
    paises.map { println("paises: ${it}");}
     frutas.forEach{fruta ->
         println(fruta);
     }

    frutas.forEachIndexed{
        contador,fruta ->
        println("${contador+1}a. fruta: ${fruta}");
    }

    var frutasFiltradas= frutas.filter{fruta ->
        fruta.contains('m');

    }
    var frutasFiltradasTamanho= frutas.filter{fruta ->
       fruta.length>2
    }

    println(frutasFiltradas);

}