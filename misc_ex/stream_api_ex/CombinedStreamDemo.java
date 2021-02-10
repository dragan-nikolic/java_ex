import java.util.Arrays;
import java.util.List;

public class CombinedStreamDemo {

    /**
     * To each feature in the list add prefix 'enable' then combine names
     * so they are coma separated again and no space is around coma.
     * 
     * @param features coma separated list of features to be processed
     */
    public static void comaSeparatedFeatureNames(String features) {
        List<String> featureList = Arrays.asList(features.split(","));
        String featureListUrl = featureList.stream()
            .map((value) -> "enable" + value.trim())
            .reduce((value, combined) -> {return combined + "," + value;})
            .get();

        System.out.println(featureListUrl);
    }

    public static void main(String args[]) {
        comaSeparatedFeatureNames("PartialCancel, Bopis,Checkout,  Cart");
    }
}
