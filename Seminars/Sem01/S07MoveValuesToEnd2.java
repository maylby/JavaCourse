package JavaSeminar.Seminar01;
/*
Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, 
нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива
должны быть отличны от заданного, а остальные - равны ему.
 */
import java.util.Arrays;

public class S07MoveValuesToEnd2 {
    public static void main(String[] args) {
		int[] arr = {3,2,2,3};
		int val = 3;
		moveNumsToEndArray(arr, val);
		System.out.println(Arrays.toString(arr));
	}
     /*
     * Метод перемещения элементов 
     * с заданным значением в конец массива
     */
    private static void moveNumsToEndArray(int[] arr, int val) {
        int rightIndex = arr.length - 1; 
        int leftIndex = 0;  
            
        while (arr[rightIndex] == val) { 
                
        	rightIndex--; 
        }
        while (leftIndex < rightIndex) { 
        	if (arr[leftIndex] == val) { 
        		arr[leftIndex] = arr[rightIndex]; 
        		arr[rightIndex] = val; 
         		rightIndex--; 
        	}
        	leftIndex++; 
        }
    }
}
