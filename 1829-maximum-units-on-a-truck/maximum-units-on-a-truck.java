class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int i,totalUnits = 0,boxes = 0,max = 0;
        while(truckSize != 0){
            for(i=0;i<boxTypes.length;i++){
                if(boxTypes[i][1]>boxTypes[max][1])
                    max = i;
            }
            boxes = Math.min(truckSize,boxTypes[max][0]);
            truckSize -= boxes;
            totalUnits += boxTypes[max][1]*boxes;
            boxTypes[max][1] = 0;
            max = 0;
        }
        return totalUnits;
    }
}