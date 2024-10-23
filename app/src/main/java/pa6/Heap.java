
package pa6;

/** 
 * Interface for a heap
 * A heap is a binary tree with the following properties:
 * 1. It is a complete binary tree: 
 *          all levels of the tree are fully filled except possibly for the last level, 
 *          which is filled from left to right
 * 2a. It is a max heap if the value of each node is greater than or equal to the value of its children
 * 2b. It is a min heap if the value of each node is less than or equal to the value of its children
 */
interface Heap {

    /**
     * Inserts a value into the heap
     * For a max heap, the value is inserted at the end of the heap and then bubbled up
     * For a min heap, the value is inserted at the end of the heap and then bubbled up
     * @param value
     */
    void insert(int value);

    /**
     * Deletes the root of the heap
     * For a max heap, the root is replaced with the last element in the heap and then bubbled down
     * For a min heap, the root is replaced with the last element in the heap and then bubbled down
     * @return
     */
    int delete();

    /**
     * Returns the root of the heap
     * @return
     */
    int peek();






    /**
     * Returns the size of the heap. 
     * The size is the number of elements / nodes in the heap
     * @return
     */
    int size();

    /**
     * Returns whether the heap is empty
     * @return
     */
    boolean isEmpty();






    /** 
     * Prints the heap in level order
     */
    void print();







    /**
     * Sorts an unsorted array using a heap
     * For a max heap, the array is first converted to a max heap and then sorted in descending order
     * For a min heap, the array is first converted to a min heap and then sorted in ascending order
     * 
     * Create a new heap and insert each element from the array into the heap 
     * instead of changing the object's heap array
     * 
     * Your implementation must have time complexity: O(n log n) 
     * and space complexity: O(n)
     * 
     * @param array
     */
    static int[] heapSort(int[] array){
        return null;
    }

}