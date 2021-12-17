package Project;

import Project.cartesian_tree.CartesianTree;
import Project.segment_tree.GetMaxUpdateSetTree;
import Project.segment_tree.GetMinUpdateAddTree;
import Project.segment_tree.GetSumUpdateSetTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
public class Main {

    @Test
    public void testGetMaxUpdateSetTree() {
        List<Long> longs = List.of(1L, 2L, 3L, 4L);
        SegmentProcessor<Long> longTree = new GetMaxUpdateSetTree(longs);
        System.out.println(longs);
        System.out.println(longTree.get(1, 4));

        longTree.update(0, 3, 100L);
        System.out.println(longTree.get(1, 4));
    }

    @Test
    public void testGetMinUpdateAddTree() {
        List<Integer> ints = List.of(1, 2, 3, 4);
        SegmentProcessor<Integer> intTree = new GetMinUpdateAddTree(ints);
        System.out.println(ints);
        System.out.println(intTree.get(1, 4));

        intTree.update(0, 3, 100);
        System.out.println(intTree.get(1, 4));
    }

    @Test
    public void testGetSumUpdateSetTree() {
        List<Double> doubles = List.of(1.5, -2.5, 3.4, 4.0);
        SegmentProcessor<Double> doubleTree = new GetSumUpdateSetTree(doubles);
        System.out.println(doubles);
        System.out.println(doubleTree.get(1, 4));

        doubleTree.update(0, 3, 100.0);
        System.out.println(doubleTree.get(1, 4));
    }

    @Test
    public void testCartesianTree() {
        var rainbow = List.of("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet");

        NavigableMultiSet<String> stringSet = new CartesianTree<>();
        rainbow.forEach(stringSet::add);

        System.out.println(stringSet.contains("Red"));
        System.out.println(stringSet.contains("Brown"));

        stringSet.remove("Red");

        System.out.println(stringSet.contains("Red"));
        System.out.println(stringSet.contains("Brown"));

        stringSet.add("Green");
        System.out.println(stringSet.contains("Green"));
        stringSet.remove("Green");
        System.out.println(stringSet.contains("Green"));
        stringSet.remove("Green");
        System.out.println(stringSet.contains("Green"));

        System.out.println(stringSet.lower("Green"));
        System.out.println(stringSet.higher("Purple"));
    }
}
