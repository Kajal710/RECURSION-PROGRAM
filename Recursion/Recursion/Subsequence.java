import java.util.ArrayList;
public class Subsequence {
    static ArrayList<String>getSubsequence(String str){
        if(str.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(" ");
            return list;
        }
        char Singlechar = str.charAt(0);
        String subString = str.substring(1);
        ArrayList<String> newlist = new ArrayList<>();
        ArrayList<String> list = getSubsequence(subString);
        for(int i = 0;i<list.size();i++){
            newlist.add(list.get(i));
            newlist.add(Singlechar+list.get(i));
           
        }
        return newlist;
    }
    public static void main(String[] args) {
        String str = "amit";
        ArrayList<String> list = getSubsequence(str);
        System.out.println(list);
    }
    
}
