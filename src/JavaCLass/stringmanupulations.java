package JavaCLass;

import java.util.Iterator;

/**
 * 
 * The String class represents character strings. Allstring literals in Java
 * programs, such as "abc", areimplemented as instances of this class. Strings
 * are constant; their values cannot be changed after theyare created. String
 * buffers support mutable strings. Because String objects are immutable they
 * can be shared. For example:
 * 
 * String str = "abc";
 * 
 * 
 * is equivalent to:
 * 
 * char data[] = {'a', 'b', 'c'}; String str = new String(data);
 * 
 * 
 * Here are some more examples of how strings can be used:
 * 
 * System.out.println("abc"); String cde = "cde"; System.out.println("abc" +
 * cde); String c = "abc".substring(2, 3); String d = cde.substring(1, 2);
 * 
 * 
 * The class String includes methods for examiningindividual characters of the
 * sequence, for comparing strings, forsearching strings, for extracting
 * substrings, and for creating acopy of a string with all characters translated
 * to uppercase or tolowercase. Case mapping is based on the Unicode Standard
 * versionspecified by the Character class.
 * 
 * The Java language provides special support for the stringconcatenation
 * operator ( + ), and for conversion ofother objects to strings.
 * 
 * 
 * Unless otherwise noted, passing a null argument to a constructoror method in
 * this class will cause a NullPointerException to bethrown.
 * 
 * A String represents a string in the UTF-16 formatin which supplementary
 * characters are represented by surrogatepairs (see the section
 * UnicodeCharacter Representations in the Character class formore
 * information).Index values refer to char code units, so a
 * supplementarycharacter uses two positions in a String.
 * 
 * The String class provides methods for dealing withUnicode code points (i.e.,
 * characters), in addition to those fordealing with Unicode code units (i.e.,
 * char values).
 * 
 * Unless otherwise noted, methods for comparing Strings do not take localeinto
 * account. The java.text.Collator class provides methods forfiner-grain,
 * locale-sensitive String comparison. Since:1.0Author:Lee BoyntonArthur van
 * HoffMartin BuchholzUlf ZibisSee
 * Also:java.lang.Object.toString()java.lang.StringBufferjava.lang.StringBuilderjava.nio.charset.CharsetImpl
 * Note:The implementation of the string concatenation operator is left tothe
 * discretion of a Java compiler, as long as the compiler ultimately conformsto
 * The Java Language Specification. For example, the javac compilermay implement
 * the operator with StringBuffer, StringBuilder,or
 * java.lang.invoke.StringConcatFactory depending on the JDK version.
 * Theimplementation of string conversion is typically through the method
 * toString,defined by Object and inherited by all classes in Java.@jls15.18.1
 * String Concatenation Operator +
 *
 */
public class stringmanupulations {

	public static void main(String[] args) {

		String str = "Sunny like to study selenium";
		System.out.println(str.charAt(0));
		// Returns the char value at thespecified index. An index ranges from 0 to
		// length() - 1.
		// The first char value of the sequenceis at index 0,
		// the next at index 1,and so on, as for array indexing.

		System.out.println(str.length());
		/**
		 * Returns the length of this string. The length is equal to the number of
		 * Unicodecode units in the string.
		 */
		System.out.println(str.concat(" & java"));

		/**
		 * Concatenates the specified string to the end of this string. If the length of
		 * the argument string is 0, then this String object is returned. Otherwise, a
		 * String object is returned that represents a charactersequence that is the
		 * concatenation of the character sequencerepresented by this String object and
		 * the charactersequence represented by the argument string.
		 * 
		 * Examples:
		 * 
		 * "cares".concat("s") returns "caress" "to".concat("get").concat("her") returns
		 * "together"
		 * 
		 * 
		 */

		System.out.println("value:- " + str.compareTo("Sunny like to study selenium"));
		/**
		 * Compares two strings lexicographically.The comparison is based on the Unicode
		 * value of each character inthe strings. The character sequence represented by
		 * this String object is compared lexicographically to thecharacter sequence
		 * represented by the argument string. The result isa negative integer if this
		 * String objectlexicographically precedes the argument string. The result is
		 * apositive integer if this String object lexicographicallyfollows the argument
		 * string. The result is zero if the stringsare equal; compareTo returns 0
		 * exactly whenthe equals(Object) method would return true.
		 */
		System.out.println(str.toUpperCase());
		/**
		 * Converts all of the characters in this String to uppercase using the rules of
		 * the default locale. This method is equivalent to
		 * toUpperCase(Locale.getDefault()).
		 * 
		 * Note: This method is locale sensitive, and may produce unexpectedresults if
		 * used for strings that are intended to be interpreted
		 * localeindependently.Examples are programming language identifiers, protocol
		 * keys, and HTMLtags.For instance, "title".toUpperCase() in a Turkish
		 * localereturns "T\u005Cu0130TLE", where '\u005Cu0130' is theLATIN CAPITAL
		 * LETTER I WITH DOT ABOVE character.To obtain correct results for locale
		 * insensitive strings, use toUpperCase(Locale.ROOT).
		 * 
		 */
		System.out.println(str.compareToIgnoreCase("sunny"));
		if (str.compareToIgnoreCase("sunny") == 0) {
			System.out.println("value " + "true");

		} else {
			System.out.println("false");
		}
		/*
		 * Compares two strings lexicographically, ignoring casedifferences. This method
		 * returns an integer whose sign is that ofcalling compareTo with case folded
		 * versions of the stringswhere case differences have been eliminated by calling
		 * Character.toLowerCase(Character.toUpperCase(int)) oneach Unicode code point.
		 */
		System.out.println(str.toUpperCase().toLowerCase());

		/**
		 * This object (which is already a string!) is itself returned.
		 *
		 * @return the string itself.
		 */

		/**
		 * Converts all of the characters in this String to lowercase using the rules of
		 * the default locale. This is equivalent to calling
		 * toLowerCase(Locale.getDefault()).
		 * 
		 * Note: This method is locale sensitive, and may produce unexpectedresults if
		 * used for strings that are intended to be interpreted
		 * localeindependently.Examples are programming language identifiers, protocol
		 * keys, and HTMLtags.For instance, "TITLE".toLowerCase() in a Turkish
		 * localereturns "t\u005Cu0131tle", where '\u005Cu0131' is theLATIN SMALL LETTER
		 * DOTLESS I character.To obtain correct results for locale insensitive strings,
		 * use toLowerCase(Locale.ROOT).
		 * 
		 */
		System.out.println(str.contains("sunny like to study selenium"));

		/**
		 * Returns true if and only if this string contains the specified sequence of
		 * char values.
		 *
		 * @param s the sequence to search for
		 * @return true if this string contains {@code s}, false otherwise
		 * @since 1.5
		 */

		System.out.println(str.contentEquals("Sunny like to study selenium"));
		/**
		 * Compares this string to the specified CharSequence. Theresult is true if and
		 * only if this String represents thesame sequence of char values as the
		 * specified sequence. Note that if the CharSequence is a StringBuffer then the
		 * methodsynchronizes on it.
		 */
		System.out.println(str.endsWith("ium"));
		/**
		 * Tests if this string ends with the specified suffix.
		 *
		 * @param suffix the suffix.
		 * @return {@code true} if the character sequence represented by the argument is
		 *         a suffix of the character sequence represented by this object;
		 *         {@code false} otherwise. Note that the result will be {@code true} if
		 *         the argument is the empty string or is equal to this {@code String}
		 *         object as determined by the {@link #equals(Object)} method.
		 */
		System.out.println(str.startsWith("Su"));
		/**
		 * Tests if this string starts with the specified prefix.
		 *
		 * @param prefix the prefix.
		 * @return {@code true} if the character sequence represented by the argument is
		 *         a prefix of the character sequence represented by this string;
		 *         {@code false} otherwise. Note also that {@code true} will be returned
		 *         if the argument is an empty string or is equal to this {@code String}
		 *         object as determined by the {@link #equals(Object)} method.
		 * @since 1.0
		 */

		System.out.println(str.indexOf("selenium"));

		/**
		 * Returns the index within this string of the first occurrence of the specified
		 * character. If a character with value
		 */
		System.out.println(str.indexOf('s', 15));
		/**
		 * Returns the index within this string of the first occurrence of the specified
		 * character, starting the search at the specified index.
		 */
		System.out.println(str.lastIndexOf('s'));
		/**
		 * Returns the index within this string of the last occurrence of the specified
		 * character
		 */
		str.isEmpty();

		/**
		 * Returns {@code true} if, and only if, {@link #length()} is {@code 0}.
		 *
		 * @return {@code true} if {@link #length()} is {@code 0}, otherwise
		 *         {@code false}
		 *
		 * @since 1.6
		 */
		System.out.println(str.replace('S', 's'));
		/**
		 * Returns a string resulting from replacing all occurrences of
		 */
		System.out.println(str.replace("Sunny", "Shivender"));
		/**
		 * Replaces each substring of this string that matches the literal
		 * targetsequence with the specified literal replacement sequence.
		 * Thereplacement proceeds from the beginning of the string to the end,
		 * forexample, replacing "aa" with "b" in the string "aaa" will result in"ba"
		 * rather than "ab".
		 */

		System.out.println("Selenium Selenium".replaceAll("Selenium", "Sunny"));
		/**
		 * Replaces each substring of this string that matches the given regular
		 * expression with thegiven replacement.
		 * 
		 */

		// str.replaceFirst(str, str) HW
		System.out.println(str.substring(14));
		/**
		 * Returns a string that is a substring of this string. The substring begins
		 * with the character at the specified index and extends to the end of this
		 * string.
		 */
		System.out.println(str.substring(14, 20));
		/**
		 * Returns a string that is a substring of this string. The substring begins at
		 * the specified {@code beginIndex} and extends to the character at index
		 * {@code endIndex - 1}. Thus the length of the substring is
		 * {@code endIndex-beginIndex}.
		 */
		System.out.println(" Sunny is good learner ".trim());
		/**
		 * Returns a string whose value is this string, with all leadingand trailing
		 * space removed, where space is definedas any character whose codepoint is less
		 * than or equal to 'U+0020' (the space character).
		 */
		System.out.println(str.split(" "));
		/**
		 * it breaks the strings with given string value as a parameter and return the
		 * array of string[]
		 */
		String[] arraystring = str.split(" ");
		
//		for (int i = 0; i < arraystring.length; i++) {
//			System.out.println(i + " " + arraystring[i]);
//		}
		
//		for (String string :  str.split(" ")) {
//			System.out.println(string);
//		}

	}
}
