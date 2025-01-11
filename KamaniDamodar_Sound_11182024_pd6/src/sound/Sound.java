package KamaniDamodar_Sound_11182024_pd6.src.sound;

public class Sound {
    
    private int[] samples;

    public Sound(int[] vals) {
     
        samples = new int[vals.length];
        for (int i = 0; i < vals.length; i++) {
            samples[i] = vals[i];
        }
    }

    public int limitAmplitude(int limit) {
        int cnt = 0;
        for (int i = 0; i < samples.length; i++) {
            if (samples[i] > limit) {
                samples[i] = limit;
                cnt++;
            }
            else if (samples[i] < -limit) {
                samples[i] = -limit;
                cnt++;
            }
        }
        return cnt;
    }

    public void trimSilenceFromBeginning() {
        int firstNonZero = 0;
       
        while (firstNonZero < samples.length && samples[firstNonZero] == 0) {
            firstNonZero++;
        }
        
        int[] newSamples = new int[samples.length - firstNonZero];
        for (int i = 0; i < newSamples.length; i++) {
            newSamples[i] = samples[i + firstNonZero];
        }
        samples = newSamples;
    }

    public String toString() {
        String s = "[";
        for (int i = 0; i < samples.length; i++) {
            s += samples[i];
            if (i < samples.length - 1) {
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
}
