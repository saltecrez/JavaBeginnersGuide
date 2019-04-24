package chapter5;

class Bubble {

    public static void main(String[] args) {
        int a, b, size, t;
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        size = 10;

        // display original array
        System.out.print("Original array is:");
        for (int i = 0; i < size; i++) {
            System.out.println(nums[i]);
        }

        // This is the bubble sort.  
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) { // if out of order  
                    // exchange elements   
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        // display sorted array
        System.out.println("");
        System.out.print("Sorted array is:");
        for (int i = 0; i < size; i++) {
            System.out.println(nums[i]);
        }
    }
}
