package classeskotlin

class Escola {

    var nome:String=""
        get() = field.toUpperCase();
        set(value) {
            if(value.length >=3) {
                field = value
            }
        }
    var numeroAlunos:Int=0
        get() = field
        set(value) {
           field=value;
        }

}