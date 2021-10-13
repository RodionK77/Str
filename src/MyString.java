import java.util.ArrayList;
import java.util.Arrays;

public final class MyString {
    private char[] string;

    public MyString() {
        this.string = null;
    }

    public MyString(char[] value) {
        this.string = value;
    }

    public MyString(MyString original) {
        this.string = original.string;
    }

    public MyString(String original) {
        string = original.toCharArray();
    }

    public boolean isEmpty() {
        return string.length == 0;
    }

    public int length() {
        return string.length;
    }

    public int compareTo(MyString anotherString) {
        char[] s1 = string;
        char[] s2 = anotherString.string;
        int i = 0;
        while (s1[i] == s2[i]) {
            i++;
            if (i >= s1.length || i >= s2.length) {
                i--;
                break;
            }
        }
        if (s1.length - s2.length != 0) return s1.length - s2.length;
        return Character.compare(s1[i], s2[i]);
    }

    public MyString trim() {
        StringBuilder str = new StringBuilder();
        for (char c : string) {
            if (c != ' ') {
                str.append(c);
            }
        }
        return new MyString(str.toString());
    }

    public MyString concat(MyString str1, MyString str2) {
        char[] result = new char[str1.string.length + str2.string.length];
        for (int i = 0; i < str1.string.length; i++) {
            result[i] = str1.string[i];
        }
        for (int i = str1.string.length; i < result.length; i++) {
            result[i] = str2.string[i - str1.string.length];
        }
        return new MyString(result);
    }

    public MyString substring(int beginIndex, int endIndex) {
        int length = length();
        checkBounds(beginIndex, endIndex, length);
        if (beginIndex == 0 && endIndex == length) {
            return this;
        }
        int subLen = endIndex - beginIndex;
        char[] newString = new char[subLen];
        for (int i = 0; i < subLen; i++) {
            newString[i] = string[beginIndex + i];
        }
        return new MyString(newString);
    }

    void checkBounds(int begin, int end, int length) {
        if (begin < 0 || begin > end || end > length) {
            throw new StringIndexOutOfBoundsException(
                    "begin " + begin + ", end " + end + ", length " + length);
        }
    }

    public char charAt(int i) {
        return string[i];
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (char c : string) {
            str.append(c);
        }
        return str.toString();
    }
}
