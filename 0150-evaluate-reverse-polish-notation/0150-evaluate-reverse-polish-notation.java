class Solution {
  public int evalRPN(String[] tokens) {
    var stack = new Stack<Integer>();

    for (var token : tokens) {
      if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
        var b = stack.pop();
        var a = stack.pop();

        if (token.equals("+"))
          stack.push(a + b);
        else if (token.equals("-"))
          stack.push(a - b);
        else if (token.equals("*"))
          stack.push(a * b);
        else if (token.equals("/"))
          stack.push(a / b);
      } else
        stack.push(Integer.parseInt(token));
    }
    return stack.pop();
  }
}