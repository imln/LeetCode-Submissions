/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
*/

class Solution {
public:
    bool isValid(string s) {
        stack<char> stk;
        int n = s.size();
        
        for(int i=0;i<n;i++){
            if(s[i]=='(' || s[i]=='{' || s[i]=='['){
                stk.push(s[i]);
            }else{
                if(stk.empty()) return 0;
                char top = stk.top();
                if((top=='(' && s[i]==')')||(top=='{' && s[i]=='}')||(top=='[' && s[i]==']')){
                    stk.pop();
                }else{
                    return 0;
                }
            }
        }
        
        if(stk.empty()) return 1;
        return 0;
        
    }
};
