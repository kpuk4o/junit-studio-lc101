package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bonus_Binary_Search_Test {

    @Test
    public void intInArrayReturnsIndex() {
        int[] sortedArr = {1, 3, 5, 7, 27, 45, 77};
        assertEquals(3, BonusBinarySearch.binarySearch(sortedArr, 77));
    }

    @Test
    public void firstIntInArrayReturnsIndex() {
        int[] sortedArr = {1, 3, 5, 7, 27, 45, 77};
        assertEquals(0, BonusBinarySearch.binarySearch(sortedArr, 1));
    }

    @Test
    public void lastIntInArrayReturnsIndex() {
        int[] sortedArr = {1, 3, 5, 7, 27, 45, 77};
        assertEquals(6, BonusBinarySearch.binarySearch(sortedArr, 77));
    }

}
