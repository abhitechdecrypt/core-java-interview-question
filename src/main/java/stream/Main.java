package stream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfNumber = Arrays.asList(12, 34, 34, 12, 8, 8920, 2385, 93, 2, 6, 8, 9, 0, 23);
        JavaStreamExample.separateOddEvenNumber(listOfNumber);
        JavaStreamExample.removeDuplicateFromList(listOfNumber);

        String inputString = "Java Concept Of The Day";
        JavaStreamExample.findFrequencyOfEchChar(inputString);

        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        JavaStreamExample.findFrequencyInList(stationeryList);

        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        JavaStreamExample.sortingDecimal(decimalList);
        JavaStreamExample.joiningString(stationeryList);

        JavaStreamExample.mergeTwoSortedArray(new int[]{12, 345, 1, 2}, new int[]{40, 34, 7, 2, 5, 8});

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        JavaStreamExample.getMinAndMaxToThree(listOfIntegers);

        JavaStreamExample.findSumOfAllDigit(123456);
        JavaStreamExample.sumOfAllNumber(listOfIntegers);
        JavaStreamExample.findSecondLargestNumber(listOfIntegers);

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        JavaStreamExample.sortStringOnLength(listOfStrings);

        int[] a = new int[]{45, 12, 56, 15, 24, 75, 31, 89};
        JavaStreamExample.arrFindSum(a);

        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        JavaStreamExample.commonElementBetweenTwoArray(list1, list2);

        String thoughts = "I hate someone. but i love more than that";
        JavaStreamExample.reverseString(thoughts);
        JavaStreamExample.reverseArray(a);

        List<String> strList = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        JavaStreamExample.numberStartWithDigit(strList);
    }


}
