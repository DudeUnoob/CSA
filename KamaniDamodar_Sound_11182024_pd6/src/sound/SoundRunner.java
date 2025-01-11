package KamaniDamodar_Sound_11182024_pd6.src.sound;

public class SoundRunner {
    public static void main(String[] args) {
        int[] vals = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        Sound fun = new Sound(vals);
        System.out.println(fun);     //prints  [40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223]
        int count = fun.limitAmplitude(2000);
        System.out.println(count);   //prints 5
        System.out.println(fun);    //prints   [40, 2000, 17, -2000, -17, -2000, 2000, 1048, -420, 33, 15, -32, 2000, 2000]
    }
}
