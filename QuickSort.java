import java.util.Scanner;

public class QuickSort { 
    String names[]; 
    int length; 
    
    public static void main(String[] args) { 
        QuickSort obj = new QuickSort();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of strings to sort:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        String stringsList[] = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            stringsList[i] = sc.nextLine();
        }
        
        obj.sort(stringsList);
        
        System.out.println("Sorted strings:");
        for (String i : stringsList) { 
            System.out.print(i + " "); 
        }
        
        sc.close();
    } 
    
    void sort(String array[]) { 
        if (array == null || array.length == 0) { 
            return; 
        } 
        this.names = array; 
        this.length = array.length; 
        quickSort(0, length - 1); 
    } 
    
    void quickSort(int lowerIndex, int higherIndex) { 
        int i = lowerIndex; 
        int j = higherIndex; 
        String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2]; 
        
        while (i <= j) { 
            while (this.names[i].compareToIgnoreCase(pivot) < 0) { 
                i++; 
            } 
            while (this.names[j].compareToIgnoreCase(pivot) > 0) { 
                j--; 
            } 
            if (i <= j) { 
                exchangeNames(i, j); 
                i++; 
                j--; 
            }
        } 
        
        if (lowerIndex < j) { 
            quickSort(lowerIndex, j); 
        } 
        if (i < higherIndex) { 
            quickSort(i, higherIndex); 
        } 
    } 
    
    void exchangeNames(int i, int j) { 
        String temp = this.names[i]; 
        this.names[i] = this.names[j]; 
        this.names[j] = temp; 
    } 
}
