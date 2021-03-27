package classeskotlin

fun main() {
    val boletim: Boletim = Boletim();
    val boletim2: Boletim = Boletim();
    val pais:Pais = Pais("Canadá",400,1.0);
    //pais.nome="a";
    println(pais.nome);
    println(boletim.iniciar());
    println(boletim.informacoes());
    boletim.definirAluno("Rafael");


    boletim2.definirAluno("Zé ruela");
    println(boletim2.informacoes());

    boletim2.lancarNotas(10.0, 5.0);
    println(boletim2.media());

    boletim.aluno="jonas";
    println("nome: ${boletim.aluno}");


    val escola:Escola= Escola();
    escola.nome="Decio";
    escola.numeroAlunos=2;
    println(escola.nome);

    escola.nome="aa";
    println(escola.nome);
    val escola2:Escola= Escola();
    escola2.nome="Decio";

    println(escola);
    val cep= ResultadoCep("00000","rua1","sp");
    val cep2= ResultadoCep("00000","rua1","sp");



    println(cep);
    println(escola.equals(escola2));
    println(cep.equals(cep2));
}