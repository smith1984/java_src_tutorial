package Cp_4;

class CharacterTest{
    public static void main(String[] args){
        char ch = '9';
        Character c1 = Character.valueOf(ch);
        System.out.println("ch = " + ch);
        System.out.println("c1.charValue() = " +
                c1.charValue());
        System.out.println("number of 'A' = " +
                Character.digit('A', 16));
        System.out.println("digit for 12 = " +
                Character.forDigit(12, 16));
        System.out.println("c1 = " + c1.toString());
        System.out.println("ch isDefined? " +
                Character.isDefined(ch));
        System.out.println("ch isDigit? " +
                Character.isDigit(ch));
        System.out.println("ch isIdentifierIgnorable? " +
                Character.isIdentifierIgnorable(ch));
        System.out.println("ch isISOControl? " +
                Character.isISOControl(ch));
        System.out.println("ch isJavaIdentifierPart? " +
                Character.isJavaIdentifierPart(ch));
        System.out.println("ch isJavaIdentifierStart? " +
                Character.isJavaIdentifierStart(ch));
        System.out.println("ch isLetter? " +
                Character.isLetter(ch));
        System.out.println("ch isLetterOrDigit? " +
                Character.isLetterOrDigit(ch));
        System.out.println("ch isLowerCase? " +
                Character.isLowerCase(ch));
        System.out.println("ch isSpaceChar? " +
                Character.isSpaceChar(ch));
        System.out.println("ch isTitleCase? " +
                Character.isTitleCase(ch));
        System.out.println("ch isUnicodeIdentifierPart? " +
                Character.isUnicodeIdentifierPart(ch));
        System.out.println("ch isUnicodeIdentifierStart? " +
                Character.isUnicodeIdentifierStart(ch));
        System.out.println("ch isUpperCase? " +
                Character.isUpperCase(ch));
        System.out.println("ch isWhitespace? " +
                Character.isWhitespace(ch));
    }
}