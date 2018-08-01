import synthesizer.GuitarString;

/**
 * @ClassName GuitarHero
 * @Description TODO
 * @Author Yixiang Zhao
 * @Date 2018/8/1 20:46
 * @Version 1.0
 */
public class GuitarHero {
    private static final String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";

    public static void main(String[] args) {
        GuitarString concert[] = new GuitarString[37];
        for (int i=0; i<concert.length; i++) {
            concert[i] = new GuitarString(440.0 * Math.pow(2, (i - 24.0) / 12.0));
        }

        while (true) {
            if (StdDraw.hasNextKeyTyped()) {
                char key = StdDraw.nextKeyTyped();
                int index = keyboard.indexOf(key);
                if (index != -1) {
                    concert[index].pluck();
                }
            }

            double sample = 0;
            for (int i=0; i<concert.length; i++) {
                sample += concert[i].sample();
            }

            StdAudio.play(sample);

            for (int i=0; i<concert.length; i++) {
                concert[i].tic();
            }
        }

    }
}
