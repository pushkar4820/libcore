package benchmarks;

public class AdditionBenchmark {
    public int timeAddConstantToLocalInt(int reps) {
        int result = 0;
        for (int i = 0; i < reps; ++i) {
            result += 123;
        }
        return result;
    }
    public int timeAddTwoLocalInts(int reps) {
        int result = 0;
        int constant = 123;
        for (int i = 0; i < reps; ++i) {
            result += constant;
        }
        return result;
    }
    public long timeAddConstantToLocalLong(int reps) {
        long result = 0;
        for (int i = 0; i < reps; ++i) {
            result += 123L;
        }
        return result;
    }
    public long timeAddTwoLocalLongs(int reps) {
        long result = 0;
        long constant = 123L;
        for (int i = 0; i < reps; ++i) {
            result += constant;
        }
        return result;
    }
    public float timeAddConstantToLocalFloat(int reps) {
        float result = 0.0f;
        for (int i = 0; i < reps; ++i) {
            result += 123.0f;
        }
        return result;
    }
    public float timeAddTwoLocalFloats(int reps) {
        float result = 0.0f;
        float constant = 123.0f;
        for (int i = 0; i < reps; ++i) {
            result += constant;
        }
        return result;
    }
    public double timeAddConstantToLocalDouble(int reps) {
        double result = 0.0;
        for (int i = 0; i < reps; ++i) {
            result += 123.0;
        }
        return result;
    }
    public double timeAddTwoLocalDoubles(int reps) {
        double result = 0.0;
        double constant = 123.0;
        for (int i = 0; i < reps; ++i) {
            result += constant;
        }
        return result;
    }
}
