class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] S = s.split("\\s");
        int n = pattern.length();
        int m = S.length;
        if (n != m)
            return false;

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (!map.containsKey(pattern.charAt(i))) {

                if (map.containsValue(S[i]))
                    return false;
                map.put(pattern.charAt(i), S[i]);

            } else {

                if (!map.get(pattern.charAt(i)).equals(S[i]))
                    return false;

            }
        }

        return true;

    }
}
