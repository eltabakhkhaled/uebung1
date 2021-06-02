package ac.at.fhcampuswien;

public class Password {
    public boolean checkPassword(String word){



    int letcount = 0;
    int numbcount = 0;

    public boolean Length(String word){
        if(word.length() <8 && word.length()>25){
            return false;
        }

        }





    public boolean Numbers(String word){
        for(int i = 0; i < word.length(); i++){
            char ch =  word.charAt(i);

            if (isNumeric(ch)){
                numbcount++;
            }
            else if(isLetter(ch)){
                letcount++;
            }

        }
        if (numbcount > 0 && letcount > 0){
            return true;
        }
        return false;
    }

    public static boolean isNumeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
    public static boolean isLetter(char ch) {
        word = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }



}
public static void main(String[] args) {

    }

}
