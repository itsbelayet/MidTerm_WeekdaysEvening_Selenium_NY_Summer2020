package stringproblemsDone;

public class DetermineLargestWord {
    public static void main(String[] args) {
        // Done
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
//        String s="Human brain is a biological learning machine";
//        Map<Integer, String> wordNLength = findTheLargestWord(s);
//        //implement
//        System.out.println(s.length());
//        findTheLargestWord(s);

        findSmallLarge();
    }

    public static void findSmallLarge(){
        String gst="Human brain is a biological learning machine";
        String [] st=gst.split(" ");
        String smalest=st[0];
        String longest="";

        for(String s1:st){
            if(s1.length()<smalest.length()){
                smalest=s1;
            }else if(s1.length()>longest.length()){
                longest=s1;
            }
        }
        System.out.println("Smallest Word of the String is : "+smalest.length()+" "+smalest);
        System.out.println("Longest Word of the String is : "+longest.length()+" "+longest);
    }

//    public static Map<Integer, String> findTheLargestWord(String s){
//        Map<Integer, String> map = new HashMap<>();
//        String st = "";
//        //implement
//        return map;
//    }
}
