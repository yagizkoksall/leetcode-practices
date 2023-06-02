package practices;

public class OneBitAndTwoBitCharacters {
    public boolean isOneBitCharacter(int[] bits) {

        for (int i = 0; i < bits.length; i++) {
            if (bits[i] == 1) {
                bits[i+1] = 1;
                i++;
            }
        }

        if(bits[bits.length-1]==0){
            return true;
        }

        return false;
    }

}
