package practices;

public class FindTheDistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int count = 0;
        for(int i = 0 ; i < arr1Length ; i++){
            for(int j = 0 ; j < arr2.length ; j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    break;
                }
                else if(j == arr2Length -1){
                    count++;
                }
            }
        }



        // kaç tane indis 2den büyük
        return count;

    }
}
