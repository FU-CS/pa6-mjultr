package pa6;

// Uncomment the following class to get started

public class MinHeap implements Heap {
    public MinHeap(int maxCapacity){
        this.cap =  maxCapacity;
        this.data=  new int[cap];
        this.track = 0;
    }
    public int[] data;
    public int track;
    public int cap;


    public void insert(int element){
        this.data[this.track] = element; 
        this.track = this.track +1;
        int i = track - 1;
        // Compare to previous values

        while (this.data[i] < this.data[(i -1) / 2]){
            int tmp = this.data[(i -1) / 2];
            this.data[((i -1) / 2)] = this.data[i];
            this.data[i] = tmp;

            i = (i -1) / 2;
        }
    }  

    public int delete(){
        // Step 1: Swap root with last element
        int tmp = this.data[0];
        this.data[0] = this.data[this.track- 1];
        this.data[this.track-1] = tmp;
        this.track = this.track -1;
        // Step 2: Fix Order by 'heapify' operation
        this.minHeapify(0);

        return tmp;
    }

   

    public void minHeapify(int i){
        if ((i >= this.track)) {
            return;
        }

        int left = 2*i + 1;
        int right = 2*i + 2;   

        if ((left < this.track) && (this.data[left] < this.data[i])){
            this.swap(left, i);
            this.minHeapify(left);
        }
        
        else if ((right < this.track) && (this.data[right] < this.data[i])){
            this.swap(right, i);
            this.minHeapify(right);
        }
    }
    private void swap(int i, int j){
        int tmp =  this.data[i];
        this.data[i] = this.data[j];
        this.data[j] = tmp;
    }


    public void print(){
        int i = 0;
        while (i < this.track){
            System.out.println(" " +this.data[i]);
            i = i + 1;
        }
        System.out.println();
    }
    
    public int size(){
    return track;      
    }

    public int peek(){
        int tmp = this.data[0];
        return tmp;
    }

    public boolean isEmpty(){
        if (this.data.length == 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        Heap heap = new MinHeap(10);
        heap.insert(1);
        heap.insert(2);
        heap.insert(9);
        heap.insert(10);
        heap.insert(3);
        heap.insert(4);
        heap.insert(7);
        heap.insert(8);
        heap.insert(5);
        heap.insert(6);
        heap.print();
        heap.delete();
        heap.print();
        System.out.println(heap.size());
        System.out.println(heap.peek());
        System.out.println(heap.isEmpty());

    } 
}