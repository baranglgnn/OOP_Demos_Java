package FilterPipelinePackage;

import java.util.*;

public class FilterPipeline {

    private List<Filter> filters = new ArrayList<>();

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public String applyAll(String input) {
        String result = input;
        for (Filter filter : filters) {
            result = filter.apply(result);
        }
        return result;
    }
}
