class Solution {

    public String encode(List<String> strs) {
        
        String concat = ""; 

        for (int i = 0; i < strs.size(); i++) {
            concat += strs.get(i) + '~';
        }

        return concat;

    }

    public List<String> decode(String str) {
        String charSet = "";

        List<String> decodeStringss = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '~') {
                decodeStringss.add(charSet);
                charSet = "";
            } else {
                charSet += str.charAt(i);
            }

        }

        return decodeStringss;
    }

    List<String> strings = List.of("Red", "Green", "Blue");

    String encodedString = encode(strings);

    List<String> decodedStrings = decode(encodedString);
}
