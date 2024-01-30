package com.intellekta;

import java.util.List;

public class ViewerStatistics {
    public static int averageAge(List<Viewer> viewers) {
        int sum = 0;
        int count = 0;
        for (Viewer v : viewers) {
            sum += v.getAge();
            count++;
        }
        return sum / count;
    }
}
