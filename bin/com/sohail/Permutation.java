import java.awt.color.ICC_ColorSpace;

public class Permutation {
    static void genrate(String str,String current){
        if (str.length() == 0) {
            System.out.println(current);
            return;

        }
        for (int i =0; i<str.length();i++){
            char ch = str.charAt(i);

            String remaning =
                    str.substring(0,i)+str.substring(i+1);
            genrate(remaning,current+ch);

        }
    }

    static void main(String[] args) {
        genrate("ABC","");
    }
}
