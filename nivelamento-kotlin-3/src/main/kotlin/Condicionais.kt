


fun main() {
    var idade:Int = 3;

    val mensagem:String = if(idade>=18) {"Maior de idade"} else {"Menor"};

    println(mensagem);

    when (idade) {
        1,2 -> println("Só chora, dorme e mama")
        in 3..8 -> println("Largando as fraldas! Aleluia!!!")
        9 -> {
            println("b")
            println("a")
        }
        in 11..18 -> println("Só pensa naquilo")
        else -> println("Idade não mapeada")
    }

    val descontoIngresso:Double = when ( idade ) {
        in 0..5 -> 100.0;
        in 55..100 -> 50.0;
        else -> 0.0;
    }
    println("Desconto aplicado: ${descontoIngresso}");
}