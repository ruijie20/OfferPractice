public class MinNumberFromRotateArray {
    public int min(int[] ints) {
        if(ints == null || ints.length == 0){
            return 0;
        }

        int first = 0;
        int last = ints.length - 1;
        int mid = first;
        while (ints[first] >= ints[last]){
            if(last - first == 1){
                return ints[last];
            }
            mid = (first + last) / 2;

            if(ints[mid] == ints[first] && ints[mid] == ints[last]){
                return threeNumberAreSame(ints, first, last);
            }

            if(ints[mid] <= ints[first]){
                last = mid;
            } else {
                first = mid;
            }
        }

        return ints[mid];
    }

    private int threeNumberAreSame(int[] ints, int first, int last) {
        int result = ints[first];
        for (int i = first + 1; i < last; i++) {
            if(result >= ints[i]){
                result = ints[i];
            }
        }
        return result;
    }
}
