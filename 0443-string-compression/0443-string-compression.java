class Solution {
    public int compress(char[] chars) {
        int index = 0, count = 0;
        // We traverse the entire array with this iteration.
        for (int i = 0; i < chars.length; i++) {
            count++; // We keep note of number of characters in sequence.
            /* When the next character is not as same as the previous one,
             * we modify the array from the beginning with the current character.
             * Note that the array will only become shorter as we keep updating the data.
             * So there is no need to create another array.
             */
            if (i+1 == chars.length || chars[i] != chars[i+1]) {
                chars[index++] = chars[i];
                // If there are multiple characters, we add the number to the array.
                if (count != 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[index++] = c;
                    }
                }
                // We initialize count to zero for the next character check.
                count = 0;
            }
        }
        return index;
    }
}