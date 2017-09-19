public class FindNumberFromDimensionTwoArray {
    public boolean find(int[][] array, int target) {
        if(array == null || array.length < 1 || array[0].length < 1){
            return false;
        }
        int rowLength = array.length;
        int colLength = array[0].length;

        int rowNumber = rowLength - 1;
        int colNumber = 0;

        while( rowNumber >= 0 && rowNumber < rowLength && colNumber >=0 && colNumber < colLength){
            int currentNumber = array[rowNumber][colNumber];
            if(currentNumber == target){
                return true;
            } else if (currentNumber < target){
                colNumber++;
            } else {
                rowNumber--;
            }
        }

        return false;
    }
}
