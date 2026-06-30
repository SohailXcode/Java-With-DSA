public class Combination {
    static void genrate(String str,String current,int index){
        if (index== str.length()){
            System.out.println(current);
            return;
        }
        genrate(str,current + str.charAt(index),index+1);

        genrate(str,current,index+1);
    }

    static void main(String[] args) {
        genrate("ABC","",0);
    }
}
