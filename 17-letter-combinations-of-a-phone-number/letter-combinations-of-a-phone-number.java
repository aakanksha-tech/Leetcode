// import java.util.*;

// class Solution {

//     public List<String> letterCombinations(String digits) {

//         List<String> result = new ArrayList<>();

//         if (digits == null || digits.length() == 0) {
//             return result;
//         }

//         String[] map = {
//             "", "", "abc", "def", "ghi", "jkl",
//             "mno", "pqrs", "tuv", "wxyz"
//         };

//         backtrack(digits, 0, "", result, map);

//         return result;
//     }

//     void backtrack(String digits, int index, String path,
//                    List<String> result, String[] map) {

//         if (index == digits.length()) {
//             result.add(path);
//             return;
//         }

//         String letters = map[digits.charAt(index) - '0'];

//         for (int i = 0; i < letters.length(); i++) {
//             backtrack(digits, index + 1,
//                     path + letters.charAt(i),
//                     result, map);
//         }
//     }
// }


class Solution {

    static String[] keys = {
        "", "", "abc", "def", "ghi", "jkl",
        "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        find(digits, 0, "", result);

        return result;
    }

    public void find(String digits, int idx, String ans,
                     List<String> result) {

        if (idx == digits.length()) {
            result.add(ans);
            return;
        }

        int digit = digits.charAt(idx) - '0';
        String s = keys[digit];

        for (int j = 0; j < s.length(); j++) {
            find(digits, idx + 1, ans + s.charAt(j), result);
        }
    }
}

