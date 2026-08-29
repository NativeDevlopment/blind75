class Solution {

    public String encode(List<String> strs) {

      StringBuilder encodedString = new StringBuilder();

      for(String str : strs){
      encodedString.append(str.length()).append("#").append(str);

      } 
      return encodedString.toString() ;
    }

    public List<String> decode(String str) {
    List<String> decodeStringList = new ArrayList();
        int i = 0;
        while (i < str.length()) {
            int slash = str.indexOf('#', i);
            int size = Integer.parseInt(str.substring(i, slash));
            i = slash + 1;
            decodeStringList.add(str.substring(i, i + size));
            i += size;
        }
        return decodeStringList;
    }
}
