import java.util.HashMap;
import java.util.Map;

class Solution{
    public int romanTOInt(String s){
        Map<Character , Integer> map = new HashMap<>();
        map.put('i', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('X', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char chars[]=s.toCharArray();
        int result = 0;
        int i,j;
        for(i=0,j=1;j<chars.length;i++,j++){
            if(map.get(chars[i])>=map.get(chars[j])){
                result += map.get(chars[i]);
            }
            else{
                result -= map.get(chars[j]);
            }
        }
        result += map.get(chars[i]);
        return result;
    }
}