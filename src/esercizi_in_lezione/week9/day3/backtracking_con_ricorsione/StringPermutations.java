package esercizi_in_lezione.week9.day3.backtracking_con_ricorsione;

// str = "ABC"

// answers = ""

// chiamata ricorsiva 1
// ciclo 1
// chiamata cosi permute("ABC", "")
// str = "ABC"
// ch = 'A'
// rest = "BC"
//
// chiamata ricorsiva 2
// ciclo 1
// chiamata cosi permute("BC", "A")
// str = "BC"
// ch = 'B'
// rest = "C"
//
// chiamata ricorsiva 3
// ciclo 1
// chiamata cosi permute("C", "AB")
// str = "C"
// ch = 'A'
// rest = "B"

// chiamata ricorsiva 4
// ciclo 1
// chiamata cosi permute("B", "ABC")
// str = "B"
// ch = 'A'
public class StringPermutations {
    public static void permute(String str, String answers) {
        if (str.isEmpty()) {
            System.out.println(answers);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rest = str.substring(0, i) + str.substring(i + 1);
            permute(rest, answers + ch);
        }
    }

    public static void main(String[] args) {
        permute("ABC", "");
    }
}
