//12.Write a Java Program to Reverse the given array without using additional Array. 

class AddArray {
    public static void main(String args[]) {
      
        int[] array = {1, 2, 0, 4, 6, 0, 9, 0, 4, 0, 3, 0, 9, 0, 1, 0, 3, 0};

        
        int current = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                array[current] = array[i];
                current--;
            }
        }

        
        while (current >= 0) {
            array[current] = 0;
            current--;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}