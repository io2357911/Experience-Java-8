package academy.elqoo.java8.stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Stream8 {

    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        // return numbers.stream().map((v) -> (int)Math.sqrt(v)).collect(Collectors.toList());
        return numbers.stream().map(Math::sqrt).map(Double::intValue).collect(toList());
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user.stream().map(User::getAge).collect(toList());
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream().map(User::getAge).distinct().collect(toList());
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream().limit(limit).collect(toList());
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        return Long.valueOf(users.stream().filter(u -> u.getAge() > 25).count()).intValue();
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).collect(toList());
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream().reduce(0, Integer::sum);
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream().skip(toSkip).collect(toList());
    }

    public static List<String> getFirstNames(List<String> names) {
        throw new UnsupportedOperationException();
    }

    public static List<String> getDistinctLetters(List<String> names) {
        throw new UnsupportedOperationException();
    }


    public static String separateNamesByComma(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static double getAverageAge(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static Integer getMaxAge(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static Integer getMinAge(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static boolean anyMatch(List<User> users, int age) {
        throw new UnsupportedOperationException();
    }

    public static boolean noneMatch(List<User> users, int age) {
        throw new UnsupportedOperationException();
    }

    public static Optional<User> findAny(List<User> users, String name) {
        throw new UnsupportedOperationException();
    }

    public static List<User> sortByAge(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        throw new UnsupportedOperationException();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        throw new UnsupportedOperationException();
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        throw new UnsupportedOperationException();
    }

    public static User findOldest(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static int sumAge(List<User> users) {
        throw new UnsupportedOperationException();
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        throw new UnsupportedOperationException();
    }

}
