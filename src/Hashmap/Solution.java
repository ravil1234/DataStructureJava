package Hashmap;
import java.util.*;
public class Solution {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		String deadends[] = {"0201","0101","0102","1212","2002"};
			System.out.println(openLock(deadends,"0202"));
	}
public static int openLock(String[] deadends, String target) throws Exception {
        
        HashSet<String> deadendSet = new HashSet<>();
        for(int i=0;i<deadends.length;i++)
        {
        deadendSet.add(deadends[i]);
        }

         
        if(deadendSet.contains("0000")) {
            return -1;
        }
        
      HashMap<String,Integer> hasVisited = new HashMap<>();
        int steps = 0;
        LinkedList<String> queue = new LinkedList<>();
        queue.addFirst("0000");
        hasVisited.put("0000",1);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0;i<size;i++) {
                String value = queue.removeLast();

                if(target.equals(value)) {
                    return steps;
                }

                // get neighbour
                // this is slow when using substring() method..
                char[] charArr = value.toCharArray();
                for(int index=0;index<4;index++) {
                    char c = charArr[index];
                    if(charArr[index]=='9')
                        charArr[index]='0';
                    else
                    {
                      charArr[index]=(char)(charArr[index]+1);
                  
                    }
                    String tmp = new String(charArr);
                    charArr[index]=c;
                    if(!hasVisited.containsKey(tmp) && !deadendSet.contains(tmp)) {
                        queue.addFirst(tmp);
                        hasVisited.put(tmp,1);
                    }
                    if(charArr[index]=='0')
                        charArr[index]='9';
                    else
                    {
                      charArr[index]=(char)(charArr[index]-1);
                  
                    }
                    tmp = new String(charArr);
                    if(!hasVisited.containsKey(tmp) && !deadendSet.contains(tmp)) {
                        queue.addFirst(tmp);
                        hasVisited.put(tmp,1);
                    }
                    charArr[index] = c;
                }
            }
            steps++;

        }
        return -1;
    }

}