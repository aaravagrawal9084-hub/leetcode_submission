
class Solution {
    public String removeOccurrences(String s, String part) {
        int index = s.indexOf(part);

        if (index == -1) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s);
        sb.delete(index, index + part.length());

        return removeOccurrences(sb.toString(), part);
    }
}
