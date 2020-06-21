public class learn_387 {
    int[] letter=new int[26];//存储各字符出现次数
        for (char c:s.toCharArray())//第一次遍历
    letter[c-'a']++;
        for (int i = 0; i <s.length() ; i++) {//第二次遍历
        if(letter[s.charAt(i)-'a']==1) return i;
    }
        return -1;//无解

}
