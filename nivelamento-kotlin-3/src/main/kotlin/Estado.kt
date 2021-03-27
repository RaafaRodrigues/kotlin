

class Estado {

    lateinit var nome:String;
   lateinit var capital:String;

    fun descrever():String{
        return  "O estado ${nome.toUpperCase()} tem como capital ${capital.toUpperCase()}"
    }
}