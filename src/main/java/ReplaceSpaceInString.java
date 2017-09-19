public class ReplaceSpaceInString {
    public String replaceSpace(String s) {
        if(s == null){
            return null;
        }

        if(s.length() == 0){
            return s;
        }

        int oldLength = s.length();
        char[] oldChars = s.toCharArray();
        int spaceCount = 0;
        for (char aChar : oldChars){
            if(aChar == ' '){
                spaceCount++;
            }
        }

        if(spaceCount == 0){
            return s;
        }

        int targetLength = oldLength + spaceCount * 2;
        char[] targetChars = new char[targetLength];
        oldLength--;
        targetLength--;

        while(oldLength >= 0){
            if(oldChars[oldLength] == ' '){
                targetChars[targetLength--] = '%';
                targetChars[targetLength--] = '0';
                targetChars[targetLength--] = '2';
            } else {
                targetChars[targetLength--] = oldChars[oldLength];
            }
            oldLength--;
        }

        return new String(targetChars);
    }
}
