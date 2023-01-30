public class Main {
    public static void main(String[] args) {
        /*
        Stwórz tablicę 4 imon i połącz je za pomocą konkatenacji,
        nie ważne czy będzie to oparator czy metoda concat().
        Zaprezentuj na koniec wynik połączenia wszystkich elementów.
        Pamiętaj o spacji rozdzielającej imiona :)
        */
        String [] names = {"Ania", "Wiktor", "Igor", "Wiktoria"};
        String namesConcat = new String();
        for (int i = 0; i <= names.length-1; i++) {
            namesConcat += names[i] + " ";

        } System.out.println(namesConcat);
        //inna metoda na do samo
        String str = "";
        for (String s : names) {
            str = str.concat(s);
            str += " ";
        }
        System.out.println(str);
    }
}
