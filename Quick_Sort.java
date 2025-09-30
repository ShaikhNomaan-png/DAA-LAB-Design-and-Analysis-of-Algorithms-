



public class Quick_Sort {
    public static void swap(int low,int high,int []arr){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
    public static int partition(int low,int high,int[] arr){
        int n= arr.length,count=0;
        int pivotIdx=low,pivot=arr[low];


        for(int i=low+1;i<=high;i++){
            if(pivot>=arr[i]) count++;
        }
        pivotIdx+=count;
        swap(low,pivotIdx,arr);


        int i=low,j=high;
        while(i<pivotIdx && j>pivotIdx){
            if(arr[i]<=pivot){
                i++;
            }
            if(pivot<=arr[j]){
                j--;
            }
            if(arr[i]>pivot && arr[j]<pivot){
                swap(i,j,arr);
            }
        }

//        returning the pivot index
        return pivotIdx;
    }



//    Randomized Quick Sort
public static int Randomizedpartition(int low,int high,int[] arr){
    int n= arr.length,count=0;
    int mid=(high+low)/2;
    int pivotIdx=mid,pivot=arr[mid];


//        Putting the pivot on the correct place
    for(int i=low;i<=high;i++){
        if(i==mid) continue;
        if(pivot>=arr[i]) count++;
    }
    pivotIdx=low+count;
    swap(pivotIdx,mid,arr);


//        Arranging the element to the left and right side
    int i=low,j=high;
    while(i<pivotIdx && j>pivotIdx){
        if(arr[i]<=pivot){
            i++;
        }
        if(pivot<=arr[j]){
            j--;
        }
        if(arr[i]>pivot && arr[j]<pivot){
            swap(i,j,arr);
        }
    }

//        returning the pivot index
    return pivotIdx;
}




    public static void QuickSort(int low,int high,int [] arr){
        if(low>=high) return;
        int pivotIdxs= Randomizedpartition(low,high,arr);
        QuickSort(low,pivotIdxs-1,arr);
        QuickSort(pivotIdxs+1,high,arr);
    }

    public static void main(String[] args) {
        int [] arr={4, 9, 7, 1, 2, 3, 6, 5, 8};
        int n= arr.length;
        for(int ele:arr){
            System.out.print(ele+" ");
        }

        System.out.println();
        QuickSort(0,n-1,arr);

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}


