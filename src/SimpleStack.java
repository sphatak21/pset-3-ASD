import java.util.EmptyStackException;

public class SimpleStack {
    private int size;
    private String[] mainArray;
    private int top;
    private String topVal;

    public SimpleStack(){
        mainArray = new String[0];
        size = mainArray.length;
    }

    public boolean empty(){
        top = setTop();
        if(top == -1){
            return true;
        }
        return false;
    }

    public String peek(){
        top = setTop();
        if(top == -1){
            return null;
        }
        topVal = mainArray[top];
        return topVal;
    }

    public String pop(){
        top = setTop();
        if(top == -1){
            throw new EmptyStackException();
        }
        topVal = mainArray[top];
        String[] tempArray;
        tempArray = populateTempArr(mainArray, -1);
        mainArray = tempArray;
        size--;
        top = setTop(); 
        return topVal;
    }
    public void push(String item){
        top = setTop();
        String[] tempArray;
        if(top == -1){
            tempArray = new String[1];
        }else {
            tempArray = populateTempArr(mainArray, 1);
        }
        tempArray[tempArray.length-1] = item;
        mainArray = tempArray;
        size++;
        top = setTop();
    }
    public int search(String s){
        top = setTop();
        for(int i = 0; i<size; i++){
            if(mainArray[i] == s){
                int returnInt = 1 + (top - i);
                return returnInt;
            }
        }
        return -1;
    }
    public String toString(){
        top = setTop();
        String mainString = "[";
        for(int i=0; i<size; i++){
            String addString = "";
            addString = mainArray[i];
            if(i == top){
                mainString = mainString + addString;
            }
            else {
                mainString = mainString + addString + ", ";
            }
        }
        return mainString + "]";
    }



    private int setTop() {
        if(size-1==-1){
            return -1;
        }
        return size - 1;
    }
    private String [] populateTempArr (String[] arr, int sizeDiff){
            String [] tempArray;
            tempArray=new String[size+sizeDiff];
            if(sizeDiff > 0){
                for(int i = 0; i<arr.length; i++){
                    tempArray[i] = arr[i];
                }
            }
            if(sizeDiff<0){
                for(int i = 0; i < tempArray.length; i++){
                    tempArray[i] = arr[i];
                }
            }
            return tempArray;
    }
}
