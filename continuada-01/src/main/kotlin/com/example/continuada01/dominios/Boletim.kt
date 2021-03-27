package com.example.continuada01.dominios

class Boletim {
    var aluno:String="";
    var nota:Double=0.0;
    var nota2:Double=0.0;
    var media:Double=0.0;

    constructor(aluno: String, nota: Double, nota2: Double) {
        this.aluno = aluno
        this.nota = nota
        this.nota2 = nota2
        this.media = (nota+nota2)/2
    }
}