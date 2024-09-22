package RemovingElements;

//Take an array and remove every second element from the array.
// Always keep the first element and start removing with the next element.

//Example:
//  ["Keep", "Remove", "Keep", "Remove", "Keep", ...]
//  --> ["Keep", "Keep", "Keep", ...]

public class RemovingElements {
    public static Object[] removeElement(Object[] arr) {
        int newLength = (arr.length + 1) / 2;
        Object[] newArr = new Object[newLength];

        for(int i = 0,j = 0; i < arr.length; i++){
            if(i % 2 == 0){
                newArr[j++] = arr[i];
            }
        }

        return newArr;
    }
}
