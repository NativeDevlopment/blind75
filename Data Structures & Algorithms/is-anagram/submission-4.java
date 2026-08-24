class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()==t.length()){
            HashMap<Character, Integer> sMap= new HashMap();
            HashMap<Character, Integer> tMap= new HashMap();

            for(int i=0 ; i < s.length();i++)
            {
                if(sMap.containsKey(s.charAt(i))){
                    int value= sMap.get(s.charAt(i));
                    sMap.put(s.charAt(i),value+1);
                }else {
                   sMap.put(s.charAt(i),1); 
                }
                if(tMap.containsKey(t.charAt(i))){
                    int value= tMap.get(t.charAt(i));
                    tMap.put(t.charAt(i),value+1);
                }else {
                   tMap.put(t.charAt(i),1); 
                }
            }
             if(sMap.equals(tMap))
             return true;


        }
        return false;
    }
}
