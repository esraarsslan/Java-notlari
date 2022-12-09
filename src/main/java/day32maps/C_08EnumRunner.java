package day32maps;

public class C_08EnumRunner {

    public static void main(String[] args) { // dis bilgiye ulasmak icin method olusturduduk.

        String capital = UsState.CALIFORNIA.getCapital();

        System.out.println(capital);

        String abb = UsState.FLORIDA.getAbbreviation();
        System.out.println(abb);


       String state =  UsState.getStateNameFromAbbreviation("Fl");
        System.out.println(state);

       String stateName =  UsState.getStateNameFromCapital("Denver");
        System.out.println(stateName);

        String abbr = UsState.getStateKisaltma("Atlanta");
        System.out.println(abbr);

    }
}
