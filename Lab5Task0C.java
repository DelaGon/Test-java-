class Lab5Task0C{
	public static void main(String[] args){
		Language english = new Language(21, 5);
		Language arabic = new Language(29, 0);
		System.out.println(english.hasNoVowels());
		System.out.println(arabic.hasNoVowels());
	}
}