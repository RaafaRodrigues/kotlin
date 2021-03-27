fun main() {
    println("Olá, Kotlin");
    println("é nois em outra linguagem");

    // Tipagem dinamica
    val bairro = "saude";
    val habitantes = 2000;


    println("No bairro ${bairro} moram ${habitantes} pessoas");
    println("No bairro $bairro moram $habitantes pessoas");


    // Tipagem estatica
    val idade: Int = 24;
    val altura: Double = 1.70;
    val temMundial: Boolean = false;
    val sobrenome: String = "silva";

    val filhos = "3".toInt();
    val media = "1.02".toDouble();

    val instrucao = """
          SELECT
          s.StudentID, s.FName, 
          s.LName, s.Gender, s.BirthDate, s.Email, 
          r.HallPref1, r.HallPref2, r.HallPref3
          FROM
          dbo.StudentSignUp AS s 
          INNER JOIN RoomSignUp.dbo.Incoming_Applications_Current AS r 
          ON s.StudentID = r.StudentID 
          INNER JOIN HallData.dbo.Halls AS h 
          ON r.HallPref1 = h.HallID

    """.trimIndent();

    println(instrucao);

}