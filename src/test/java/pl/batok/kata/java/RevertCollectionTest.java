package pl.batok.kata.java;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static pl.batok.kata.java.CollectionTransformer.*;

/**
 * Created by mateusz on 30.11.14.
 */
public class RevertCollectionTest {

    @Test
    public void testColectinReversion7() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertThat(transform7(collection)).hasSameElementsAs(expected);
    }

    @Test
    public void testCollectionReversion8() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertThat(transform8(collection)).hasSameElementsAs(expected);
    }

    @Test
    public void testElementsLength() {
        List<String> collection = asList("My", "name", "is", "Johny", "Doeer");
        List<String> expected = asList("JOHNY", "DOEER");
        assertThat(transformLengthAndSize(collection)).hasSameElementsAs(expected);

    }



    @Test
    public void testCollectionReduction4() {
        List<Integer> collection = asList(1,2,4,5,11,43,41,3,8,12);
        List<Integer> expected = asList(4,5,11,43,41,8,12);
        assertThat(reduce4(collection)).hasSameElementsAs(expected);
    }




}
