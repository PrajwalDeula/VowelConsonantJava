import java.io.*;

class ConstantVowel{
    public static void main(String[] args){
        int cVowel = 0;
        int cConsonant = 0;
        String str = "This is a dummy text";;
        str = str.toLowerCase();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' ||
                    str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||
                    str.charAt(i)=='u'

            ){
                cVowel++;
            }
    else if (str.charAt(i)>='a' && str.charAt(i)<='z'){
        cConsonant++;
            }
        }

        System.out.println("This is number of vowel: " + cVowel);
        System.out.println("This is number of consonants: " + cConsonant);



    }

}