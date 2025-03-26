package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamExample {

    private JavaStreamExample() {
    }

    /**
     * Given a list of integers, separate odd and even numbers?
     */
    public static void separateOddEvenNumber(List<Integer> numberList) {
        Map<Boolean, List<Integer>> separatedList = numberList
                .stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        // Extracting the value using the for loop
        for (Map.Entry<Boolean, List<Integer>> entry : separatedList.entrySet()) {
            if (Boolean.TRUE.equals(entry.getKey())) {
                System.out.println("Even List");
                System.out.println(entry.getValue());
            } else {
                System.out.println("Odd List");
                System.out.println(entry.getValue());
            }
        }
    }

    /**
     * 2) How do you remove duplicate elements from a list using Java 8 streams?
     * And also sort the number
     */

    public static void removeDuplicateFromList(List<Integer> numbers) {
        List<Integer> distinctNumber = numbers
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Distinct Number ::" + distinctNumber);
    }

    /**
     * 3) How do you find frequency of each character in a string using Java 8 streams?
     */

    public static void findFrequencyOfEchChar(String repeatingChar) {
        Map<Character, Long> characterLongMap = repeatingChar
                .chars()
                .mapToObj(c -> (char) c)
                .filter(i -> i != ' ') // This line of code is excluding the counting of the space
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // Below piece of code for sorting the entire object in descending order
        LinkedHashMap<Character, Long> sortedFrequency = characterLongMap.entrySet().stream().sorted(Map.Entry.<Character, Long>comparingByKey().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
        System.out.println(sortedFrequency);
        System.out.println(characterLongMap);
    }

    /**
     * 4) How do you find frequency of each element in an array or a list?
     */
    public static void findFrequencyInList(List<String> list) {
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }

    /**
     * 5) How do you sort the given list of decimals in reverse order?
     */

    public static void sortingDecimal(List<Double> list) {
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    /**
     * 6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
     */
    public static void joiningString(List<String> list) {
        String collect = list.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(list);
        System.out.println(collect);
    }

    /**
     * 9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?
     * and remove the duplicate from the sorted array
     */
    public static void mergeTwoSortedArray(int[] a, int[] b) {
        int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        Arrays.stream(array).forEach(System.out::println);
    }

    /**
     * 11) How do you get three maximum numbers and three minimum numbers from the given list of integers?
     */
    public static void getMinAndMaxToThree(List<Integer> listnumber) {
        //First find the first three minimum number
        listnumber.stream().sorted().limit(3).forEach(System.out::println);
        System.out.println("+".repeat(1200));
        listnumber.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }

    /**
     * 13) Find sum of all digits of a number in Java 8?
     */
    public static void findSumOfAllDigit(int number) {
        int sumOfAllNum = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println("Sum of all the digit of " + number + " is = " + sumOfAllNum);
    }

    /**
     * 14) find the sum of all the number form the list in java 8?
     */
    public static void sumOfAllNumber(List<Integer> number) {
        Integer sumOfAllNumber = number.stream().reduce(0, Integer::sum);
        System.out.println(sumOfAllNumber);
    }

    /**
     * 14) Find second largest number in an integer array?
     */
    public static void findSecondLargestNumber(List<Integer> list) {
        list.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("No second largest number found")
        );

    }

    /**
     * 15) Given a list of strings, sort them according to increasing order of their length?
     */
    public static void sortStringOnLength(List<String> listOfString) {
        listOfString.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }

    /**
     * 16) Given an integer array, find sum and average of all elements?
     */
    public static void arrFindSum(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
        Arrays.stream(arr).average().ifPresentOrElse(System.out::println,
                () -> System.out.println("No second largest number found"));
    }

    /**
     * 17) How do you find common elements between two arrays?
     */
    public static void commonElementBetweenTwoArray(List<Integer> list1, List<Integer> list2) {
        List<Integer> commonElement = list1.stream().filter(list2::contains).toList();
        System.out.println(commonElement);
    }

    /**
     * 18) Reverse each word of a string using Java 8 streams?
     */
    public static void reverseString(String str) {
        String reversedStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(reversedStr);
    }

    /**
     * 0) Reverse an integer array
     */
    public static void reverseArray(int[] arr) {
        int[] array = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
        System.out.println(Arrays.toString(array));
    }

    /**
     * 24) Given a list of strings, find out those strings which start with a number?
     */
    public static void numberStartWithDigit(List<String> list) {
        List<String> collect = list.stream().filter(str -> Character.isDigit(str.charAt(0))).toList();
        System.out.println(collect);
    }
}
