package Subsets_Pattern;

import java.util.ArrayList;

class subset{
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> list = new ArrayList<>();
        subsetString("", str, list);
        System.out.println(list);
        System.out.println(subSeqList("", str));

    }
    // approach 1 - passing ArrayList in the argument
    static ArrayList<String> subsetString(String ans, String str, ArrayList<String> store){

            if(str.isEmpty()){
                if(!ans.isEmpty()){
                store.add(ans);
                }
                return store;
            }

            char ch = str.charAt(0);

            subsetString(ans + ch, str.substring(1), store);

            subsetString(ans, str.substring(1), store);

            return store;

    }

    // Approach 2 - creating ArrayList inside function body

    static ArrayList<String> subSeqList(String ans,String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if(!ans.isEmpty()){
                list.add(ans);
            }
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = subSeqList( ans + ch, str.substring(1));

        ArrayList<String> right = subSeqList(ans, str.substring(1));

        // left.addAll(right);
        right.addAll(left);
        return right;
    }
}