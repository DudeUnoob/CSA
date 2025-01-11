public double averageEven(int[] arr) {
    double sum = 0;
    int count = 0;
    
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            sum += arr[i];
            count++;
        }
    }
    
    if (count == 0) {
        return 0.0;
    }
    return sum / count;
}


public int[] evens(int[] arr) {

    int evenCount = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            evenCount++;
        }
    }
    
    int[] result = new int[evenCount];
    
    int resultIndex = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            result[resultIndex] = arr[i];
            resultIndex++;
        }
    }
    
    return result;
}