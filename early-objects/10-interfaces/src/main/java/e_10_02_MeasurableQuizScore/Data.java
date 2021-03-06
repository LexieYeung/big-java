package e_10_02_MeasurableQuizScore;

public class Data
{
    /**
     * Computes the average of the measures of the given objects.
     *
     * @param objects an array of Measurable objects
     * @return the average of the measures
     */
    public static double average(Measurable[] objects)
    {
        double sum = 0;
        for (Measurable obj : objects)
        {
            sum = sum + obj.getMeasure();
        }
        if (objects.length > 0)
        {
            return sum / objects.length;
        }
        else
        {
            return 0;
        }
    }

    /**
     * Computes the largest of the measures of the given objects.
     *
     * @param objects an array of Measurable objects
     * @return the object with largest measure
     */
    public static Measurable max(Measurable[] objects)
    {
        Measurable maxObject = objects[0];
        for (Measurable obj : objects)
        {
            if (maxObject.getMeasure() < obj.getMeasure())
            {
                maxObject = obj;
            }
        }
        return maxObject;
    }
}
