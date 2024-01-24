class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            // Adjust columnNumber to 0-based index
            columnNumber--;

            // Calculate the remainder when divided by 26
            int remainder = columnNumber % 26;

            // Append the corresponding character to the result
            result.insert(0, (char) ('A' + remainder));

            // Update columnNumber for the next iteration
            columnNumber /= 26;
        }

        return result.toString();
    }
}