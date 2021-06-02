package ac.at.fhcampuswien;

public class Password {
    public boolean checkPassword(String word) {

        int letterscounter = 0;
        int numberscounter = 0;
        int uppercasecounter = 0;
        int lowercasecounter = 0;
        int specialcasecounter = 0;
        char previous=0;
        char first=0;
        int counter=1;
        int toomany=1;

        if (word.length() < 8 || word.length() > 25) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (isDigit(ch)) {
                numberscounter++;
                char c = word.charAt(i);
                if (previous == c){
                    counter++;
                }else{
                    counter = 1;
                }
                if(counter > 2){
                    return false;
                }
                previous = c;
                char g = word.charAt(i);
                if (first +1 == g ){
                    toomany++;
                }
                else {
                    toomany=1;
                }
                if (toomany > 2){
                    return false;
                }
                first = g;

            } else if (Letter(ch)) {
                letterscounter++;
            }
        }



        for (int j = 0; j < word.length(); j++) {
            char ch = word.charAt(j);
            if (UpperCase(ch)) {
                uppercasecounter++;
            } else if (LowerCase(ch)) {
                lowercasecounter++;
            } else if (SpecialCase(ch)) {
                specialcasecounter++;
            }
        }


        if (numberscounter > 0 && letterscounter > 0 && uppercasecounter > 0 && lowercasecounter > 0 && specialcasecounter > 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isDigit(char numbers) {
        return (numbers >= '0' && numbers <= '9');
    }

    public static boolean Letter(char letters) {
        letters = Character.toUpperCase(letters);
        return (letters >= 'A' && letters <= 'Z');
    }

    public static boolean UpperCase(char upper){
        return (upper >=65&& upper <= 90);
    }

    public static boolean LowerCase(char lower){
        return (lower >=97&& lower <= 122);
    }

    public static boolean SpecialCase(char special){
        return (special =='(' || special == ')' || special =='#' || special == '$' || special =='?' || special == '!' || special =='%' || special =='/' || special == '@');
    }



public static void main(String[] args) {

    }

}
