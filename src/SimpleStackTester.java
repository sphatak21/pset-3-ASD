import java.util.Stack;

public class SimpleStackTester {

    private static StringBuilder sb;
    
    public static void main(String[] args) {
        sb = new StringBuilder();
        
        testConstructors();
        testEmpty();
        testPeek();
        testPop();
        testPush();
        testSearch();
    }
    
    private static void testConstructors() {
        try {
            Stack<String> stack = new Stack<>();

            sb.append("Initial contents of stack, bottom-to-top: " + stack);
        } catch (Exception e) {
            sb.append("\nFailed to create stack: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            SimpleStack simpleStack = new SimpleStack();

            sb.append("Initial contents of stack, bottom-to-top: " + simpleStack);
        } catch (Exception e) {
            sb.append("\nFailed to create stack: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testConstructors.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testConstructors.");
        }
    }
    
    private static void testEmpty() {
        try {
            Stack<String> stack = new Stack<>();

            boolean empty = stack.empty();
            
            sb.append("Initial contents of stack, bottom-to-top: " + stack);
            sb.append("\nStack is empty: " + empty);
            
            stack.push("first");
            stack.push("second");
            stack.push("third");
            empty = stack.empty();
            
            sb.append("\nUpdated contents of stack, bottom-to-top: " + stack);
            sb.append("\nStack is empty: " + empty);
            
            stack.pop();
            stack.pop();
            stack.pop();
            empty = stack.empty();
            
            sb.append("\nUpdated contents of stack, bottom-to-top: " + stack);
            sb.append("\nStack is empty: " + empty);
        } catch (Exception e) {
            sb.append("\nFailed to check if stack is empty: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            SimpleStack simpleStack = new SimpleStack();

            boolean empty = simpleStack.empty();
            
            sb.append("Initial contents of stack, bottom-to-top: " + simpleStack);
            sb.append("\nStack is empty: " + empty);
            
            simpleStack.push("first");
            simpleStack.push("second");
            simpleStack.push("third");
            empty = simpleStack.empty();
            
            sb.append("\nUpdated contents of stack, bottom-to-top: " + simpleStack);
            sb.append("\nStack is empty: " + empty);
            
            simpleStack.pop();
            simpleStack.pop();
            simpleStack.pop();
            empty = simpleStack.empty();
            
            sb.append("\nUpdated contents of stack, bottom-to-top: " + simpleStack);
            sb.append("\nStack is empty: " + empty);
        } catch (Exception e) {
            sb.append("\nFailed to check if stack is empty: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testEmpty.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testEmpty.");
        }
    }
    
    private static void testPeek() {
        try {
            Stack<String> stack = new Stack<>();
            
            sb.append("Initial contents of stack, bottom-to-top: " + stack);

            stack.push("first in");
            stack.push("second in");
            stack.push("third in");
            stack.push("last in");
            
            sb.append("\nUpdated contents of stack, bottom-to-top: " + stack);
            
            String lifo = stack.peek();
            
            sb.append("\nPeeked top of stack: " + lifo);
            sb.append("\nPeeked value matches last in: " + (lifo.equals("last in")));
            sb.append("\nUpdated contents of stack, bottom-to-top: " + stack);
        } catch (Exception e) {
            sb.append("\nFailed to peek: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            SimpleStack simpleStack = new SimpleStack();
            
            sb.append("Initial contents of stack, bottom-to-top: " + simpleStack);

            simpleStack.push("first in");
            simpleStack.push("second in");
            simpleStack.push("third in");
            simpleStack.push("last in");
            
            sb.append("\nUpdated contents of stack, bottom-to-top: " + simpleStack);
            
            String lifo = simpleStack.peek();
            
            sb.append("\nPeeked top of stack: " + lifo);
            sb.append("\nPeeked value matches last in: " + (lifo.equals("last in")));
            sb.append("\nUpdated contents of stack, bottom-to-top: " + simpleStack);
        } catch (Exception e) {
            sb.append("\nFailed to peek: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testPeek.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testPeek.");
        }
    }
    
    private static void testPop() {
        try {
            Stack<String> stack = new Stack<>();
            
            sb.append("Initial contents of stack, bottom-to-top: " + stack);

            stack.push("first in");
            stack.push("second in");
            stack.push("third in");
            stack.push("last in");
            
            sb.append("\nUpdated contents of stack, bottom-to-top: " + stack);
            
            String lifo = stack.pop();
            
            sb.append("\nPopped top of stack: " + lifo);
            sb.append("\nPopped value matches last in: " + (lifo.equals("last in")));
            sb.append("\nUpdated contents of stack, bottom-to-top: " + stack);
        } catch (Exception e) {
            sb.append("\nFailed to pop: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            SimpleStack simpleStack = new SimpleStack();
            
            sb.append("Initial contents of stack, bottom-to-top: " + simpleStack);

            simpleStack.push("first in");
            simpleStack.push("second in");
            simpleStack.push("third in");
            simpleStack.push("last in");
            
            sb.append("\nUpdated contents of stack, bottom-to-top: " + simpleStack);
            
            String lifo = simpleStack.pop();
            
            sb.append("\nPopped top of stack: " + lifo);
            sb.append("\nPopped value matches last in: " + (lifo.equals("last in")));
            sb.append("\nUpdated contents of stack, bottom-to-top: " + simpleStack);
        } catch (Exception e) {
            sb.append("\nFailed to peek: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testPop.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testPop.");
        }
    }
    
    private static void testPush() {
        try {
            Stack<String> stack = new Stack<>();
            
            sb.append("Initial contents of stack, bottom-to-top: " + stack);

            stack.push("first in");
            stack.push("second in");
            stack.push("third in");
            stack.push("last in");
            
            sb.append("\nUpdated contents of stack, bottom-to-top: " + stack);
        } catch (Exception e) {
            sb.append("\nFailed to push: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            SimpleStack simpleStack = new SimpleStack();
            
            sb.append("Initial contents of stack, bottom-to-top: " + simpleStack);

            simpleStack.push("first in");
            simpleStack.push("second in");
            simpleStack.push("third in");
            simpleStack.push("last in");
            
            sb.append("\nUpdated contents of stack, bottom-to-top: " + simpleStack);
        } catch (Exception e) {
            sb.append("\nFailed to push: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testPush.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testPush.");
        }
    }
    
    private static void testSearch() {
        try {
            Stack<String> stack = new Stack<>();
            
            sb.append("Initial contents of stack, bottom-to-top: " + stack);

            stack.push("first in");
            stack.push("second in");
            stack.push("third in");
            stack.push("last in");
            
            int last = stack.search("last in");
            int first = stack.search("first in");
            int fail = stack.search("not in here");
            
            sb.append("\nSearch for 'last in': " + (last == 1 ? "found it at index " + last : "didn't find it"));
            sb.append("\nSearch for 'first in': " + (first == 4 ? "found it at index " + first : "didn't find it"));
            sb.append("\nSearch for 'not in here': " + (fail == -1 ? "didn't find it" : "found it at index " + fail));
        } catch (Exception e) {
            sb.append("\nFailed to push: ");
            sb.append(e.toString());
        }
        
        String expected = sb.toString();
        sb.setLength(0);
        
        try {
            SimpleStack simpleStack = new SimpleStack();
            
            sb.append("Initial contents of stack, bottom-to-top: " + simpleStack);

            simpleStack.push("first in");
            simpleStack.push("second in");
            simpleStack.push("third in");
            simpleStack.push("last in");
            
            int last = simpleStack.search("last in");
            int first = simpleStack.search("first in");
            int fail = simpleStack.search("not in here");
            
            sb.append("\nSearch for 'last in': " + (last == 1 ? "found it at index " + last : "didn't find it"));
            sb.append("\nSearch for 'first in': " + (first == 4 ? "found it at index " + first : "didn't find it"));
            sb.append("\nSearch for 'not in here': " + (fail == -1 ? "didn't find it" : "found it at index " + fail));
        } catch (Exception e) {
            sb.append("\nFailed to push: ");
            sb.append(e.toString());
        }
        
        String actual = sb.toString();
        sb.setLength(0);

        if (!expected.equals(actual)) {
            System.out.println("FAILED: testSearch.\n");
            System.out.println(expected);
            System.out.println();
            System.out.println(actual);
        } else {
            System.out.println("PASSED: testSearch.");
        }
    }
}
