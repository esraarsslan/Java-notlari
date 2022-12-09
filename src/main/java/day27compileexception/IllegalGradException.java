package day27compileexception;

// BU KODLA KENDI EXCEPTIONUMUZU OLUSTURDUK. COMPILE TIME EXP.
//Eger Exception Class'a  extend ederseniz sizin class'iniz  "Compile Time Exception"'olur ...
public class IllegalGradException extends Exception{

    public IllegalGradException(String message){
        super(message);

    }
}
