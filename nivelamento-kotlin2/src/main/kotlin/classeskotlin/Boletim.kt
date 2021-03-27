package classeskotlin

class Boletim {

    var aluno: String = "";
    var nota1: Double = 0.00;
    var nota2: Double = 0.00;


    fun lancarNotas(novaNota1: Double, novaNota2: Double) {
        this.nota1 = novaNota1;
        this.nota2 = novaNota2;

    }

    fun media(): Double {
        return (this.nota1 + this.nota2) / 2;
    }

    fun iniciar(): String {
        return "Boletim iniciado!";
    }

    fun informacoes(): String {
        return "Boletim Maia v1.0 - Aluno(a) ${this.aluno}";
    }

    fun definirAluno(novoNome: String) {
        this.aluno = novoNome;
    }


}