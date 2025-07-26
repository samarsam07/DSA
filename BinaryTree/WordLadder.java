import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
    public int wordLadder(String start,String end,List<String> wordList){
        if(!wordList.contains(end)){
            return 0;
        }
        int length=0;
        Set<String> visited=new HashSet<>();
        Queue<String> q=new LinkedList<>();
        q.offer(start);
        while(!q.isEmpty()){
            int size=q.size();
            length++;
            for(int i=0;i<size;i++){
                String st=q.poll();
                for(int j=0;j<st.length();j++){
                    char[] temp=st.toCharArray();
                    for(char ch='a';ch<='z';ch++){
                        temp[j]=ch;
                        String newWord=new String(temp);
                        if(newWord.equals(end)){
                            return length+1;
                        }
                        if(wordList.contains(newWord) && !visited.contains(newWord)){
                            q.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }
        }
        return 0;
    }
}
